package Fuzzy;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;

public class Main {
    public static void main(String[] args) {
        String fileName = "riesgo_desercion.fcl";
        FIS fis = FIS.load(fileName, true);

        if (fis == null) {
            System.err.println("No se pudo cargar el archivo: " + fileName);
            return;
        }

        // Mostrar gráficas de variables
        JFuzzyChart.get().chart(fis);

        // Establecer valores de entrada (ejemplo)
        fis.setVariable("promedio", 3.2);
        fis.setVariable("asistencia", 60);
        fis.setVariable("economia", 4); // formulario sumado y normalizado
        fis.setVariable("psicosociales", 7); // idem
        fis.setVariable("edad", 24);
        fis.setVariable("semestre", 4);

        // Evaluar
        fis.evaluate();

        // Mostrar salida
        double riesgo = fis.getVariable("riesgo").getValue();
        System.out.println("RIESGO DE DESERCIÓN: " + riesgo);

        // Mostrar gráfico de salida
        JFuzzyChart.get().chart(fis.getVariable("riesgo"), fis.getVariable("riesgo").getDefuzzifier(), true);
    }
}
