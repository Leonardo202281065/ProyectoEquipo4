document.addEventListener('DOMContentLoaded', () => {

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

    const eventContainer = document.querySelector('#eventContainer');

    async function fetchEvents() {
        const response = await fetch('/evento');
        // waits until the request completes...

        const events = await response.json();
        return events;
      }



      fetchEvents()
      .then(events => {
          
  
          shuffle(events);
          events.forEach(evento => {
              console.log(evento);
              eventContainer.innerHTML += `
  
            <article class="event">

                    <a>
                        <div class="img">
                            <img   src="${evento.image}" alt="" >
                        </div>
                    </a>
                    <div class="event-description">
                        <h5 class="event-title">${evento.name}</h5>
                        <ul class="list-group list-group-flush">
                        <li class="list-group-item">${evento.date}</li>
                        <li class="list-group-item">$${evento.price}</li>
                        </ul>
                    </div>
             </article>
            `
        });
    })
})