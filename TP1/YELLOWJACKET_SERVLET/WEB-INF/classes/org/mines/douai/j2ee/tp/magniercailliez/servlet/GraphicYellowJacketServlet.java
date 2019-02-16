package org.mines.douai.j2ee.tp.magniercailliez.servlet;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GraphicYellowJacketServlet
 */
@WebServlet("/YellowJacketEconomic")
public class GraphicYellowJacketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GraphicYellowJacketServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static float getRandomYellowJacket() {
		float minYellowJackets = 0;
		float maxYellowJackets = 400;
		float randomNumber = (float) Math.random();
		float randomYellowJackets = minYellowJackets + (randomNumber * (maxYellowJackets - minYellowJackets));
		return randomYellowJackets;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("image/png");
		ServletOutputStream out = response.getOutputStream();
		BufferedImage bufferedImage = new BufferedImage(1100, 400, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = bufferedImage.createGraphics();

		// Draw on the image
		g2d.setColor(Color.red);
		// g2d.fill(new Ellipse2D.Float(0, 0, 200, 100));
		int numberWeeks = 12;
		Point2D lastPoint = new Point2D.Float(0, getRandomYellowJacket());
		for (int i = 0; i <= numberWeeks - 2; i++) {
			Point2D newPoint = new Point2D.Float(100 * (i + 1), getRandomYellowJacket());
			Line2D.Float line = new Line2D.Float(lastPoint, newPoint);
			lastPoint = newPoint;
			g2d.draw(line);
		}
		// Sauver l’image dans le flux de sortie
		ImageIO.write(bufferedImage, "png", out);

		g2d.dispose();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
