/**
 * Created by ryanj on 5/18/2017.
 */
var request = new XMLHttpRequest();
var count =25;

    request.open('GET', 'getSearchResults', true);
    request.send();
    document.writeln(request.responseText);
    console.log(request.responseText);

