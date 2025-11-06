/*Para um determinado dador estar apto a doar, é necessário cumprir determinados parameteros:
Idade entre 16 e 69 anos
Peso minimo de 50kg
Não ter doenças como AIDS, Hepatite,Sida..
Intervalo de doaçoes: homens (2meses) e mulheres(3 meses)
Não feito feito tatuagens, piercings há menos de 12 meses...

*/

package banco;

import banco.Dador;
import banco.BancoSangueInterface;
import java.rmi.*;
import java.rmi.registry.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
imporrt java.text.ParseException;
public class ValidacaoDador {

    // Método estático para verificar se o dador está apto
    public static boolean estaApto(Dador dador) {
        if (dador.getIdade() < 16 || dador.getIdade() > 69) {
            return false;
        }

        if (dador.getPeso() < 50) {
            return false;
        }

        if (dador.getMesesDesdeTatuagemOuPiercing() < 12) {
            return false;
        }

        // Intervalo mínimo entre doações
        if (d.getSexo().equalsIgnoreCase("M") && d.getMesesDesdeUltimaDoacao() < 2) {
            return false;
        }

        if (d.getSexo().equalsIgnoreCase("F") && d.getMesesDesdeUltimaDoacao() < 3) {
            return false;
        }

        return true;
    }

    // Método para mostrar o motivo da reprovação (opcional)
    public static String motivoInaptidao(Dador d) {
        if (d.getIdade() < 16 || d.getIdade() > 69)
            return "Idade fora do intervalo permitido (16-69 anos).";

        if (d.getPeso() < 50)
            return "Peso inferior a 50 kg.";

        if (d.temDoencaGrave())
            return "Possui doenças graves (AIDS, Hepatite, etc).";

        if (d.getMesesDesdeTatuagemOuPiercing() < 12)
            return "Fez tatuagem ou piercing há menos de 12 meses.";

        if (d.getSexo().equalsIgnoreCase("M") && d.getMesesDesdeUltimaDoacao() < 2)
            return "Homem deve aguardar 2 meses entre doações.";

        if (d.getSexo().equalsIgnoreCase("F") && d.getMesesDesdeUltimaDoacao() < 3)
            return "Mulher deve aguardar 3 meses entre doações.";

        return "Apto para doar.";
    }
}

