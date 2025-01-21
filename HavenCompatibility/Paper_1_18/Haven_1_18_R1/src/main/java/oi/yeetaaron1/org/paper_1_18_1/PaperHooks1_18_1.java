package oi.yeetaaron1.org.paper_1_18_1;

import net.minecraft.SharedConstants;
import oi.yeetaaron1.org.PaperHooks;
import org.slf4j.Logger;

public class PaperHooks1_18_1 implements PaperHooks {
  @Override
  public void doSomething(final Logger logger) {
    logger.info(SharedConstants.getCurrentVersion().getName());
  }
}
