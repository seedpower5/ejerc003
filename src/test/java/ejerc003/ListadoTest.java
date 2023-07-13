package ejerc003;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ListadoTest {
	//inizializamos el array
	ArrayList<String>listadoAlumnos=new ArrayList<String>();
	String alumno="jorge";
	
	@Test
	public void testAgregarListado() 
	{
	
		
		listadoAlumnos.add(alumno);
	}

	@Test
	public void testEliminarAlumno() 
	{
		
		for (int i = 0; i < listadoAlumnos.size()-1; i++) 
		{
			if(listadoAlumnos.get(i)==alumno) 
			{
				listadoAlumnos.remove(i);
			}
		}
	}

	@Test
	public void testModificarAlumno() 
	{
		for (int i = 0; i < listadoAlumnos.size()-1; i++) 
		{
			if(listadoAlumnos.get(i)==alumno) 
			{
				listadoAlumnos.set(i,"pepe");
			}
		}
	}

	@Test
	public void testLeerLista() 
	{
		for (int i = 0; i < listadoAlumnos.size()-1; i++) 
		{
			listadoAlumnos.get(i);
		}
	}

}
