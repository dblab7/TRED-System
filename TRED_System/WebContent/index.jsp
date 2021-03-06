<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
    <title>Simple markers</title>
    <style>
      html, body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
      #map {
        height: 100%;
      }
    </style>
    <!--  디바이스에 최적화된 크기로 출력됨 -->
    <meta name = "viewport" content = "width=device-width, initial-scale=1">
  </head>
  <body>
    <div id="map"></div>    
    <script>

    
function initMap() {
	
	
  var myLatLng = {lat: 37.544553, lng: 127.017309};
  var myLatLng2 = {lat: 37.000553, lng: 127.888309};
  var myLatLng3 = {lat: 37.55839551, lng: 126.98631476};
  var myLatLng4 = {lat: 37.55839551, lng: 126.98631476};
  
  var messages = ['서울', '대구','부산', '광주','울산']

  var map = new google.maps.Map(document.getElementById('map'), {
    zoom: 16,
    center: myLatLng
  });

  var marker = new google.maps.Marker({
    position: myLatLng,
    map: map,
    title: 'Hello World!'
  });

  
  var marker2 = new google.maps.Marker({
	    position: myLatLng2,
	    map: map,
	    title: 'Hello World!'
	  });
  
  var marker3 = new google.maps.Marker({
	    position: myLatLng3,
	    map: map,
	    title: '청계천 빛초롱 축제 #seoul #korea thx pic.@talalamtamic @ 청계천 서울 빛초롱 축제'
	  });
  
  var marker4 = new google.maps.Marker({
	    position: myLatLng4,
	    map: map,
	    title: '청계천에서 축제를있어요! 울빛초롱축제이다!! #울빛초롱축제 #청계처 @ 청계천 서울 빛초롱 축제'
	  });
  var geocoder = new google.maps.Geocoder();
  geocodeAddress(geocoder, map);
}



  function geocodeAddress(geocoder, resultsMap) {
	  
	  var address = '서울';
	  geocoder.geocode({'address': address}, function(results, status) {
	    if (status === google.maps.GeocoderStatus.OK) {
	      resultsMap.setCenter(results[0].geometry.location);
	      var marker = new google.maps.Marker({
	        map: resultsMap,
	        position: results[0].geometry.location
	      });
	    } else {
	      alert('Geocode was not successful for the following reason: ' + status);
	    }
	  });
	  
	}


  	
    </script>
    <script async defer
      src="https://maps.googleapis.com/maps/api/js?KEY=AIzaSyCMGYQw968m-CL6QR5-5EZXxQZ_uo41dLQ&callback=initMap">
    </script>
    
  </body>
</html>