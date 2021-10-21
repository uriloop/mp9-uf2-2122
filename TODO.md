## Tasques 

### Setmana del 18/10-22/10
- Exercicis Callable, Runnable i Executors

 CLASSE
> Resolució a classe de l'exercici de donar i informar dels punts a Jugadors (Runnable i SchedulEedTreadPool)

 TODO
> Tenim uns paletes que tenen la tasca de contruir una paret a base de posar maons.
> Podeu veure el codi als fitxers [Paleta.java](src/a1/Paleta.java) i [FerParet.java](src/a1/FerParet.java).
> Volem adaptar aquest codi perquè els paletes treballin alhora i no com ara, que fins que un paleta no ha posat els seus maons no continua l'altre.  
> *_Atenció: fer servir Runnable en comptes de Callable i un ThreadPoolExecutor (NO un ScheduledThreadPool)_

TODO
> En un *supermercat* hi tenim diverses caixes que quan els hi arriba un cient calculen el preu total de tot el seu
> carro de la compra: 
- > El [Client](src/a1/Client.java) ha de tenir un nom i una llista dels preus dels productes que representa el que ha posat al carro, 
- > Si ha posat dos productes iguals a la llista li surten dos preus iguals, si hi han 20 productes la llista té una mida de 20.
- > Una Caixa rep un Client i calcula el preu total de tots els productes que hi ha a la llista, despŕés imprimeix el 
resultat.
- > Com que hi ha diversos clients, cada client és assignat a una caixa diferent. Les caixes treballen alhora,
paral·lelament, però els clients d'una caixa atenen als clients seqüencialment.
- > Fer un programa *MainSupermercat* per comprovar el funcionament de tpt plegat, creant com a mínim dos clients amb la seva
llista de productes i dues caixes, una per cada client.
- > Al final imprimeix el que ha de paga cada client.
