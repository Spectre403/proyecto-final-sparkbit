/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaPresentacion;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.InputStream;

/**
 *
 * @author se6as
 */
public class Fuentes {
    
    public static Font AnjaEliane = new Font("Arial",0,12);
    public static Font QuicksandSemiBold = new Font("Arial",0,12);
    public static Font QuicksandMedium = new Font("Arial",0,12);
    public static Font Quicksand = new Font("Arial",0,12);
    
    public static void Cargar() {
        try {
            // Cargar la fuente desde la carpeta resources
            InputStream fontStreamAnjaE = Fuentes.class.getResourceAsStream("/Recursos/fonts/AnjaEliane.ttf");
            InputStream fontStreamQSMedium = Fuentes.class.getResourceAsStream("/Recursos/fonts/QuicksandMedium.ttf");
            InputStream fontStreamQSSemiBold = Fuentes.class.getResourceAsStream("/Recursos/fonts/QuicksandSemiBold.ttf");
            InputStream fontStreamQS = Fuentes.class.getResourceAsStream("/Recursos/fonts/Quicksand.ttf");
            if (fontStreamAnjaE == null) {
                throw new RuntimeException("No se pudo cargar el archivo de fuente.");
            }
            if (fontStreamQSMedium == null) {
                throw new RuntimeException("No se pudo cargar el archivo de fuente.");
            }
            if (fontStreamQSSemiBold == null) {
                throw new RuntimeException("No se pudo cargar el archivo de fuente.");
            }
            if (fontStreamQS == null) {
                throw new RuntimeException("No se pudo cargar el archivo de fuente.");
            }

            // Crear el objeto Font
            AnjaEliane = Font.createFont(Font.TRUETYPE_FONT, fontStreamAnjaE).deriveFont(21f); // Tamaño de fuente 
            QuicksandSemiBold = Font.createFont(Font.TRUETYPE_FONT, fontStreamQSMedium); // Tamaño de fuente
            QuicksandMedium = Font.createFont(Font.TRUETYPE_FONT, fontStreamQSSemiBold); // Tamaño de fuente
            Quicksand = Font.createFont(Font.TRUETYPE_FONT, fontStreamQS).deriveFont(14f); // Tamaño de fuente
            
            // Registrar la fuente en el entorno gráfico
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(AnjaEliane);
            ge.registerFont(QuicksandSemiBold);
            ge.registerFont(QuicksandMedium);
            ge.registerFont(Quicksand);
           
            System.out.println("Fuente personalizada cargada correctamente.");
        } catch (Exception e) {
            System.out.println("Error al cargar la fuente personalizada.");
        }
    }
    
 
    }
    
    
    
    
    

