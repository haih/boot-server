/**
 * 
 */
package com.haih.utils.tracking;

import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author haih
 *
 */
public class TrackingServiceImpl extends TrackingService {

	private String _trackingId;
	private int _maxTrackingIdLength;

	public TrackingServiceImpl(String trackingId, int maxTrackingIdLength) {
		super(trackingId, maxTrackingIdLength);
		_maxTrackingIdLength = maxTrackingIdLength;
		if (trackingId.length() > maxTrackingIdLength) {
			if (!decodeTrackingId())
				generateTrackingId();
		}
	}

	private boolean decodeTrackingId() {
		if (_trackingId == null || _trackingId.equals("")
				|| _trackingId.length() > _maxTrackingIdLength)
			return false;
		String fields[] = _trackingId.split("_");
		if (fields == null || fields.length < 2) {
			return false;
		}
		return true;
	}

	public String getTrackingId() {
		return _trackingId;
	}

	public String generateTrackingId() {
		String _uniqueId = UUID.randomUUID().toString();
		String _sessionId = "sdfsdf";
		return new StringBuilder(String.valueOf(_sessionId)).append("_")
				.append(_uniqueId).toString();
	}

	public static void main(String[] args) {
		String _uniqueId = UUID.randomUUID().toString();
		String _sessionId = "sdfsdf";
		String string = new StringBuilder(String.valueOf(_sessionId))
				.append(",").append(_uniqueId).toString();
		System.out.println(string);
		String fields[] = string.split("[,]");
		System.out.println(fields[0]);
		System.out.println(fields[1]);
	}
}
