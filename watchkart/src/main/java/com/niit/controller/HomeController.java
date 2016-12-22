package com.niit.controller;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.gson.Gson;
import com.niit.watchkart_backend.Dao.CartDao;
import com.niit.watchkart_backend.Dao.CategoryDao;
import com.niit.watchkart_backend.Dao.ProductDao;
import com.niit.watchkart_backend.Dao.SupplierDao;
import com.niit.watchkart_backend.Dao.UserDetailsDao;
import com.niit.watchkart_backend.Dao.UsersDao;
import com.niit.watchkart_backend.model.Cart;
import com.niit.watchkart_backend.model.Category;
import com.niit.watchkart_backend.model.Product;
import com.niit.watchkart_backend.model.Supplier;
import com.niit.watchkart_backend.model.UserDetails;
import com.niit.watchkart_backend.model.Users;

@Controller
public class HomeController {

	private Path path;

	@Autowired
	UsersDao usersDao;

	@Autowired
	Users users;

	@Autowired
	ProductDao productDao;
	@Autowired
	Product product;

	@Autowired
	SupplierDao supplierDao;
	@Autowired
	Supplier supplier;

	@Autowired
	CategoryDao categoryDao;
	@Autowired
	Category category;

	@Autowired
	CartDao cartDao;
	@Autowired
	Cart cart;

	@Autowired
	UserDetailsDao userdetailsDao;
	@Autowired
	UserDetails userdetails;

	@RequestMapping("/")
	public String getIndex() {
		return "index";
	}

	@RequestMapping("/admin")
	public String getadmin() {
		return "admin";
	}

	@RequestMapping("Back")
	public String getBack() {
		return "Landing";
	}
	
	@RequestMapping("back1")
	public String getB()
	{
		return "ProductForm";
	}
	//
	// @RequestMapping("Landing")
	// public String getLanding()
	// {
	// return "Landing";
	// }

	//
	// @RequestMapping("returnback")
	// public String getAdmin()
	// {
	// return "admin";
	// }
	@RequestMapping("/supplier")
	public String getSupplier1() {
		return "ProductForm";
	}

	@RequestMapping("ProductForm")
	public String getProduct() {
		return "ProductForm";
	}

	@RequestMapping("ProductForm1")
	public String getPro() {
		return "ProductForm1";
	}

	@RequestMapping("signin")
	public String getsignin() {
		return "signin";
	}

	@RequestMapping("signup")
	public ModelAndView getsignup() {
		ModelAndView mv = new ModelAndView("signup");
		mv.addObject("user", userdetails);
		return mv;
	}

	@RequestMapping("/user-landing")
	public String getUserlanding() {
		return "/user-landing";
	}

	@RequestMapping("user-moreinfo")
	public String getUsermore() {
		return "user-moreinfo";
	}

	// @RequestMapping("CartTable")
	// public String getU() {
	// return "CartTable";
	// }
   @RequestMapping("CartTable")
   public String getcarttable1()
   {
	   return "CartTable";
   }
	@RequestMapping("user-shippingdetails")
	public ModelAndView getshipping() {
		ModelAndView mv = new ModelAndView("user-shippingdetails");
		mv.addObject("ship", userdetails);
		return mv;
	}

	@RequestMapping("user-paymentdetails")
	public String getUserpayment() {
		return "user-paymentdetails";
	}

	@RequestMapping("user-success")
	public String getusersuccess() {
		return "user-success";
	}

	@RequestMapping("getUsers")
	public ModelAndView getUsers() {
		List<Users> ulst = usersDao.getAll();
		ModelAndView mv = new ModelAndView("UserTable");
		mv.addObject("users", ulst);
		return mv;
	}

	@RequestMapping("SupTable")
	public String getSup() {
		return "SupTable";
	}

	@RequestMapping("ProTable")
	public String getProtable() {
		return "ProTable";
	}

	@RequestMapping("UserDetailsTable")
	public String getUserDetailsTable() {
		return "UserDetailsTable";
	}

	@RequestMapping("confirmDetails")
	public String getconfirmdetails() {
		return "confirmDetails";
	}

	@RequestMapping("delUsr")
	public ModelAndView deleteUser(@RequestParam(value = "uid") int uid) {
		ModelAndView mv = new ModelAndView("UserTable");
		usersDao.delUsers(uid);
		mv.addObject("msg", "Deleted Successfully");
		return mv;
	}
	// @RequestMapping("getProduct")
	// public ModelAndView getProduct()
	// {
	// List<Product> ulst= productDao.getAll();
	// ModelAndView mv=new ModelAndView("ProTable");
	// mv.addObject("product", ulst);
	// return mv;
	// }

	// @RequestMapping("delPro")
	// public ModelAndView deleteProduct(@RequestParam(value="pid") String pid)
	// {
	// ModelAndView mv=new ModelAndView("ProTable");
	// productDao.delProduct(pid);
	// mv.addObject("msg", "Deleted Successfully");
	// return mv;
	// }
	@RequestMapping("getSupplier")
	public ModelAndView getSupplier() {
		List<Supplier> ulst = supplierDao.getAll();
		ModelAndView mv = new ModelAndView("SupTable");
		mv.addObject("supplier", ulst);
		return mv;
	}

