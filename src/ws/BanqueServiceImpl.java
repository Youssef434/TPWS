package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Arrays;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueServiceImpl implements BanqueService {
  List<Compte> comptes = Arrays.asList(
      new Compte(1, Math.random() * 9999),
      new Compte(2, Math.random() * 9999),
      new Compte(3, Math.random() * 9999)
  );

  @Override
  @WebMethod(operationName = "converstionEuroDirham")
  public double euroToDirhamConverstion(@WebParam(name = "montantEnDirham") double montant) {
    return montant * 11;
  }

  @Override
  @WebMethod(operationName = "compteAPartirduCode")
  public Compte getCompte(@WebParam(name = "codeCompte") int code) {
    return comptes
        .stream()
        .filter(compte -> compte.getCode() == code)
        .findFirst()
        .orElseThrow(RuntimeException::new);
  }

  @Override
  @WebMethod(operationName = "listeDesComptes")
  public List<Compte> listComptes() {
    return comptes;
  }
}
