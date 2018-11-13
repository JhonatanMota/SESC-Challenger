package com.mycompany.desafiosesc.util;

import java.time.Month;
import java.util.List;

/**
 *
 * @author Jhonatan
 *
 * Classe útil é responsável pelos utilitários do sistema; Métodos de validações
 * de lista, strings, conversões de datas e etc.
 */
public class Util {

    /**
     * Verifica se uma lista está nula ou vazia;
     *
     * @param list
     * @return
     */
    public static boolean isNullOrEmpty(List list) {
        return list == null || list.isEmpty();
    }

    /**
     * Verifica se string esta nula ou vazia
     *
     * @param str
     * @return
     */
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    /**
     * Método utilizado para converter a string de mês para valor da classe
     * Month
     *
     * @param month
     * @return
     */
    public static Month convertStringToMonth(String month) {
        switch (month) {
            case "Jan":
                return Month.JANUARY;
            case "Fev":
                return Month.FEBRUARY;
            case "Mar":
                return Month.MARCH;
            case "Abr":
                return Month.APRIL;
            case "Mai":
                return Month.MAY;
            case "Jun":
                return Month.JUNE;
            case "Jul":
                return Month.JULY;
            case "Ago":
                return Month.AUGUST;
            case "Set":
                return Month.SEPTEMBER;
            case "Out":
                return Month.OCTOBER;
            case "Nov":
                return Month.NOVEMBER;
            case "Dez":
                return Month.DECEMBER;
        }
        return Month.DECEMBER;
    }
}