	@RequestMapping("delSup")
	public ModelAndView deleteSupplier(@RequestParam(value = "sid") String sid) {
		ModelAndView mv = new ModelAndView("SupTable");
		supplierDao.delSupplier(sid);
		mv.addObject("msg", "Deleted Successfully");
		return mv;
	}

	// @RequestMapping("getCategory")
	// public ModelAndView getCategory()
	// {
	// List<Category> ulst= categoryDao.getAll();
	// ModelAndView mv=new ModelAndView("CatTable");
	// mv.addObject("category", ulst);
	// return mv;
	// }
	//
	@RequestMapping("delCat")
	public ModelAndView deleteCategory(@RequestParam(value = "cid") String cid) {
		ModelAndView mv = new ModelAndView("CatTable");
		categoryDao.delCategory(cid);
		mv.addObject("msg", "Deleted Successfully");
		return mv;
	}

	@RequestMapping("getCart")
	public ModelAndView getCarta() {
		List<Cart> ulst = cartDao.getAll();
		ModelAndView mv = new ModelAndView("CartTable");
		mv.addObject("cart", ulst);
		return mv;
	}

	//
	// @RequestMapping("delCart")
	// public ModelAndView deleteCart(@RequestParam(value="cid") int cid)
	// {
	// ModelAndView mv=new ModelAndView("CartTable");
	// cartDao.delCart(cid);
	// mv.addObject("msg", "Deleted Successfully");
	// return mv;
	// }
	@RequestMapping("getUserDetails")
	public ModelAndView getUserDetails() {
		List<UserDetails> ulst = userdetailsDao.getAll();
		ModelAndView mv = new ModelAndView("UserDetailsTable");
		mv.addObject("userdetails", ulst);
		return mv;
	}

	@RequestMapping("delUserDetails")
	public ModelAndView deleteUserDetails(@RequestParam(value = "uid") int uid) {
		ModelAndView mv = new ModelAndView("UserDetailsTable");
		userdetailsDao.delUserDetails(uid);
		mv.addObject("msg", "Deleted Successfully");
		return mv;
	}

	// @RequestMapping ("addform")
	// public ModelAndView shoform()
	// {
	// ModelAndView mv = new ModelAndView("ProductForm");
	// mv.addObject("prod",product);
	// return mv;
	// }
	//// @Autowired
	//// ProductDao productDao;
	////
	// @RequestMapping ("insertprod")
	// public String storeprod(@ ModelAttribute ("prod") Product product,final
	// RedirectAttributes redirectAttributes)
	// {
	// redirectAttributes.addFlashAttribute("message", "true");
	// redirectAttributes.addFlashAttribute("prod", product);
	// productDao.insertORupdate(product);
	// return "redirect:/supplier";
	// }

	@RequestMapping("addform")
	public ModelAndView showform() {
		ModelAndView mv = new ModelAndView("ProductForm1");
		product.setPname("Heyyyyyyyyyyy");
		mv.addObject("product", product);
		return mv;
	}

	@RequestMapping("insertprod")
	public String storeprod(@ModelAttribute("product") Product product, BindingResult result,
			HttpServletRequest request, final RedirectAttributes redirectAttributes) {
		System.out.println("after submit");
		redirectAttributes.addFlashAttribute("message", "true");
		redirectAttributes.addFlashAttribute("prod", product);
		// prod.setPid("655");
		System.out.println("SSSSSSSSSS " + product.getPid());
		System.out.println("NNNNNNNNNNN " + product.getPname());

		productDao.insertORupdate(product);
		MultipartFile itemimage = product.getImg();
		String rootdir = request.getSession().getServletContext().getRealPath("/");
		System.out.println("UUUUUUUUUUUUUUUUU " + rootdir);
		path = Paths.get(rootdir + "resources/includes/img/" + product.getPid() + ".jpg");

		if (itemimage != null && !itemimage.isEmpty()) {
			try {
				System.out.println("00000000000000000000000000000" + path.toString());
				itemimage.transferTo(new java.io.File(path.toString()));
				;
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("product image saving failed", e);
			}
		}

		return "redirect:/supplier";

	}

	@RequestMapping("insertuser")
	public String storeuser(@ModelAttribute("user") UserDetails userDetails,
			final RedirectAttributes redirectAttributes) {
		// redirectAttributes.addAttribute("message", "true");
		// redirectAttributes.addAttribute("user",userDetails);
		System.out.println("DOne " + userDetails.getName());
		userdetailsDao.insertORupdate(userDetails);
		users.setUid(userDetails.getUid());
		users.setPwd(userDetails.getPwd());
		users.setRole("ROLE_USER");
		usersDao.insertORupdate(users);
		System.out.println("Done rrrrrrrrrrrrrrr ");
		return "redirect:/signup";
	}

