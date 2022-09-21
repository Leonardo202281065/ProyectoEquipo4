document.addEventListener('DOMContentLoaded', () => {
    console.log("Hola mundo");

    function shuffle(a) {
        var j, x, i;
        for (i = a.length - 1; i > 0; i--) {
            j = Math.floor(Math.random() * (i + 1));
            x = a[i];
            a[i] = a[j];
            a[j] = x;
        }
        return a;
    }

    const searchContainer = document.querySelector('#searchContainer');
    console.log(searchContainer);

    fetch('./data/eventos.json')
    .then(response => response.json())
    .then(data => {
        

        shuffle(data);
        console.log(data);
        data.forEach(evento => {
            console.log(evento);

/*
imagen circular
<img src="${evento.imagen}" class="img-responsive img-circle"  width="600" alt="Cinque Terre">
*/

        searchContainer.innerHTML += `
            <article class="event">

                    <a>
                        <div class="img">
                            <img   src="${evento.imagen}" alt="" >
                        </div>
                    </a>
                    <div class="event-description">
                        <h5 class="event-title">${evento.nombre}</h5>
                        <ul class="list-group list-group-flush">
                        <li class="list-group-item">${evento.puntoDeEncuentro.fecha}</li>
                        <li class="list-group-item">$${evento.valor}</li>
                        </ul>
                    </div>
             </article>
            `
        });
    })
})