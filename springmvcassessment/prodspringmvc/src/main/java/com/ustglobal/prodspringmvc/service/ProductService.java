package com.ustglobal.prodspringmvc.service;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import com.ustglobal.prodspringmvc.bean.OrderProduct;
import com.ustglobal.prodspringmvc.bean.Product;
import com.ustglobal.prodspringmvc.bean.User;

public interface ProductService {
	public User login(String email,String password);
	public boolean register(User user);
	public Product search(String pname);
	public boolean updatePassword(String email,String password);
	public List<OrderProduct> getProducts(String email);
	public boolean buyProduct(User user,Product product,int quantity);
}
