
function buildPerson(name, gender, birthDay) {
    let person = {name: name, gender: gender}
    person.birthDay = new Date(birthDay)
    person.getAge = function () {
        return Math.floor((new Date() - new Date(this.birthDay)) / 1000 / 60 / 60 / 24 / 365)
    }
    return person;
}

function addField(person) {
    let myTable = document.getElementById("resultTable");
    let currentIndex = myTable.rows.length;
    let currentRow = myTable.insertRow(currentIndex - 2);

    currentIndex = currentIndex - 2;
    let currentCell = currentRow.insertCell(-1);
    let newText = document.createTextNode(person.name);
    currentCell.appendChild(newText);
    currentCell.setAttribute("name", "fio" + currentIndex);

    currentCell = currentRow.insertCell(-1);
    newText = document.createTextNode(person.gender);
    currentCell.appendChild(newText);
    currentCell.setAttribute("name", "gender" + currentIndex);

    currentCell = currentRow.insertCell(-1);
    newText = document.createTextNode(person.birthDay.toLocaleDateString("ru-RU"));
    currentCell.appendChild(newText);
    currentCell.setAttribute("name", "birthDay" + currentIndex);

    currentCell = currentRow.insertCell(-1);
    newText = document.createTextNode(person.getAge());
    currentCell.appendChild(newText);
    currentCell.setAttribute("name", "age" + currentIndex);
    currentCell.setAttribute("class", "AgeCell");
    sumAverageOld();
}

function sumAverageOld() {
    let sum = 0;
    let ageCellArray = document.getElementsByClassName("AgeCell");
    for (let i = 0; i < ageCellArray.length; i++) {
        sum = sum + Number(ageCellArray[i].textContent);
    }

    document.getElementsByClassName("resultAge")[0].textContent = Math.round(sum / ageCellArray.length);
}