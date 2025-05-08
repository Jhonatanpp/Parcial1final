/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @Jhonatan
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    ArrayList<Libro> libros = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();

    public void registrarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ciencia");
        String titulo = scanner.nextLine();
        System.out.print("Sociales");
        String autor = scanner.nextLine();
        System.out.print("Español");
        String categoria = scanner.nextLine();

        Libro libro = new Libro(titulo, autor, categoria);
        libros.add(libro);
        System.out.println("Libro registrado.");
    }

    public void registrarUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("ID del usuario: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Usuario usuario = new Usuario(nombre, id);
        usuarios.add(usuario);
        System.out.println("Usuario registrado.");
    }

    public void mostrarMenu() {
    Scanner scanner = new Scanner(System.in);
    int opcion = 0;

    while(opcion != 3) {
        System.out.println("\nMenu Biblioteca:");
        System.out.println("1. Registrar libro");
        System.out.println("2. Registrar usuario");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");

        opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        if(opcion == 1) {
            registrarLibro();
        } else if(opcion == 2) {
            registrarUsuario();
        } else if(opcion == 3) {
            System.out.println("Saliendo...");
        } else {
            System.out.println("Opción incorrecta. Intenta de nuevo.");
        }
    }
}

    public void mostrarLibros() {
        System.out.println("Lista de Libros:");
        for (Libro libro : libros) {
        System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", Categoría: " + libro.getCategoria());
        }
    }

}

