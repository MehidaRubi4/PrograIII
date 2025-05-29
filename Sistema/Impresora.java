import java.util.Scanner;

public class Impresora {
    public void impresoraopcione(){
        Scanner automatico = new Scanner(System.in);
        int confirmacion;
        System.out.println("Ingrese el numero que se le porporciono para confimar la opcion que desea realizar");
        confirmacion =  automatico.nextInt();
        if(confirmacion == 2001){
            System.out.println("");
            System.out.println("Paso 1 -- Verificar el tipo de impresora; \n" + //
            " - USB \n" + //
            " - Wi-Fi/Red\n" + // 
            " - Bluetooth");
            System.out.println("Paso 2 -- Desempaquetado y preparación; \n" + //
            " - Saca la impresora de la caja.\n" + //
            " - Retira los plásticos y protecciones internas.\n" + //
            " - Instala los cartuchos de tinta o tóner.\n" + //
            " - Coloca el papel en la bandeja.\n" + //
            " - Conecta el cable de alimentación.\n" + //
            " - Enciende la impresora.");
            System.out.println("Paso 3 -- Conexión al computador;\n" + //
            " a) Si es por cable USB:\n" + //
            "    - Conecta la impresora al puerto USB de la computadora.\n" + //
            "    - El sistema puede detectar la impresora automáticamente.\n" + //
            " b) Si es inalámbrica (Wi-Fi):\n" + //
            "    - Desde el panel de la impresora, entra a:\n" + //
            "        Configuración --> Red --> Wi-Fi --> Conectar a red.\n" + //
            "        Selecciona tu red Wi-Fi e ingresa la contraseña.\n" + //
            "        Alternativamente, puedes usar una app de configuración del fabricante.");
            System.out.println("Paso 4 -- Instala los controladores (drivers); \n" + //
            " a) Windows o macOS puede instalar el controlador automáticamente.\n" + //
            " b) Si no:\n" + //
            "    - Visita la página oficial del fabricante.\n" + //
            "    - Descarga el software específico para tu modelo.\n" + //
            "    - Ejecuta el instalador y sigue los pasos.");
            System.out.println("Paso 5 -- Configura la impresora\n" + //
            " a) En Windows:\n" + //
            "    - Ve a Panel de control --> Dispositivos e impresoras.\n" + //
            "    - Asegúrate de que la impresora esté visible y configurada como predeterminada.\n" + //
            " b) En macOS:\n" + //
            "    - Preferencias del Sistema --> Impresoras y escáneres.");
        }else{
            System.out.println("Numero no corresponde al procedimeinto que se desea realizar");
        }
    }

    public void router(){
        Scanner automatico = new Scanner(System.in);
        int confirmacion;
        System.out.println("Ingrese el numero que se le porporciono para confimar la opcion que desea realizar");
        confirmacion =  automatico.nextInt();
        if(confirmacion == 2015){
            System.out.println("Paso 1 -- Asegurate de tener;\n" + //
            " - El router\n" + //
            " - Adaptador de corriente\n" + //
            " - Cable de red Ethernet (RJ-45)\n" + //
            " - Manual del usuario");
            System.out.println("Paso 2 -- Conecta el router físicamente; \n" + //
            " a) Conexión a Internet.\n" + //
            "    1. Toma el cable del proveedor de internet.\n" + //
            "    2. Conéctalo al puerto WAN o Internet del router (suele estar en color azul).\n" + //
            " b) Conexión a la corriente\n" + //
            "    1. Conecta el adaptador de corriente al router y a un enchufe.\n" + //
            "    2. Enciende el router (si tiene botón).");
            System.out.println("Paso 3 --  Accede a la configuración del router;\n" + //
            " A) Por navegador web (modo tradicional);\n" + //
            "    - Abre un navegador (Chrome, Edge, etc.).\n" + //
            "    - En la barra de direcciones escribe la IP del router (Consulta el manual o la etiqueta del router).\n" + //
            "    - Ingresa usuario y contraseña.\n" + //
            " B) Por aplicación móvil (para routers modernos);\n" + //
            "    - Descarga la app del fabricante.\n" + //
            "    - Sigue los pasos guiados para configurar la red desde el celular.");
            System.out.println("Paso 4 -- Configura la red Wi-Fi, donde una vez dentro del panel;\n" + //
            " - Cambia el nombre de la red (SSID).\n" + //
            " - Establece una contraseña segura.\n" + //
            " - Elige el modo de seguridad: WPA2 o WPA3.\n" + //
            " - Si es de doble banda, configura tanto 2.4 GHz como 5 GHz.");
            System.out.println("Paso 5 -- Prueba la conexión a Internet;\n" + //
            " - Conéctate desde tu PC o celular a la nueva red Wi-Fi.\n" + //
            " - Abre un navegador e intenta acceder a una página.\n" + //
            " - Si funciona, ¡tu router está listo!");
        }else{
            System.out.println("Numero no corresponde al procedimeinto que se desea realizar");
        }
    }

    public void software(){
        Scanner automatico = new Scanner(System.in);
        int confirmacion;
        System.out.println("Ingrese el numero que se le porporciono para confimar la opcion que desea realizar");
        confirmacion =  automatico.nextInt();
        if(confirmacion == 2018){
            System.out.println("");
            System.out.println("Paso 1 -- Identifica los requisitos del sistema\n" + //
            " - Sistema operativo compatible (Windows, macOS, Linux).\n" + //
            " - Espacio en disco requerido.\n" + //
            " - Memoria RAM mínima.\n" + //
            " - Dependencias.");
            System.out.println("Paso 2 -- Descarga del software; \n" + //
            " - Visita la página oficial de Carmesi DigitalTech.\n" + //
            " - Elige la versión correcta (32/64 bits o para tu sistema operativo).\n" + //
            " - Haz clic en “Descargar” y guarda el instalador en tu equipo.");
            System.out.println("Paso 3 -- Instalación del software;\n" + //
            " - Haz doble clic en el archivo descargado.\n" + //
            " - Acepta los términos y condiciones de uso.\n" + //
            " - Elige la carpeta de instalación.\n" + //
            " - Selecciona opciones adicionales (accesos directos, idioma, etc.).\n" + //
            " - Haz clic en “Instalar”.\n" + //
            " - Espera a que termine y luego selecciona “Finalizar”.");
            System.out.println("Paso 4 -- Personaliza:\n" + //
            " - Idioma de la interfaz.\n" + //
            " - Preferencias del usuario (tema claro/oscuro, ubicación de archivos, etc.).\n" + //
            " - Notificaciones y opciones automáticas.\n" + //
            " - Revisa las configuraciones básicas de seguridad o privacidad.");
        }else{
            System.out.println("Numero no corresponde al procedimeinto que se desea realizar");
        }
    }
}
