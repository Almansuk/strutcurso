package com.mycompany.mysystem;

import com.opensymphony.xwork2.ActionSupport;
import com.mycompany.services.Service;

public class MyAction extends ActionSupport {
    private Service service;

    // Variable para pasar datos a la página
    private String message;

    // Setter para la inyección de dependencia
    public void setService(Service service) {
        this.service = service;
    }

    // Getter para el mensaje (usado en la página JSP)
    public String getMessage() {
        return message;
    }

    @Override
    public String execute() {
        // Lógica del servicio
        service.executeService();

        // Preparar datos para la vista
        message = "El servicio se ejecutó correctamente.";
        return SUCCESS;
    }
}