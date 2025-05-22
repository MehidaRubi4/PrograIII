//PARTE QUE PERTENECE A CHAT DE TEXTO
import java.util.Scanner;

public class Impresora {
    public void impresoraopcione(){
        Scanner automatico = new Scanner(System.in);
        int confirmacion;
        System.out.println("Ingrese el numero que se le porporciono para confimar la opcion que desea realizar");
        confirmacion =  automatico.nextInt();
        if(confirmacion == 2001){
            System.out.println("");
            System.out.println("Paso 1 -- Verificar el tipo de impresora \n" + //
            "USB: Conecta directamente a la computadora. \n" + //
            "Wi-Fi/Red: Se conecta mediante red inalambrica. \n" + // 
            "Bluetooth: Requiere emparejamiento.");
            System.out.println("Paso 2 -- Desempaquetado y preparación \nSaca la impresora de la caja.\n" + //
            "Retira los plásticos y protecciones internas.\n" + //
            "Instala los cartuchos de tinta o tóner.\n" + //
            "Coloca el papel en la bandeja.\n" + //
            "Conecta el cable de alimentación.\n" + //
            "Enciende la impresora.");
            System.out.println("Paso 3 -- Conexión al computador\n" + //
            "a) Si es por cable USB:\n" + //
            "Conecta la impresora al puerto USB de la computadora.\n" + //
            "El sistema puede detectar la impresora automáticamente.\n" + //
            "b) Si es inalámbrica (Wi-Fi):\n" + //
            "Desde el panel de la impresora, entra a:\n" + //
            "Configuración → Red → Wi-Fi → Conectar a red.\n" + //
            "Selecciona tu red Wi-Fi e ingresa la contraseña.\n" + //
            "Alternativamente, puedes usar una app de configuración del fabricante (por ejemplo, HP Smart, Canon PRINT, Epson Smart Panel).");
            System.out.println("Paso 4 -- Instala los controladores (drivers)\n" + //
            "Windows o macOS puede instalar el controlador automáticamente.\n" + //
            "Si no:\n" + //
            "Visita la página oficial del fabricante (HP, Epson, Brother, etc.).\n" + //
            "Descarga el software específico para tu modelo.\n" + //
            "Ejecuta el instalador y sigue los pasos.");
            System.out.println("Paso 5 -- Configura la impresora\n" + //
            "En Windows:\n" + //
            "Ve a Panel de control → Dispositivos e impresoras.\n" + //
            "Asegúrate de que la impresora esté visible y configurada como predeterminada.\n" + //
            "En macOS:\n" + //
            "Preferencias del Sistema → Impresoras y escáneres.");
            System.out.println("Errores comunes a evitar\n" + //
            "No conectar a la red correcta.\n" + //
            "Cartuchos mal colocados.\n" + //
            "No instalar controladores correctos.\n" + //
            "Cortafuegos (firewall) bloqueando la comunicación.");
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
            System.out.println("Paso 1 -- Verifica el contenido de la caja\n" + //
            "Asegúrate de tener:\n" + //
            "El router\n" + //
            "Adaptador de corriente\n" + //
            "Cable de red Ethernet (RJ-45)\n" + //
            "Manual del usuario");
            System.out.println("Paso 2 -- Conecta el router físicamente\n" + //
            "a) Conexión a Internet\n" + //
            "Toma el cable del proveedor de internet (por ejemplo, del módem).\n" + //
            "Conéctalo al puerto WAN o Internet del router (suele estar en color azul o diferente).\n" + //
            "b) Conexión a la corriente\n" + //
            "Conecta el adaptador de corriente al router y a un enchufe.\n" + //
            "Enciende el router (si tiene botón).\n" + //
            "c) Conexión al computador (opcional para configuración)\n" + //
            "Conecta un cable Ethernet desde uno de los puertos LAN (amarillos) del router a tu PC o laptop.");
            System.out.println("Paso 3 --  Accede a la configuración del router\n" + //
            "Tienes dos opciones:\n" + //
            "A) Por navegador web (modo tradicional)\n" + //
            "Abre un navegador (Chrome, Edge, etc.).\n" + //
            "En la barra de direcciones escribe la IP del router, generalmente:\n" + //
            "192.168.1.1\n" + //
            "192.168.0.1\n" + //
            "(Consulta el manual o la etiqueta del router)\n" + //
            "Ingresa usuario y contraseña (por defecto suele ser admin / admin o admin / 1234).\n" + //
            "B) Por aplicación móvil (para routers modernos)\n" + //
            "Descarga la app del fabricante (TP-Link Tether, ASUS Router, etc.).\n" + //
            "Sigue los pasos guiados para configurar la red desde el celular.");
            System.out.println("Paso 4 -- Configura la red Wi-Fi\n" + //
            "Una vez dentro del panel:\n" + //
            "Cambia el nombre de la red (SSID).\n" + //
            "Establece una contraseña segura.\n" + //
            "Elige el modo de seguridad: WPA2 o WPA3.\n" + //
            "Si es de doble banda, configura tanto 2.4 GHz como 5 GHz (pueden tener diferentes nombres).");
            System.out.println("Paso 5 -- Prueba la conexión a Internet\n" + //
            "Conéctate desde tu PC o celular a la nueva red Wi-Fi.\n" + //
            "Abre un navegador e intenta acceder a una página.\n" + //
            "Si funciona, ¡tu router está listo!");
            System.out.println("Paso 6 -- Cambios de seguridad recomendados\n" + //
            "Cambia la contraseña de acceso al router (la de administrador).\n" + //
            "Desactiva WPS si no lo necesitas.\n" + //
            "Actualiza el firmware desde el panel si hay una versión nueva disponible.");
            System.out.println("Paso 7 -- Problemas comunes y soluciones\n" + //
            "Problema\tSolución\n" + //
            "No puedo acceder a 192.168.1.1\tVerifica que estés conectado por cable o Wi-Fi al router\n" + //
            "La contraseña por defecto no funciona\tHaz un reset al router (mantén presionado el botón de \"Reset\" 10 segundos)\n" + //
            "Sin Internet aunque Wi-Fi funcione\tVerifica el cable de tu proveedor de Internet o llama al soporte técnico");
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
            "Antes de instalar, verifica:\n" + //
            "Sistema operativo compatible (Windows, macOS, Linux).\n" + //
            "Espacio en disco requerido.\n" + //
            "Memoria RAM mínima.\n" + //
            "Dependencias (como Java, .NET, frameworks, etc.).");
            System.out.println("Paso 2 -- Descarga del software\n" + //
            "Visita la página oficial de Carmesi DigitalTech.\n" + //
            "Elige la versión correcta (32/64 bits o para tu sistema operativo).\n" + //
            "Haz clic en “Descargar” y guarda el instalador en tu equipo.");
            System.out.println("Paso 3 -- Instalación del software\n" + //
            "Haz doble clic en el archivo descargado (.exe, .msi, .dmg, etc.).\n" + //
            "Acepta los términos y condiciones de uso.\n" + //
            "Elige la carpeta de instalación (dejar por defecto es lo más común).\n" + //
            "Selecciona opciones adicionales si hay (accesos directos, idioma, etc.).\n" + //
            "Haz clic en “Instalar”.\n" + //
            "Espera a que termine y luego selecciona “Finalizar”.");
            System.out.println("Paso 4 -- Configuración inicial\n" + //
            "Personaliza:\n" + //
            "Idioma de la interfaz.\n" + //
            "Preferencias del usuario (tema claro/oscuro, ubicación de archivos, etc.).\n" + //
            "Notificaciones y opciones automáticas.\n" + //
            "Revisa las configuraciones básicas de seguridad o privacidad.");
            System.out.println("Paso 5 -- Uso básico del software\n" + //
            "Abre una función principal.\n" + //
            "Guarda tu primer trabajo si aplica.\n" + //
            "Explora el menú o las pestañas para conocer sus herramientas.\n" + //
            "Usa ayuda o tutoriales si el programa le ofrece.");
            System.out.println("Resumen de buenas prácticas\n" + //
            "Buen hábito\tPor qué hacerlo\n" + //
            "Descargar desde sitios oficiales\tEvita virus o versiones falsas\n" + //
            "Leer los permisos solicitados\tPara proteger tu privacidad\n" + //
            "Mantener el software actualizado\tMejora seguridad y rendimiento\n" + //
            "Hacer copias de seguridad\tProtege tu información");
        }else{
            System.out.println("Numero no corresponde al procedimeinto que se desea realizar");
        }
    }
}
