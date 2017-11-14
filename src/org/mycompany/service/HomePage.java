package org.mycompany.service;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.FormComponentUpdatingBehavior;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.Model;

public class HomePage extends WebPage {

	private Form<Void> form;
	private DropDownChoice<User> UsersList;

	public HomePage(){   
		Model<User> listModel = new Model<User>(); 
		ChoiceRenderer<User> UserRender = new ChoiceRenderer<User>("fullName");
  UsersList = new DropDownChoice<User>("users", listModel, User.loadUsers(), UserRender); 
  UsersList.add(new FormComponentUpdatingBehavior());
 add(UsersList);
  form = new Form<Void>("form", new CompoundPropertyModel(listModel)){
	  @Override
	protected void onSubmit() {
		// TODO Auto-generated method stub
		super.onSubmit();
	}
  };  
  form.add(new TextField("username"));
  form.add(new TextField("password")); 
 add(form);
 
 }
}