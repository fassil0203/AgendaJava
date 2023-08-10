package appagenda;

        import java.util.ArrayList;

        public class Agenda {

            {
                private ArrayList<ContatoBasico> contatos;
                Agenda()
                {
                    contatos = new ArrayList<>();
                }

                public void inserir(ContatoBasico c)
                {
                    contatos.add(c);

                }

                Public ContatoBasico buscar (String nome)
                {
                    for (int i = 0; i < contatos.size(); i++) {
                        ContatoBasico c = contatos.get(i);
                        if (c.getNome().equalsIgnoreCase(nome))
                            return contatos.get(i);
                    }
                    return null;

                }
                Public ContatoBasicobuscar (int pos)
                { if(pos>=0 &&pos<contatos.size()) {
                    return contatos.get(pos);
                }
                return null;






                Public EContatobuscarEmail (String email)
                {
                    for (int i = 0; i < contatos.size(); i++) {
                        if (contatos.get(i) instanceof EContato) {
                            EContato c = (EContato) contatos.get(i);
                            if (c.getEmail().equalsIgnoreCase(email))
                                return (EContato) contatos.get(i);
                        }
                        return null;

                    }
                }
            }
        }







