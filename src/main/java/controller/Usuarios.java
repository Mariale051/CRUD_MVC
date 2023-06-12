package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.UsuariosDao;
import models.UsuariosVo;

public class Usuarios extends HttpServlet {

    UsuariosVo r = new UsuariosVo();
    UsuariosDao rd = new UsuariosDao();

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

            case "Usuarios":
                req.getRequestDispatcher("Usuarios.jsp").forward(req, resp);
                break;
            case "Usuario-add":
                req.getRequestDispatcher("Usuario-add.jsp").forward(req, resp);
                break;
            case "Usuario-eli":
                req.getRequestDispatcher("Usuario-eli.jsp").forward(req, resp);
                break;
            case "Usuario-modificar":
                req.getRequestDispatcher("Usuario-modificar.jsp").forward(req, resp);
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
        String accion=req.getParameter("accion");
    

            Nequi nequi = new Nequi();
    
    switch (accion) {
        case "Recargar":
            double recarga = Double.parseDouble(req.getParameter("Recarga"));
            nequi.setRecarga(recarga);
            double saldoRecargado = nequi.Recargar();
            req.setAttribute("Recargar", saldoRecargado);
            req.getRequestDispatcher("Recargar.jsp").forward(req, resp);
            break;

        case "Retirar":
            double retira = Double.parseDouble(req.getParameter("Retirar"));
            nequi.setRetira(retira);
            double saldoRetirado = nequi.Retirar();
            req.setAttribute("Retirar", saldoRetirado);
            req.getRequestDispatcher("Retirar.jsp").forward(req, resp);
            break;

        case "Consultar":
            double Saldo = nequi.Consultar();
            req.setAttribute("Consultar", Saldo);
            req.getRequestDispatcher("Consultar.jsp").forward(req, resp);
            break;

        case "Nequi":
            String username = req.getParameter("username"); 
            String password = req.getParameter("password");
        
            
            if (username.equals("Maria") && password.equals("123456")) {
                req.getRequestDispatcher("dashboard.jsp").forward(req, resp);  
            } else {
                req.getRequestDispatcher("Nequi.jsp").forward(req, resp); 
            }

            break;

            case "Daviplata":
            String usernamee = req.getParameter("usernamee"); 
            String passwordd = req.getParameter("passwordd");
        
            
            if (usernamee.equals("Alejandra") && passwordd.equals("1234")) {
                req.getRequestDispatcher("dashboard.jsp").forward(req, resp);  
            } else {
                req.getRequestDispatcher("Daviplata.jsp").forward(req, resp); 
            }
        break;
            case "add":
                add(req, resp);
                break;

            case "mol":
                mol(req, resp);
                break;

        }

    }

    private void abrirForm(HttpServletRequest req, HttpServletResponse resp) {
        try {
            req.getRequestDispatcher("Usuario-add.jsp").forward(req, resp);
            System.out.println("El formulario ha sido abierto");
        } catch (Exception e) {
            System.out.println("El formulario NO ha sido abierto" + e.getMessage().toString());
        }
    }

    private void add(HttpServletRequest req, HttpServletResponse resp) {
        r = new UsuariosVo();

        String Id = "";
        String nombre_Usua = req.getParameter("Nombre_Usua");
        String apellido_Usua = req.getParameter("apellido_Usua");
        String telefono_Usua = req.getParameter("Telefono_Usua");
        String correo_Usua = req.getParameter("Correo_Usua");
        String password = req.getParameter("password_u");
        System.out.println("La contraseña recibida afuera del if fue " + password);
        boolean Estado_Usua = false;
        if (nombre_Usua != null) {
            r.setNombre_Usua(req.getParameter("Nombre_Usua"));
        }
        if (apellido_Usua != null) {
            r.setApellido_Usua(req.getParameter("apellido_Usua"));
        }
        if (telefono_Usua != null) {
            int telefono = Integer.parseInt(telefono_Usua);
            r.setTelefono_Usua(telefono);
        }
        if (correo_Usua != null) {
            r.setCorreo_Usua(req.getParameter("Correo_Usua"));
        }
        if (password != null) {
            int i_password = Integer.parseInt(password);
            r.setContraseña_Usua(i_password);
            System.out.println("La contraseña recibida dentro del if fue " + password);
        }
        if (req.getParameter("Estado_Usua") != null) {
            r.setEstado_Usua(true);
        } else {
            r.setEstado_Usua(false);
        }
        try {
            rd.registrar(r);
            // sys
        } catch (Exception e) {
            System.out.println("Error en la inserción del registro " + e.getMessage().toString());
        }

    }


    private void mol (HttpServletRequest req, HttpServletResponse resp) {

        if(req.getParameter("nombre_Usua")!=null){
            r.setNombre_Usua(req.getParameter("nombre_Usua"));
        }
        if(req.getParameter("apellido_Usua")!=null){
            r.setApellido_Usua(req.getParameter("apellido_Usua"));
        }
       if(req.getParameter("telefono_Usua")!=null){
            r.setTelefono_Usua(Integer.parseInt(req.getParameter("telefono\u00F1a_Usua")));
        }
        if(req.getParameter("correo_Usua")!=null){
            r.setCorreo_Usua(req.getParameter("correo_Usua"));
        }
        if(req.getParameter("contraseña_Usua")!=null){
            r.setContraseña_Usua(Integer.parseInt(req.getParameter("contrase\u00F1a_Usua")));
        }
        if(req.getParameter("estado")!=null){
            r.setEstado_Usua(true);
        }
        else{
            r.setEstado_Usua(false);
        }
        try {
            rd.modificar(r);
            List Usuarios=rd.listar();
            req.setAttribute("usuarios", Usuarios);
            System.out.println("Modificar ");
            listar(req, resp);
        } catch (Exception e) {
            System.out.println("Error en la modificacion del registro "+e.getMessage().toString());
        }
    }


    private void listar(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List Usuarios = rd.listar();
            req.setAttribute("Usuarios", Usuarios);
            req.getRequestDispatcher("Usuarios.jsp").forward(req, resp);
            System.out.println("Datos listados correctamente");
        } catch (Exception e) {
            System.out.println("Hay problemas al listar los datos " + e.getMessage().toString());
        }
    }

}
