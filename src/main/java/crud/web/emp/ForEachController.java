package crud.web.emp;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import crud.entity.Department;
import crud.entity.EmpJoinDeptJob;
import crud.entity.Employee;
import crud.entity.Jobtype;
import crud.service.EmployeeDeptJobService;

@Controller
@RequestMapping("/foreach")
@Transactional
public class ForEachController {

	private final EmployeeDeptJobService employeeDeptJobService;

	@Autowired
	public ForEachController(EmployeeDeptJobService employeeDeptJobService) {
		this.employeeDeptJobService = employeeDeptJobService;
	}
	// 一覧表示
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index(Model model) {
		List<EmpJoinDeptJob> employeeList = employeeDeptJobService.getEmpJoinDeptJobList();
		model.addAttribute("EMPLIST", employeeList);
		return "foreach/index";
	}
	// 1件表示
	@RequestMapping(value = "/disp/{id}", method = RequestMethod.GET)
	public String disp(@PathVariable("id") int id, Model model) {
		EmpJoinDeptJob employee = employeeDeptJobService.getEmpJoinDeptJob(id);
		model.addAttribute("EMP", employee);
		return "foreach/disp";
	}
	// 1件編集
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable("id") int id, Model model) {
		Employee employee = employeeDeptJobService.getEmployee(id);
		ForEachForm form = new ForEachForm();
		BeanUtils.copyProperties(employee, form);// source->targetにコピー
		model.addAttribute(form);
		return modelAndViewForEdit(model,form);
	}
	// 1件編集した情報を更新
	@RequestMapping(value = "/editupdate", method = RequestMethod.POST)
	public String editupdate(@Validated ForEachForm form, BindingResult bindingResult, Model model,
			RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			return modelAndViewForEdit(model,form);
		}
		Employee emp = new Employee();
	System.out.println("Employeeつううか");
		BeanUtils.copyProperties(form, emp);// source->targetにコピー
		System.out.println("Employee source->targetコピー官僚");
		System.out.println();

		employeeDeptJobService.update(emp);
		redirectAttributes.addFlashAttribute("msg", "更新しました");
		return "redirect:/foreach"; // リダイレクト先はURL
	}
	// 1件削除
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") int id, RedirectAttributes redirectAttributes) {
		employeeDeptJobService.delete(id);
		redirectAttributes.addFlashAttribute("msg", "削除しました");
		return "redirect:/foreach"; // リダイレクト先はURL
	}
	// 新規登録
	@RequestMapping(value = "/newdata", method = RequestMethod.GET)
	public String newData(Model model) {
		ForEachForm form = new ForEachForm();
		form.setJobtypeId(1);// 職種初期値を1に設定
		form.setDepartmentId(1);// 部門初期値を1に設定
		form.setHiredate(new Date(new java.util.Date().getTime()));// 雇用日初期値を本日に設定
		return modelAndViewForNew(model,form);
	}
	// 新規登録確認
	@RequestMapping(value = "/confirm", method = RequestMethod.POST)
	public String confirm(@Validated ForEachForm form, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return modelAndViewForNew(model,form);
		}
		return "foreach/confirm";
	}
	// 新規登録実行
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(ForEachForm form, @RequestParam("btnName") String btnName, BindingResult bindingResult,
			Model model, RedirectAttributes redirectAttributes) {
		if ("戻る".equals(btnName)) {// 戻るボタン押下
			return modelAndViewForNew(model,form);
		} else {
			Employee emp = new Employee();
			BeanUtils.copyProperties(form, emp);// source->targetにコピー
			employeeDeptJobService.insert(emp);
			redirectAttributes.addFlashAttribute("msg", "登録しました");
			return "redirect:/foreach"; // リダイレクト先はURL
		}
	}
	// 共通処理メソッド（selectBox用リストデータ作成）edit.htmlへ遷移
	private String modelAndViewForEdit(Model model,ForEachForm form) {
		List<Jobtype> jobtypeList = employeeDeptJobService.getJobTypeList();
		List<Department> deptList = employeeDeptJobService.getDepartmentList();
		model.addAttribute("JOBTYPELIST", jobtypeList);
		model.addAttribute("DEPTLIST", deptList);
		model.addAttribute(form);
		return "foreach/edit";
	}
	// 共通処理メソッド（selectBox用リストデータ作成）new.htmlへ遷移
	private String modelAndViewForNew(Model model,ForEachForm form) {
		List<Jobtype> jobtypeList = employeeDeptJobService.getJobTypeList();
		List<Department> deptList = employeeDeptJobService.getDepartmentList();
		model.addAttribute("JOBTYPELIST", jobtypeList);
		model.addAttribute("DEPTLIST", deptList);
		model.addAttribute(form);
		return "foreach/new";
	}
}