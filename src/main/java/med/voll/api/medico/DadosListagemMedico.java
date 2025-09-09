package med.voll.api.medico;

import med.voll.api.endereco.Endereco;

public record DadosListagemMedico(Long id, String nome, String email,String telefone, String crm, Endereco endereco,Especialidade especialidade) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getTelefone(), medico.getCrm(), medico.getEndereco(), medico.getEspecialidade());
    }

}
