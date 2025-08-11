package org.aplicacao;
import org.aplicacao.dto.AndressDTO;
import org.aplicacao.dto.EnterpriseDTO;
import org.aplicacao.servico.ApiServiceAndress;
import org.aplicacao.servico.ApiServiceEnterprise;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        ApiServiceEnterprise apiServiceEnterprise = new ApiServiceEnterprise();
        ApiServiceAndress apiServiceAndress= new ApiServiceAndress();
        try
        {
            EnterpriseDTO responseEnterprise = apiServiceEnterprise.getEnterprise("02828446000134");
            System.out.println(responseEnterprise);
            String cepBruto = responseEnterprise.getCep();
            String cep = cepBruto.replace(".","").replace("-","").replace(" ","");
            AndressDTO responseAndress= apiServiceAndress.getAndressDTO(cep);
            System.out.println(responseAndress);
        }
        catch (IOException | InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}