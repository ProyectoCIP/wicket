package com.proyectoCIP;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class ContactoVOPage extends WebPage {
	
	private static final long serialVersionUID = 1L;

	public ContactoVOPage(final PageParameters parameters) {
		super(parameters);
		
		
		add(new Label("lblDireccion", "Dirección:"));
	    add(new Label("lblTelefono", "Teléfono:"));
	    add(new Label("lblCorreo", "Correo:"));
		
	    add(new TextField("direccion"));
	    add(new TextField("telefono"));
	    add(new TextField("correo"));
	    
	    FeedbackPanel feedbackPanel = new FeedbackPanel("leyenda");
	    add(feedbackPanel);
		
	    Form formulario = new Form("formulario") {
	    	protected void onSubmit() {
	            info("sabeloooo");
	        }
		};
	    
	    AjaxButton btnGuardar = new AjaxButton("btnGuardar") {
	    	 public void onClick(AjaxRequestTarget target) {
	    		 target.add(new TextField("direccion"));
	                // add the components that need to be updated to 
	                // the target
	            }
	    };
	    
	    
	    
	    
	    formulario.add(btnGuardar);
	    
	    Button btnBorrar = new Button("btnBorrar") {
	        public void onClick() {
	            info("btnBorrar.onSubmit executed");
	        }
	    };
	    formulario.add(btnBorrar);
	    
	    

	    add(formulario);

		// TODO Add your page's components here

    }

}
