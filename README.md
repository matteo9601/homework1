# homework1
 SCELTE PER IL FETCHING:
 Tra Corso e Allievo ho scelto di lasciare la stategia di fetch di default , ovvero Lazy ,così che se volessi andare a recuperare le informazioni del corso noon devo per forza andare a caricare tutti i dati relativi gli allievi (operazione dispendiosa).
 Mentre tra Allievo e Corso ho scelto di adottare la strategia EAGER in tal modo mi verranno caricati tutti i corsi a cui partecipa un Allievo.
 Per quanto riguarda le altre associazioni ho mantenuto i valori di default(probabilmente più efficienti)

SCELTE PER I CASCADE:
Ho scelto di mettere i Cascade sia su Docente-Corso che su Corso-Docente , pensando fosse la scelta migliore per la persistenza.
