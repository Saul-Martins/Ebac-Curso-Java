import java.util.ArrayList;
import java.util.List;

public class Subconjuntos {

    public static List<List<Integer>> calcularSubconjuntos(List<Integer> S, int n) {
        List<List<Integer>> resultados = new ArrayList<>();
        backtrack(S, n, 0, new ArrayList<>(), resultados);
        return resultados;
    }

    private static void backtrack(List<Integer> S, int n, int indiceInicio, List<Integer> subsetAtual, List<List<Integer>> resultados) {
        if (subsetAtual.size() == n) {
            resultados.add(new ArrayList<>(subsetAtual));
            return;
        }
        for (int i = indiceInicio; i < S.size(); i++) {
            subsetAtual.add(S.get(i));
            backtrack(S, n, i + 1, subsetAtual, resultados);
            subsetAtual.remove(subsetAtual.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<Integer> S = new ArrayList<>();
        S.add(1);
        S.add(2);
        S.add(3);

        int n = 2;

        List<List<Integer>> subconjuntos = calcularSubconjuntos(S, n);

        for (List<Integer> subset : subconjuntos) {
            System.out.println(subset);
        }
    }
}
