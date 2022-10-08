document.addEventListener('DOMContentLoaded', async () => {


    const newEvent = document.querySelector("form");
    newEvent.addEventListener("submit", handleFormSubmit);
    

    async function handleFormSubmit(event) {
        event.preventDefault();
        let eventName = document.getElementById("eventName").value;
        let eventDescription = document.getElementById("eventDescription").value;
        let eventPrice = document.getElementById("eventPrice").value;
        let eventAddress = document.getElementById("eventAddress").value;
        let eventDate = document.getElementById("eventDate").value;
        let eventImage = document.getElementById("eventImage").value;
        let varBody = {
            "address": eventAddress,
            "date": eventDate,
            "description": eventDescription,
            "image": eventImage,
            "name": eventName,
            "price": eventPrice
        };
        console.log(varBody);
        const url = "/evento";

        const fetchOptions = {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
                "Accept": "application/json"
            },
            body: JSON.stringify(varBody),
        };
        const response = await fetch(url, fetchOptions);
        if (!response.ok) {
            const errorMessage = await response.text();
            throw new Error(errorMessage);
        }
        return response.json();
    }

})