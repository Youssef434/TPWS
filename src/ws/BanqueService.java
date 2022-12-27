package ws;

import java.util.List;

public interface BanqueService {
  double euroToDirhamConverstion(double montant);
  Compte getCompte(int code);
  List<Compte> listComptes();
}
