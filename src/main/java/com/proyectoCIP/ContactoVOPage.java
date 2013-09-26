package com.proyectoCIP;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class ContactoVOPage extends WebPage {
	
	private static final long serialVersionUID = 1L;

	public ContactoVOPage(final PageParameters parameters) {
		super(parameters);

		Form formulario = new Form("formulario") {
	        protected void onSubmit() {
	            info("Form.onSubmit executed");
	        }
	    };

	    Button btnGuardar = new Button("btnGuardar") {
	        public void onSubmit() {
	            System.out.println("Holaaaaaaaaaaaa");
	        }
	    };
	    formulario.add(btnGuardar);
	    
	    Button btnBorrar = new Button("btnBorrar") {
	        public void onSubmit() {
	            info("btnBorrar.onSubmit executed");
	        }
	    };
	    formulario.add(btnBorrar);
	    
		formulario.add(new Label("lblDireccion", "Dirección:"));
		formulario.add(new Label("lblTelefono", "Teléfono:"));
		formulario.add(new Label("lblCorreo", "Correo:"));
		
		formulario.add(new TextField("direccion"));
		formulario.add(new TextField("telefono"));
		formulario.add(new TextField("correo"));

	    add(formulario);

		// TODO Add your page's components here

    }

}
