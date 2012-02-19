package cz.mapyhazardu.android;

import android.location.Location;

import com.google.android.maps.GeoPoint;

import cz.mapyhazardu.api.domain.GeographicCoordinate;

public class LocationUtils {

	public static GeoPoint getGeoPoint(GeographicCoordinate coordinate) {
		return getGeoPoint(coordinate.getLatitude(), coordinate.getLongtitude());
	}
	
	public static GeoPoint getGeoPoint(Location location) {
		return getGeoPoint(location.getLatitude(), location.getLongitude());
	}
	
	public static GeoPoint getGeoPoint(double latitude, double longtitude) {
		int lat = (int) (latitude * 1E6);
		int lng = (int) (longtitude * 1E6);
		GeoPoint point = new GeoPoint(lat, lng);
		return point;
	}
}
