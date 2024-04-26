

package convertidormonedas;

import java.util.Scanner;


public class Pricipal {

    public static void main(String[] args) throws Exception {
              
        
        Aplicacion nuv = new Aplicacion();
        Convertidor com = new Convertidor();
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println();
        System.out.println(" \Bienvenido/ al conversor de monedas UwU ");
        System.out.println(" Admitimos las 161 monedas mas usadas del mundo ");
        System.out.println("------------------------------------------------------");
        do {            
            System.out.println("\n\t\tMenú de opciones:");
            System.out.println("1. Lista de codigos monetarios y paises admitidos");
            System.out.println("2. Conversor Monedas");
            System.out.println("3. Mostrar Lista conversiones realizadas");
            System.out.println("4. Salir\n");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                   muestraPaises();
                    break;
                 case 2:
                        System.out.println("\nConversor de monedas.. ");
                        System.out.print("Ingresa el codigo del pais DE : ...  ");
                        String codigoDe = sc.next();
                        System.out.print("Ingresa el codigo del pais A : ...  ");
                        String codigoA = sc.next();
                        System.out.print("Monto : $ ");
                        double monto = sc.nextDouble();
                        nuv.agragarRegistro(com.convertirMoneda(codigoDe, codigoA, monto));
                        
                    break;
                 case 3:
                     nuv.mostrarLista();
                     break;
                 case 4:
                     System.out.println(" Gracias por usar nuestra aplicación UwU\n "
                             + "Ten un buen dia !!!");
                      break;
                default:
                    System.out.println(" La opcion ingresada es incorrecta");
            }  
        } while (opcion != 4);
        
     
    }
    
    public static void muestraPaises(){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("DEA Emiratos Árabes Unidos\t| AFN Afganistán");
        System.out.println("ALL Albania\t| AMD Armenia");
        System.out.println("ANG Antillas Holandesas\t| AOA Angola");
        System.out.println("ARS Argentina\t| AUD Australia");
        System.out.println("AWG Aruba\t| AZN Azerbaiyán");
        System.out.println("BAM Bosnia y Herzegovina\t| BBD Barbados");
        System.out.println("BDT Bangladesh\t| BGN Bulgaria");
        System.out.println("BHD Bahréin\t| BIF Burundi");
        System.out.println("DMO islas Bermudas\t| BND Brunéi");
        System.out.println("BOB bolivia\t| BRL reales Brasil");
        System.out.println("BSD bahamas\t| BTN Bután");
        System.out.println("BWP Botsuana\t| BYN Bielorrusia");
        System.out.println("BZD Belice\t| CAD Canadá");
        System.out.println("CDF República Democrática del Congo\t| CHF Suiza");
        System.out.println("CLP Chile\t| CNY Porcelana");
        System.out.println("COP Colombia\t| CDN Costa Rica");
        System.out.println("TAZA Cuba\t| CVE Cabo Verde");
        System.out.println("CZK coronas checas República Checa\t| DJF Yibuti");
        System.out.println("DKK coronas danesas Dinamarca\t| DOP República Dominicana");
        System.out.println("DZD Argelia\t| EGP Egipto");
        System.out.println("ERN Eritrea\t| ETB Etiopía");
        System.out.println("EUR unión Europea\t| FJD Fiyi");
        System.out.println("FKP Islas Malvinas\t| FOK Islas Faroe");
        System.out.println("GBP Reino Unido\t| GEL Georgia");
        System.out.println("GGP Guernesey\t| GHS Ghana");
        System.out.println("PIB Gibraltar\t| GMD Gambia");
        System.out.println("GNF Guinea\t| GTQ Guatemala");
        System.out.println("GYD Guayana\t| HKD dólares de Hong Kong ");
        System.out.println("HNL Honduras\t| HRK Croacia");
        System.out.println("HTG Haití\t| HUF Hungría");
        System.out.println("IDR Indonesia\t| ILS Israel");
        System.out.println("IMP Isla de Man\t| INR India");
        System.out.println("IQD Irak\t| TIR Irán");
        System.out.println("ISK Islandia\t| JEP Jersey");
        System.out.println("JMD Jamaica\t| JOD Jordán");
        System.out.println("JPY Japón\t| KES Kenia");
        System.out.println("KGS Kirguistán\t| KHR Camboya");
        System.out.println("KID Kiribati\t| KMF Comoras");
        System.out.println("KRW Corea del Sur\t| KWD Kuwait");
        System.out.println("KYD Islas Caimán\t| KZT Kazajstán");
        System.out.println("LAK Laos\t| dolor lumbar Líbano");
        System.out.println("LKR Sri Lanka\t| LRD Liberia");
        System.out.println("LSL Lesoto\t| LYD Libia");
        System.out.println("MAD Marruecos\t| MDL Moldavia");
        System.out.println("MGA Madagascar\t| MKD Macedonia del Norte");
        System.out.println("MMK Birmania\t| TMN Mongolia");
        System.out.println("MOP Macao\t| MRU Mauritania");
        System.out.println("MUR Rupia de Mauricio\t| MVR Maldivas");
        System.out.println("MWK Malaui\t| MXN México");
        System.out.println("MYR Malasia\t| MZN Mozambique");
        System.out.println("NAD Namibia\t| NGN Nigeria");
        System.out.println("NIO Nicaragua\t| NOK Noruega");
        System.out.println("NPR Nepal\t| NZD Nueva Zelanda");
        System.out.println("OMR Omán\t| PAB Panamá");
        System.out.println("PEN Perú\t| PGK Papúa Nueva Guinea");
        System.out.println("PHP Filipinas\t| PKR Pakistán");
        System.out.println("PLN Polonia\t| PYG Paraguay");
        System.out.println("QAR Katar\t| RON Rumania");
        System.out.println("RSD Serbia\t| FROTAR Rusia");
        System.out.println("RWF Ruanda\t| RAE Arabia Saudita");
        System.out.println("SBD Islas Salomón\t| RCS Seychelles");
        System.out.println("ODS Sudán\t| coronas suecas Suecia");
        System.out.println("SGD Singapur\t| SHP santa elena");
        System.out.println("LES Sierra Leona\t| LLAMADA DE SOCORRO Somalia");
        System.out.println("SDR Surinam\t| SSP Sudán del Sur");
        System.out.println("ESTN Santo Tomé y Príncipe\t| SYP Siria");
        System.out.println("SZL Suazilandia\t| THB Tailandia");
        System.out.println("TJS Tayikistán\t| TMT Turkmenistán");
        System.out.println("TND Túnez\t| TOP Tonga");
        System.out.println("TRY Turquía\t| TTD Trinidad y Tobago");
        System.out.println("TWD Taiwán\t| TZS Tanzania");
        System.out.println("UAH Ucrania\t| UGX Uganda");
        System.out.println("USD Estados Unidos\t| UYU Uruguay");
        System.out.println("UZS Uzbekistán\t| VES Venezuela");
        System.out.println("VND Vietnam\t| VUV Vanuatu");
        System.out.println("WST Samoa\t| XAF CFA Franc BEAC");
        System.out.println("XAG Plata (onza troy)\t| XAU Oro (onza troy)");
        System.out.println("XCD Dólar del Caribe Oriental\t| XDR Derechos Especiales de Giro");
        System.out.println("XOF CFA Franc BCEAO\t| XPD Paladio (onza troy)");
        System.out.println("XPF Franco CFP\t| XPT Platino (onza troy)");
        System.out.println("YER Yemen\t| ZAR Sudáfrica");
        System.out.println("ZMW Zambia\t| ZWL Zimbabue");
        System.out.println("-------------------------------------------------------------------------------------------");

        
    }

    
}
