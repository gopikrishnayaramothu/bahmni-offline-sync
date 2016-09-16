package org.bahmni.module.bahmniOfflineSync.strategy;


import org.bahmni.module.bahmniOfflineSync.eventLog.EventLog;
import org.ict4h.atomfeed.server.domain.EventRecord;

import java.util.List;
import java.util.Map;

public interface OfflineSyncStrategy {
    public List<EventLog> getEventLogsFromEventRecords(List<EventRecord> eventRecords);

    public Map<String, List<String>> getFilterForDevice(String provider, String addressUuid, String loginLocationUuid);

    public List<String> getEventCategoriesList();
}