	@RequestMapping("insertdetails")
	public String storeuserd(@ModelAttribute("ship") UserDetails userDetails,
			final RedirectAttributes redirectAttributes) {
		// redirectAttributes.addAttribute("message","true");
		// redirectAttributes.addAttribute("ship",userDetails);
		System.out.println("Done " + userDetails.getName());
		userdetailsDao.insertORupdate(userDetails);
		System.out.println("Done ppppppppppp");
		return "redirect:/user-shippingdetails";
	}

	@RequestMapping(value = "/userview")
	public ModelAndView list(HttpServletRequest request) {
		List<Product> itemList = productDao.getAll();
		ModelAndView model = new ModelAndView("user-landing");

		Path path = null;
		String rootdir = request.getSession().getServletContext().getRealPath("/");
		// System.out.println("UUUUUUUUUUUUUUUUU "+rootdir);
		path = Paths.get(rootdir + "resources/includes/img");
		String imgPath = path.toString();
		model.addObject("imp", imgPath);
		model.addObject("itemList", itemList);
		return model;
	}

	//
	// @RequestMapping(value="addtocart")
	// public String edit(@RequestParam(value="id") int
	// id,@RequestParam(value="nam") String nam,final RedirectAttributes
	// redirectAttributes) {
	//
	// ModelAndView model = new ModelAndView("user-Carttable");
	// List<Product> itemlist = productDao.getAll();
	// model.addObject("itemlist", itemlist);
	// System.out.println(id+" ooooooooooo "+nam);
	//
	// product= productDao.getProduct(id);
	// System.out.println("line printing");
	// cart.setProd_id(product.getPid());
	// System.out.println("line was not printing");
	// cart.setProd_name(product.getPname());
	//// cart.setPname(product.getPname());
	// cart.setProd_price(product.getPprice());
	//
	// cartDao.insertORupdate(cart);
	// return "redirect:/user-Carttable";
	// }

	@RequestMapping("edit.do")
	public ModelAndView editprod(@ModelAttribute("product") Product product,
			@RequestParam(value = "pid", required = true) int pid, final RedirectAttributes redirectAttributes) {
		product.setPid(pid);
		// product=productDao.getProduct(pid);
		System.out.println("Done Here 1");
		ModelAndView mv = new ModelAndView("ProductForm1", "product", product);
		mv.addObject("product", product);
		System.out.println("Done Here 2");
		return mv;
	}

	@RequestMapping("sdel")
	public String getSdel(@ModelAttribute("product") Product product,
			@RequestParam(value = "val", required = false, defaultValue = "") int pid,
			final RedirectAttributes redirectAttributes) {

		productDao.delProduct(pid);
		System.out.println("deleted " + pid);

		return "redirect:/supplier";

	}

	@RequestMapping("shoProduct")
	public ModelAndView shoSinglePro(@RequestParam(value = "pid") int pid) {
		ModelAndView mv = new ModelAndView("user-moreinfo");
		System.out.println(pid + " DONE ");
		product = productDao.getProduct(pid);
		mv.addObject("cart", cart);
		mv.addObject("product", product);
		return mv;
	}

	@RequestMapping("addtocart")
	public String storecart(@ModelAttribute("product") Product product, @RequestParam(value = "nam") String nam,
			final RedirectAttributes redirectAttributes) {

		ModelAndView model = new ModelAndView();
		model.addObject("product", product);
		product = productDao.getProduct(product.getPid());
		int x = product.getPid();
		cart.setCid(product.getPid());
		cart.setProd_id(product.getPid());
		cart.setProd_name(product.getPname());
		cart.setProd_price(product.getPprice());
		cart.setUsername(nam);
		cartDao.insertORupdate(cart);
		return "redirect:/user-carttable?nam=" + nam;
	}

	@RequestMapping("user-carttable")
	public ModelAndView getCartTable1(@RequestParam(value = "nam") String nam) {
		ModelAndView mv = new ModelAndView("CartTable");
		List<Cart> lstCart = cartDao.getAllbyUser(nam);
		mv.addObject("items", lstCart);
		return mv;

	}

	@RequestMapping(value = "/shipping", method = RequestMethod.GET)
	public String getsform(@RequestParam("cid") int cid) {
		ModelAndView mv = new ModelAndView("user-shippingdetails");
		userdetails.setCart_id(cid);
		
		System.out.println(cid);
		System.out.println("DoneOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
		return "redirect:/checkout?cid=" + cid;
	}

	@RequestMapping("abc")
	public String delByCartId( @RequestParam(value = "nam") String nam,
			@RequestParam(value = "cid") int cid, final RedirectAttributes redirectAttributes) {
		cartDao.delCart(cid);
//		product = productDao.getProduct(pid);
		System.out.println("DONEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
		return "redirect:/CartTable";
//		return "redirect:/userview=" + nam;
	}

}
