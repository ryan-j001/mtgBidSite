/**
 * Created by ryanj on 5/18/2017.
 */
//var request = new XMLHttpRequest();
//var count =25;
//var result;

//request.open('GET', 'getSearchResults', true);
//request.send();
//document.writeln(request.responseText);
//console.log(request.responseText);
//result=request.responseText;


$(document).ready(function () {
    $("button").click(function () {
        $.ajax({
            url: "getSearchResults",
            async: false,
            dataType: 'json',
            success: function (result) {
                console.log(result);
                for (var property in result){
                    var row = "<p>" + property.valueOf() +":"+ result[property]  + "</p>";
                }
                $("div").html("<p> Result is " + row + "</p>");
            }
        });
    });
});
