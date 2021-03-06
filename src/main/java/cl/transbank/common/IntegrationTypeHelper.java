package cl.transbank.common;

public class IntegrationTypeHelper {
    public static String getWebpayIntegrationType(IntegrationType integrationType){
        switch(integrationType){
            case LIVE:
                return "https://webpay3g.transbank.cl";
            case MOCK:
                return "";
            case TEST:
                return "https://web1qa.test.transbank.cl:5443";

        }
        return "https://webpay3gint.transbank.cl";
    }
    public static String getPatpassIntegrationType(IntegrationType integrationType){
        switch(integrationType){
            case LIVE:
                return "https://www.pagoautomaticocontarjetas.cl";
            case MOCK:
                return "";
            case TEST:
                return "https://pagoautomaticocontarjetasint.transbank.cl";
        }
        return "";
    }
}
