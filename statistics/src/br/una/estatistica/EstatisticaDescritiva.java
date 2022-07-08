package br.una.estatistica;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Centro Universitário Una Sistemas de Infornação Instituto Politecnico - Campi
 * Barreiro Estatistica descritiva.
 *
 * @author douglas.silva
 *
 */
public class EstatisticaDescritiva {

    private List<Double> amostra;

    public EstatisticaDescritiva(List<Double> amostra) {
        this.amostra = amostra;
    }

    public List<Double> getAmostra() {
        return amostra;
    }

    public void setAmostra(List<Double> amostra) {
        this.amostra = amostra;
    }

    public double somatorio() {
        Double total = 0.0;
        for (Double valor : amostra) {
            total += valor;
        }
        return total;
    }

    /**
     * @return double - media aritimética
     */
    public double media() {
        return somatorio() / amostra.size();
    }

    public double getSomaDosElementosAoQuadrado() {
        double total = 0;
        for (Double am : amostra) {
            total += Math.pow(am, 2);
        }
        return total;
    }

    public double getVariancia() {
        double p1 = 1 / Double.valueOf(amostra.size() - 1);
        double p2 = getSomaDosElementosAoQuadrado()
                - (Math.pow(somatorio(), 2) / Double
                .valueOf(amostra.size()));
        return p1 * p2;
    }

    /**
     * @return double desvio padrão Amostral
     */
    public double desvioPadrao() {
        return Math.sqrt(getVariancia());
    }

    /**
     * Calculo da mediana
     *
     * @return double mediana
     */
    public double mediana() {
        if (amostra.size() % 2 != 0) {
            int meio = amostra.size() - 1;
            return amostra.get(meio / 2);
        } else {
            int meio = (amostra.size() / 2);
            return (amostra.get(meio - 1) + amostra.get(meio)) / 2;
        }
    }

    /**
     * Calculo da amplitude amostral
     *
     * @return double
     */
    public double amplitude() {
        return amostra.get(0) - amostra.get(amostra.size() - 1);
    }

    public double getModa() {
        Map<Double, Integer> modaMap = new HashMap<>();
        for (Double valor : amostra) {
            if (modaMap.containsKey(valor)) {
                modaMap.put(valor, modaMap.get(valor) + 1);
            } else {
                modaMap.put(valor, 1);
            }
        }
        Integer quant = 0;
        Double moda = 0.0;
        for (Map.Entry<Double, Integer> entry : modaMap.entrySet()) {
            if (entry.getValue() > quant) {
                quant = entry.getValue();
                moda = entry.getKey();
            }
        }
        return moda;
    }

    public double moda() {
        HashMap map = new HashMap();
        Integer i;
        Double moda = 0.0;
        Integer numAtual, numMaior = 0;
        for (int count = 0; count < amostra.size(); count++) {
            i = (Integer) map.get(new Double(amostra.get(count)));
            if (i == null) {
                map.put(new Double(amostra.get(count)), new Integer(1));
            } else {
                map.put(new Double(amostra.get(count)), new Integer(i.intValue() + 1));
                numAtual = i.intValue() + 1;
                if (numAtual > numMaior) {
                    numMaior = numAtual;
                    moda = new Double(amostra.get(count));
                }
            }
        }
        return moda;
    }

    public double getDesvioPadrao() {
        return Math.sqrt(getVariancia());
    }

    public double getCoeficienteVariacao() {
        return (getDesvioPadrao() / media()) * 100;
    }

    public double getMediaGeometrica() {
        double total = 1;
        for (int counter = 0; counter < amostra.size(); counter++) {
            total *= amostra.get(counter);
        }
        return Math.pow(total, 1.0d / amostra.size());
    }
}
