package src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClienteModelList {
    private List<Cliente> clientesConTarjetaDebito;
    private List<Cliente> clientesConTarjetaCredito;

    public ClienteModelList(List<Cliente> clientes) {
        // Filtrar y ordenar los clientes
        clientesConTarjetaDebito = clientes.stream()
                .filter(cliente -> cliente.isTieneTarjetaDebito())
                .sorted(Comparator.comparing(Cliente::getNombre))
                .collect(Collectors.toList());

        clientesConTarjetaCredito = clientes.stream()
                .filter(cliente -> !cliente.isTieneTarjetaDebito())
                .sorted(Comparator.comparing(Cliente::getNombre))
                .collect(Collectors.toList());
    }

    // Getters para las listas de clientes aquí...

    public static void main(String[] args) {
        // Ejemplo de uso
        List<Cliente> listaClientes = new ArrayList<>();
        // Agregar clientes a la lista...

        showClientModel(listaClientes);
    }

    private static ClienteModelList showClientModel(List<Cliente> listaClientes) {
        ClienteModelList clienteModelList = new ClienteModelList(listaClientes);

        return clienteModelList;
    }
}
