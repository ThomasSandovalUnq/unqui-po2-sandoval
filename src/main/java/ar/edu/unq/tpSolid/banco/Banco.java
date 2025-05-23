package ar.edu.unq.tpSolid.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Cliente> clientes;
    private List<SolicitudDeCreditos> solcs;

    public Banco() {
        clientes = new ArrayList<>();
        solcs = new ArrayList<>();
    }

    public List<Cliente> getClientes(){
        return clientes;
    }

    public List<SolicitudDeCreditos> getSolcs(){
        return solcs;
    }

    public void agregarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void agregarSolicitudDeCredito(SolicitudDeCreditos sol){
        this.solcs.add(sol);
    }

    public double montoADesembolsar() {
        double montoADesembolsar = 0;
        for (SolicitudDeCreditos sol : solcs){
            if (sol.esAceptable()){
                montoADesembolsar += sol.montoSolicitado;
            }
        }
        return montoADesembolsar;
    }
}
