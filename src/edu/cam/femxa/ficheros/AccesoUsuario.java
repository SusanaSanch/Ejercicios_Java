package edu.cam.femxa.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AccesoUsuario {
	
	/**
	 * Método para Escribir un usuario (nombre y contraseña) en ficheros
	 * @param nombre nombre del usuario
	 * @param password contraseña del usuario
	 * @return si se ha completado el proceso con éxito(true) o no(false)
	 * @throws IOException
	 */
	public static boolean escribirUsuario(String nombre, String password) throws IOException
	{
		boolean escrito = false;
		String password_codificado = null;
		File user = null;
		File passw = null;
		FileWriter fw1 = null;
		FileWriter fw2 = null;
		BufferedWriter bw = null;
		BufferedWriter bw2 = null;
		
		user = new File ("fichero\\Usuarios\\User1");
		passw = new File ("fichero\\Usuarios\\Pswrd1");
		fw1 = new FileWriter(user);
		fw2 = new FileWriter(passw);
		bw = new BufferedWriter(fw1);
		bw2 = new BufferedWriter(fw2);
		
		password_codificado = Codificar.codifica(password);
		
		try 
			{
				bw.write(nombre);
				escrito = true;
			}
			catch (IOException e) 
				{
					System.out.println("error al escribir usuario en fichero");
					e.printStackTrace();
				}
				finally
					{
						bw.close();
						fw1.close();
					}
		
		try 
		{
			bw2.write(password_codificado);
			escrito = true;
		}
		catch (IOException e) 
			{
				System.out.println("error al escribir contraseña en fichero");
				e.printStackTrace();
			}
			finally
				{
					bw2.close();
					fw2.close();
				}
		
		return escrito;
	}
	
	
	
	
	/**
	 * Solicita al usuario los datos necesarios para su registro: el nombre de usuario y la contraseña.
	 * La contraseña se pide dos veces para evitar errores.
	 * @return si se ha completado el proceso con éxito devuelve true en caso contrario false
	 * @throws IOException
	 */
	public static boolean registroUsuario () throws IOException
	{
		String nombre_usuario = null;
		String password = null;
		String password_confirm = null;
		boolean password_confirmada = false;
		boolean registro_ok = false;
	
		nombre_usuario = EntradaSalida.solicita_nombre();		
		password = EntradaSalida.solicita_password();
		password_confirm = EntradaSalida.solicita_password();
		password_confirmada = password.equals(password_confirm);
	
		if (password_confirmada)
			{
			registro_ok = escribirUsuario(nombre_usuario, password);
			}
			else
			{
				System.out.println("Error en la repetición de la contraseña");
			}
		
		return registro_ok;
	}
	
	
	
	/**
	 * Solicita el nombre y contraseña al usuario para poder acceder. El usuario tiene 3 intentos para introducir la contraseña
	 * @returnsi se ha completado el proceso con éxito devuelve true en caso contrario false
	 * @throws IOException
	 */
	public static boolean accesoUsuario () throws IOException
	{
		String nombre_usuario = null;
		String password = null;
		String nombre_valido = null;
		String password_valido = null;
		boolean acceso_ok = false;
		
		System.out.println("Introduzca su nombre de usuario:");
		nombre_usuario = EntradaSalida.introduce_cadena();
		
		System.out.println("Introduzca su contraseña:");
		password = EntradaSalida.introduce_cadena();
		
		File user = new File ("fichero\\Usuarios\\User1");
		File passw = new File ("fichero\\Usuarios\\Pswrd1");
		FileReader fr1 = new FileReader(user);
		FileReader fr2 = new FileReader(passw);
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		
		try 
			{
				nombre_valido = br1.readLine();
			} 
			catch (IOException e) 
				{
					System.out.println("Error al leer el fichero de usuario");			
					e.printStackTrace();
				}
				finally
					{
					br1.close();
					fr1.close();
					}
		try 
			{
				password_valido = br2.readLine();
			} 
			catch (IOException e) 
				{
					System.out.println("Error al leer el fichero de contraseña");
					e.printStackTrace();
				}
				finally
					{
						br2.close();
						fr2.close();
					}
		
		password_valido = Codificar.decodifica(password_valido);
		
		if(nombre_valido.equals(nombre_usuario))
		{
			System.out.println("nombre usuario correcto");//nombre usuario correcto
			if(password_valido.equals(password))
				{
					System.out.println("contraseña correcta, " + nombre_usuario);
					acceso_ok = true;
				}
				else
					{
					System.out.println("contraseña incorrecta");
					}
		}
			else
				{
					System.out.println("Usuario o contraseña incorrecta");
					acceso_ok = false;
				}
			
		return acceso_ok;
	}
	
	
	
	
	/**
	 * Registro y acceso de usuario
	 * @param args
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException {
		
		boolean registro_ok;
		boolean acceso_ok;
		int intentos_pass = 0;
		int opcion = 0;

		do
		{
			opcion = EntradaSalida.muestraMenu();
			{
				switch (opcion)
					{
					case 1:
						registro_ok = registroUsuario();
						if (registro_ok)
							{
								System.out.println("El usuario se ha registrado correctamente");
							}
							else
								{
									System.out.println("No se ha podido registrar el usuario");
								}
					break;
					
					case 2:
						
						do
						{
							acceso_ok = accesoUsuario();
							if (acceso_ok)
								{
									System.out.println("Ha accedido a su usuario");
								}
								else
									{
										System.out.println("no se ha podido acceder a su usuario");
									}
							intentos_pass++;
						}
						while ((intentos_pass < 3) && (!acceso_ok));
					break;
			
					}
			}
		}while (opcion != 3);
	}

}
