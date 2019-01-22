package facade;

import java.util.Date;
import service.CalculationService;
import service.SaveLogService;
import service.SyncDataService;

public class CheckInFacade {
  private static final CheckInFacade INSTANCE = new CheckInFacade();
  private SaveLogService saveLogService;
  private CalculationService calculationService;
  private SyncDataService syncDataService;

  private CheckInFacade() {
    this.saveLogService = new SaveLogService();
    this.calculationService = new CalculationService();
    this.syncDataService = new SyncDataService();
  }
  public static CheckInFacade getInstance() {
    return INSTANCE;
  }

  public void  putLog(Date date){
    saveLogService.save(date);
    calculationService.calculate(date);
    syncDataService.sync(date);
  }
}
