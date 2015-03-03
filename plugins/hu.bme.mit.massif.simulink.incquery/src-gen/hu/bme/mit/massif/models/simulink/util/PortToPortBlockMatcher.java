package hu.bme.mit.massif.models.simulink.util;

import hu.bme.mit.massif.models.simulink.util.PortToPortBlockMatch;
import hu.bme.mit.massif.models.simulink.util.util.PortToPortBlockQuerySpecification;
import hu.bme.mit.massif.simulink.Port;
import hu.bme.mit.massif.simulink.PortBlock;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.massif.models.simulink.util.portToPortBlock pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PortToPortBlockMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern portToPortBlock(port : Port, portBlock : PortBlock) {
 * 	Port.portBlock(port, portBlock);
 * }
 * </pre></code>
 * 
 * @see PortToPortBlockMatch
 * @see PortToPortBlockProcessor
 * @see PortToPortBlockQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PortToPortBlockMatcher extends BaseMatcher<PortToPortBlockMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PortToPortBlockMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    PortToPortBlockMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new PortToPortBlockMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_PORT = 0;
  
  private final static int POSITION_PORTBLOCK = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(PortToPortBlockMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public PortToPortBlockMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public PortToPortBlockMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPort the fixed value of pattern parameter port, or null if not bound.
   * @param pPortBlock the fixed value of pattern parameter portBlock, or null if not bound.
   * @return matches represented as a PortToPortBlockMatch object.
   * 
   */
  public Collection<PortToPortBlockMatch> getAllMatches(final Port pPort, final PortBlock pPortBlock) {
    return rawGetAllMatches(new Object[]{pPort, pPortBlock});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPort the fixed value of pattern parameter port, or null if not bound.
   * @param pPortBlock the fixed value of pattern parameter portBlock, or null if not bound.
   * @return a match represented as a PortToPortBlockMatch object, or null if no match is found.
   * 
   */
  public PortToPortBlockMatch getOneArbitraryMatch(final Port pPort, final PortBlock pPortBlock) {
    return rawGetOneArbitraryMatch(new Object[]{pPort, pPortBlock});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pPort the fixed value of pattern parameter port, or null if not bound.
   * @param pPortBlock the fixed value of pattern parameter portBlock, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Port pPort, final PortBlock pPortBlock) {
    return rawHasMatch(new Object[]{pPort, pPortBlock});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPort the fixed value of pattern parameter port, or null if not bound.
   * @param pPortBlock the fixed value of pattern parameter portBlock, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Port pPort, final PortBlock pPortBlock) {
    return rawCountMatches(new Object[]{pPort, pPortBlock});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pPort the fixed value of pattern parameter port, or null if not bound.
   * @param pPortBlock the fixed value of pattern parameter portBlock, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Port pPort, final PortBlock pPortBlock, final IMatchProcessor<? super PortToPortBlockMatch> processor) {
    rawForEachMatch(new Object[]{pPort, pPortBlock}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPort the fixed value of pattern parameter port, or null if not bound.
   * @param pPortBlock the fixed value of pattern parameter portBlock, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Port pPort, final PortBlock pPortBlock, final IMatchProcessor<? super PortToPortBlockMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pPort, pPortBlock}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPort the fixed value of pattern parameter port, or null if not bound.
   * @param pPortBlock the fixed value of pattern parameter portBlock, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public PortToPortBlockMatch newMatch(final Port pPort, final PortBlock pPortBlock) {
    return PortToPortBlockMatch.newMatch(pPort, pPortBlock);
  }
  
  /**
   * Retrieve the set of values that occur in matches for port.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Port> rawAccumulateAllValuesOfport(final Object[] parameters) {
    Set<Port> results = new HashSet<Port>();
    rawAccumulateAllValues(POSITION_PORT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for port.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Port> getAllValuesOfport() {
    return rawAccumulateAllValuesOfport(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for port.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Port> getAllValuesOfport(final PortToPortBlockMatch partialMatch) {
    return rawAccumulateAllValuesOfport(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for port.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Port> getAllValuesOfport(final PortBlock pPortBlock) {
    return rawAccumulateAllValuesOfport(new Object[]{
    null, 
    pPortBlock
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for portBlock.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<PortBlock> rawAccumulateAllValuesOfportBlock(final Object[] parameters) {
    Set<PortBlock> results = new HashSet<PortBlock>();
    rawAccumulateAllValues(POSITION_PORTBLOCK, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for portBlock.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PortBlock> getAllValuesOfportBlock() {
    return rawAccumulateAllValuesOfportBlock(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for portBlock.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PortBlock> getAllValuesOfportBlock(final PortToPortBlockMatch partialMatch) {
    return rawAccumulateAllValuesOfportBlock(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for portBlock.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PortBlock> getAllValuesOfportBlock(final Port pPort) {
    return rawAccumulateAllValuesOfportBlock(new Object[]{
    pPort, 
    null
    });
  }
  
  @Override
  protected PortToPortBlockMatch tupleToMatch(final Tuple t) {
    try {
    	return PortToPortBlockMatch.newMatch((hu.bme.mit.massif.simulink.Port) t.get(POSITION_PORT), (hu.bme.mit.massif.simulink.PortBlock) t.get(POSITION_PORTBLOCK));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PortToPortBlockMatch arrayToMatch(final Object[] match) {
    try {
    	return PortToPortBlockMatch.newMatch((hu.bme.mit.massif.simulink.Port) match[POSITION_PORT], (hu.bme.mit.massif.simulink.PortBlock) match[POSITION_PORTBLOCK]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PortToPortBlockMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return PortToPortBlockMatch.newMutableMatch((hu.bme.mit.massif.simulink.Port) match[POSITION_PORT], (hu.bme.mit.massif.simulink.PortBlock) match[POSITION_PORTBLOCK]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<PortToPortBlockMatcher> querySpecification() throws IncQueryException {
    return PortToPortBlockQuerySpecification.instance();
  }
}
