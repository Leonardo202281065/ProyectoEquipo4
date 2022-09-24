document.addEventListener('DOMContentLoaded', () => {
    console.log("Hola mundo");

    const eventView = document.querySelector('#eventView');
    console.log(eventView);

    fetch('./data/evento.json')
    .then(response => response.json())
    .then(data => {
        
        console.log(data);
        data.forEach(evento => {
            console.log(evento);


            eventView.innerHTML += `
            <article class="event">

                    <div class="imgEventView">
                        <img   src="${evento.imagen}" alt="" >
                    </div>
                    <div class="event-view">
                        <h5 class="event-title">${evento.nombre}</h5>
                        <p>${evento.descripcion}</p>
                        <ul class="list-group list-group-flush">
                        <li class="list-group-item"><img   src="images/price.png" alt="" ><span class="price">  $${evento.valor}</span></li>
                        <li class="list-group-item"><img   src="images/address.png" alt="" ><span class="address">  ${evento.puntoDeEncuentro.direccion}</span></li>

                        <li class="list-group-item"><img   src="images/date.png" alt="" ><span class="date">  ${evento.puntoDeEncuentro.fecha}</span></li>
                        </ul>
                    </div>
             </article>
            `
        });
    })
})