package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Articolo;
import model.Movimento;

import java.awt.image.DataBuffer;
import java.io.IOException;

import DB.Movimenti;


@WebServlet("/movimenti")
public class MovimentiSvt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MovimentiSvt() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("Movimenti", Movimenti.getALL());
		
		request.getRequestDispatcher("listMovimenti.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("descrizione")!= null) {
			String descrizione = request.getParameter("descrizione");
			int quantita = Integer.parseInt(request.getParameter("quantita"));
			int idArticolo = Integer.parseInt(request.getParameter("articolo"));
			Articolo articolo = DB.Articoli.getALL().get(idArticolo);
	Movimento m=new Movimento(descrizione, quantita, articolo);
	DB.Movimenti.addMovimento(m);
		}
		doGet(request, response);
	}

}
