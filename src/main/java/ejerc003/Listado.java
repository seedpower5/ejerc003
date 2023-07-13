package ejerc003;

import java.util.ArrayList;

public class Listado 
{
	//inicializamos la variable donde almazenamos los datos
	ArrayList<String>listadoAlumnos=new ArrayList<String>();
	
	//metodo para agregar a la lista
	void agregarListado (String alumno) 
	{
		listadoAlumnos.add(alumno);
	}
	//metodo para eliminar
	void eliminarAlumno(String alumno) 
	{
		for (int i = 0; i < listadoAlumnos.size()-1; i++) 
		{
			if(listadoAlumnos.get(i)==alumno) 
			{
				listadoAlumnos.remove(i);
			}
		}
	}
	//metodo para modificar
	void modificarAlumno(String alumno) 
	{
		for (int i = 0; i < listadoAlumnos.size()-1; i++) 
		{
			if(listadoAlumnos.get(i)==alumno) 
			{
				listadoAlumnos.set(i,alumno);
			}
		}
	}
	//metodo para mostrar el listado
	void leerLista() 
	{
		for (int i = 0; i < listadoAlumnos.size()-1; i++) 
		{
			listadoAlumnos.get(i);
		}
	}
}
