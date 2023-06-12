package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.BolsilloDigitalDao;
import models.BolsilloDigitalVo;

public class BolsilloDigital extends HttpServlet {

    BolsilloDigitalVo r = new BolsilloDigitalVo();
    BolsilloDigitalDao rd = new BolsilloDigitalDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion = req.getParameter("accion");
        System.out.println(accion);

        switch (accion) {

             case "Home":
            req.getRequestDispatcher("Home.jsp").forward(req, resp);
            break;

            case "Registrar":
            req.getRequestDispatcher("Registrar.jsp").forward(req, resp);
            break;

            case "Nequi":
            req.getRequestDispatcher("Nequi.jsp").forward(req, resp);
            break;

            case "Daviplata":
            req.getRequestDispatcher("Daviplata.jsp").forward(req, resp);
            break;

            case "dashboard":
            req.getRequestDispatcher("dashboard.jsp").forward(req, resp);
            break;

            case "Recargar":
            req.getRequestDispatcher("Recargar.jsp").forward(req, resp);
            break;

            case "Consultar":
            req.getRequestDispatcher("Consultar.jsp").forward(req, resp);
            break;

            case "Retirar":
            req.getRequestDispatcher("Retirar.jsp").forward(req, resp);
            break;

            case "BolsilloDigital":
                req.getRequestDispatcher("BolsilloDigital.jsp").forward(req, resp);
                break;
            case "BolsilloDigital-add":
                req.getRequestDispatcher("BolsilloDigital-add.jsp").forward(req, resp);
                break;
            case "abrirForm":
                abrirForm(req, resp);
                break;
            case "listar":
                listar(req, resp);
                break;

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoPost");
        String accion = req.getParameter("accion");

        switch (accion) {
            case "add":
                
              //  nombre_Usua = req.getParameter("Nombre_Usua");
                add(req, resp);
                break;
            case "modificar":
                modificar(req, resp);
                break;
           

        }
    }

    private void abrirForm(HttpServletRequest req, HttpServletResponse resp) {
        try {
            req.getRequestDispatcher("BolsilloDigital-add.jsp").forward(req, resp);
            System.out.println("El formulario ha sido abierto");
        } catch (Exception e) {
            System.out.println("El formulario NO ha sido abierto" + e.getMessage().toString());
        }
    }

    private void add(HttpServletRequest req, HttpServletResponse resp) {
        r = new BolsilloDigitalVo();

        String Id_BolsilloDigital = "";
        String nombre_Bolsillo = req.getParameter("nombre_Bolsillo");
        if (nombre_Bolsillo != null) {
            r.setNombre_Bolsillo(req.getParameter("nombre_Bolsillo"));
        }
        
        try {
            rd.registrar(r);
            //sys
        } catch (Exception e) {
            System.out.println("Error en la inserción del registro " + e.getMessage().toString());
        }

    }

    private void modificar (HttpServletRequest req, HttpServletResponse resp) {
        r = new BolsilloDigitalVo();

        String Id_BolsilloDigital = "";
        String nombre_Bolsillo = req.getParameter("nombre_Bolsillo");
        if (nombre_Bolsillo != null) {
            r.setNombre_Bolsillo(req.getParameter("nombre_Bolsillo"));
        }
       
        try {
            rd.modificar(r);
            //sys
        } catch (Exception e) {
            System.out.println("Error en la inserción del registro " + e.getMessage().toString());
        }

    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    private void listar(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List BolsilloDigital = rd.listar();
            req.setAttribute("BolsilloDigital", BolsilloDigital);
            req.getRequestDispatcher("BolsilloDigital.jsp").forward(req, resp);
            System.out.println("Datos listados correctamente");
        } catch (Exception e) {
            System.out.println("Hay problemas al listar los datos " + e.getMessage().toString());
        }
    }




}
