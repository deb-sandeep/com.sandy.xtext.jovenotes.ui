/*
 * generated by Xtext
 */
package com.sandy.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.sandy.xtext.services.JoveNotesGrammarAccess;

public class JoveNotesParser extends AbstractContentAssistParser {
	
	@Inject
	private JoveNotesGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.sandy.xtext.ui.contentassist.antlr.internal.InternalJoveNotesParser createParser() {
		com.sandy.xtext.ui.contentassist.antlr.internal.InternalJoveNotesParser result = new com.sandy.xtext.ui.contentassist.antlr.internal.InternalJoveNotesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getNotesElementAccess().getAlternatives_0(), "rule__NotesElement__Alternatives_0");
					put(grammarAccess.getRTCElementAccess().getAlternatives(), "rule__RTCElement__Alternatives");
					put(grammarAccess.getJoveNotesAccess().getGroup(), "rule__JoveNotes__Group__0");
					put(grammarAccess.getProcessingHintsAccess().getGroup(), "rule__ProcessingHints__Group__0");
					put(grammarAccess.getChapterDetailsAccess().getGroup(), "rule__ChapterDetails__Group__0");
					put(grammarAccess.getNotesElementAccess().getGroup(), "rule__NotesElement__Group__0");
					put(grammarAccess.getWordMeaningAccess().getGroup(), "rule__WordMeaning__Group__0");
					put(grammarAccess.getQuestionAnswerAccess().getGroup(), "rule__QuestionAnswer__Group__0");
					put(grammarAccess.getFIBAccess().getGroup(), "rule__FIB__Group__0");
					put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
					put(grammarAccess.getCharacterAccess().getGroup(), "rule__Character__Group__0");
					put(grammarAccess.getTeacherNoteAccess().getGroup(), "rule__TeacherNote__Group__0");
					put(grammarAccess.getMatchingAccess().getGroup(), "rule__Matching__Group__0");
					put(grammarAccess.getMatchPairAccess().getGroup(), "rule__MatchPair__Group__0");
					put(grammarAccess.getMatchMCQConfigAccess().getGroup(), "rule__MatchMCQConfig__Group__0");
					put(grammarAccess.getMatchMCQConfigAccess().getGroup_4(), "rule__MatchMCQConfig__Group_4__0");
					put(grammarAccess.getMatchMCQConfigAccess().getGroup_5(), "rule__MatchMCQConfig__Group_5__0");
					put(grammarAccess.getMatchMCQConfigAccess().getGroup_6(), "rule__MatchMCQConfig__Group_6__0");
					put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
					put(grammarAccess.getTrueFalseAccess().getGroup(), "rule__TrueFalse__Group__0");
					put(grammarAccess.getChemEquationAccess().getGroup(), "rule__ChemEquation__Group__0");
					put(grammarAccess.getChemCompoundAccess().getGroup(), "rule__ChemCompound__Group__0");
					put(grammarAccess.getSpellbeeAccess().getGroup(), "rule__Spellbee__Group__0");
					put(grammarAccess.getImageLabelAccess().getGroup(), "rule__ImageLabel__Group__0");
					put(grammarAccess.getImageLabelAccess().getGroup_7(), "rule__ImageLabel__Group_7__0");
					put(grammarAccess.getHotSpotAccess().getGroup(), "rule__HotSpot__Group__0");
					put(grammarAccess.getEquationAccess().getGroup(), "rule__Equation__Group__0");
					put(grammarAccess.getEquationAccess().getGroup_7(), "rule__Equation__Group_7__0");
					put(grammarAccess.getEqSymbolAccess().getGroup(), "rule__EqSymbol__Group__0");
					put(grammarAccess.getRefToContextAccess().getGroup(), "rule__RefToContext__Group__0");
					put(grammarAccess.getMultiChoiceAccess().getGroup(), "rule__MultiChoice__Group__0");
					put(grammarAccess.getMultiChoiceAccess().getGroup_7(), "rule__MultiChoice__Group_7__0");
					put(grammarAccess.getMultiChoiceAccess().getGroup_9(), "rule__MultiChoice__Group_9__0");
					put(grammarAccess.getMultiChoiceAccess().getGroup_10(), "rule__MultiChoice__Group_10__0");
					put(grammarAccess.getMultiChoiceAccess().getGroup_11(), "rule__MultiChoice__Group_11__0");
					put(grammarAccess.getExerciseAccess().getGroup(), "rule__Exercise__Group__0");
					put(grammarAccess.getExerciseAccess().getGroup_2(), "rule__Exercise__Group_2__0");
					put(grammarAccess.getExerciseAccess().getGroup_4(), "rule__Exercise__Group_4__0");
					put(grammarAccess.getExerciseAccess().getGroup_5(), "rule__Exercise__Group_5__0");
					put(grammarAccess.getVoiceToTextAccess().getGroup(), "rule__VoiceToText__Group__0");
					put(grammarAccess.getCompilerBreakAccess().getGroup(), "rule__CompilerBreak__Group__0");
					put(grammarAccess.getChapterSectionAccess().getGroup(), "rule__ChapterSection__Group__0");
					put(grammarAccess.getOptionAccess().getGroup(), "rule__Option__Group__0");
					put(grammarAccess.getCMapAccess().getGroup(), "rule__CMap__Group__0");
					put(grammarAccess.getScriptAccess().getGroup(), "rule__Script__Group__0");
					put(grammarAccess.getScriptAccess().getGroup_3(), "rule__Script__Group_3__0");
					put(grammarAccess.getEvalVarAccess().getGroup(), "rule__EvalVar__Group__0");
					put(grammarAccess.getScriptBodyAccess().getGroup(), "rule__ScriptBody__Group__0");
					put(grammarAccess.getJoveNotesAccess().getProcessingHintsAssignment_0(), "rule__JoveNotes__ProcessingHintsAssignment_0");
					put(grammarAccess.getJoveNotesAccess().getChapterDetailsAssignment_1(), "rule__JoveNotes__ChapterDetailsAssignment_1");
					put(grammarAccess.getJoveNotesAccess().getNotesElementsAssignment_2(), "rule__JoveNotes__NotesElementsAssignment_2");
					put(grammarAccess.getProcessingHintsAccess().getSkipGenerationAssignment_1(), "rule__ProcessingHints__SkipGenerationAssignment_1");
					put(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionAssignment_2(), "rule__ProcessingHints__SkipGenerationInProductionAssignment_2");
					put(grammarAccess.getChapterDetailsAccess().getExerciseBankAssignment_0(), "rule__ChapterDetails__ExerciseBankAssignment_0");
					put(grammarAccess.getChapterDetailsAccess().getSubjectNameAssignment_2(), "rule__ChapterDetails__SubjectNameAssignment_2");
					put(grammarAccess.getChapterDetailsAccess().getChapterNumberAssignment_4(), "rule__ChapterDetails__ChapterNumberAssignment_4");
					put(grammarAccess.getChapterDetailsAccess().getSubChapterNumberAssignment_6(), "rule__ChapterDetails__SubChapterNumberAssignment_6");
					put(grammarAccess.getChapterDetailsAccess().getChapterNameAssignment_8(), "rule__ChapterDetails__ChapterNameAssignment_8");
					put(grammarAccess.getChapterDetailsAccess().getScriptBodyAssignment_9(), "rule__ChapterDetails__ScriptBodyAssignment_9");
					put(grammarAccess.getNotesElementAccess().getScriptAssignment_1(), "rule__NotesElement__ScriptAssignment_1");
					put(grammarAccess.getWordMeaningAccess().getHideFromViewAssignment_1(), "rule__WordMeaning__HideFromViewAssignment_1");
					put(grammarAccess.getWordMeaningAccess().getWordAssignment_2(), "rule__WordMeaning__WordAssignment_2");
					put(grammarAccess.getWordMeaningAccess().getMeaningAssignment_3(), "rule__WordMeaning__MeaningAssignment_3");
					put(grammarAccess.getQuestionAnswerAccess().getHideFromViewAssignment_1(), "rule__QuestionAnswer__HideFromViewAssignment_1");
					put(grammarAccess.getQuestionAnswerAccess().getQuestionAssignment_2(), "rule__QuestionAnswer__QuestionAssignment_2");
					put(grammarAccess.getQuestionAnswerAccess().getAnswerPartsAssignment_3(), "rule__QuestionAnswer__AnswerPartsAssignment_3");
					put(grammarAccess.getQuestionAnswerAccess().getCmapAssignment_4(), "rule__QuestionAnswer__CmapAssignment_4");
					put(grammarAccess.getFIBAccess().getHideFromViewAssignment_1(), "rule__FIB__HideFromViewAssignment_1");
					put(grammarAccess.getFIBAccess().getQuestionAssignment_2(), "rule__FIB__QuestionAssignment_2");
					put(grammarAccess.getFIBAccess().getAnswersAssignment_3(), "rule__FIB__AnswersAssignment_3");
					put(grammarAccess.getDefinitionAccess().getHideFromViewAssignment_1(), "rule__Definition__HideFromViewAssignment_1");
					put(grammarAccess.getDefinitionAccess().getTermAssignment_2(), "rule__Definition__TermAssignment_2");
					put(grammarAccess.getDefinitionAccess().getDefinitionAssignment_3(), "rule__Definition__DefinitionAssignment_3");
					put(grammarAccess.getDefinitionAccess().getCmapAssignment_4(), "rule__Definition__CmapAssignment_4");
					put(grammarAccess.getCharacterAccess().getHideFromViewAssignment_1(), "rule__Character__HideFromViewAssignment_1");
					put(grammarAccess.getCharacterAccess().getCharacterAssignment_2(), "rule__Character__CharacterAssignment_2");
					put(grammarAccess.getCharacterAccess().getEstimateAssignment_3(), "rule__Character__EstimateAssignment_3");
					put(grammarAccess.getCharacterAccess().getCmapAssignment_4(), "rule__Character__CmapAssignment_4");
					put(grammarAccess.getTeacherNoteAccess().getHideFromViewAssignment_1(), "rule__TeacherNote__HideFromViewAssignment_1");
					put(grammarAccess.getTeacherNoteAccess().getCaptionAssignment_2(), "rule__TeacherNote__CaptionAssignment_2");
					put(grammarAccess.getTeacherNoteAccess().getNoteAssignment_3(), "rule__TeacherNote__NoteAssignment_3");
					put(grammarAccess.getTeacherNoteAccess().getCmapAssignment_4(), "rule__TeacherNote__CmapAssignment_4");
					put(grammarAccess.getMatchingAccess().getHideFromViewAssignment_1(), "rule__Matching__HideFromViewAssignment_1");
					put(grammarAccess.getMatchingAccess().getSkipReverseQuestionAssignment_2(), "rule__Matching__SkipReverseQuestionAssignment_2");
					put(grammarAccess.getMatchingAccess().getQuestionAssignment_3(), "rule__Matching__QuestionAssignment_3");
					put(grammarAccess.getMatchingAccess().getPairsAssignment_5(), "rule__Matching__PairsAssignment_5");
					put(grammarAccess.getMatchingAccess().getMcqConfigAssignment_6(), "rule__Matching__McqConfigAssignment_6");
					put(grammarAccess.getMatchPairAccess().getMatchQuestionAssignment_0(), "rule__MatchPair__MatchQuestionAssignment_0");
					put(grammarAccess.getMatchPairAccess().getMatchAnswerAssignment_2(), "rule__MatchPair__MatchAnswerAssignment_2");
					put(grammarAccess.getMatchMCQConfigAccess().getForwardCaptionAssignment_3(), "rule__MatchMCQConfig__ForwardCaptionAssignment_3");
					put(grammarAccess.getMatchMCQConfigAccess().getReverseCaptionAssignment_4_1(), "rule__MatchMCQConfig__ReverseCaptionAssignment_4_1");
					put(grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowAssignment_5_1(), "rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1");
					put(grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowAssignment_6_1(), "rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1");
					put(grammarAccess.getEventAccess().getHideFromViewAssignment_1(), "rule__Event__HideFromViewAssignment_1");
					put(grammarAccess.getEventAccess().getEventAssignment_2(), "rule__Event__EventAssignment_2");
					put(grammarAccess.getEventAccess().getTimeAssignment_3(), "rule__Event__TimeAssignment_3");
					put(grammarAccess.getTrueFalseAccess().getHideFromViewAssignment_1(), "rule__TrueFalse__HideFromViewAssignment_1");
					put(grammarAccess.getTrueFalseAccess().getStatementAssignment_2(), "rule__TrueFalse__StatementAssignment_2");
					put(grammarAccess.getTrueFalseAccess().getTruthValueAssignment_3(), "rule__TrueFalse__TruthValueAssignment_3");
					put(grammarAccess.getTrueFalseAccess().getJustificationAssignment_4(), "rule__TrueFalse__JustificationAssignment_4");
					put(grammarAccess.getChemEquationAccess().getHideFromViewAssignment_1(), "rule__ChemEquation__HideFromViewAssignment_1");
					put(grammarAccess.getChemEquationAccess().getDescriptionAssignment_2(), "rule__ChemEquation__DescriptionAssignment_2");
					put(grammarAccess.getChemEquationAccess().getReactantsAssignment_4(), "rule__ChemEquation__ReactantsAssignment_4");
					put(grammarAccess.getChemEquationAccess().getProducesAssignment_6(), "rule__ChemEquation__ProducesAssignment_6");
					put(grammarAccess.getChemEquationAccess().getProductsAssignment_8(), "rule__ChemEquation__ProductsAssignment_8");
					put(grammarAccess.getChemCompoundAccess().getHideFromViewAssignment_1(), "rule__ChemCompound__HideFromViewAssignment_1");
					put(grammarAccess.getChemCompoundAccess().getSymbolAssignment_2(), "rule__ChemCompound__SymbolAssignment_2");
					put(grammarAccess.getChemCompoundAccess().getChemicalNameAssignment_3(), "rule__ChemCompound__ChemicalNameAssignment_3");
					put(grammarAccess.getChemCompoundAccess().getCommonNameAssignment_4(), "rule__ChemCompound__CommonNameAssignment_4");
					put(grammarAccess.getSpellbeeAccess().getHideFromViewAssignment_1(), "rule__Spellbee__HideFromViewAssignment_1");
					put(grammarAccess.getSpellbeeAccess().getWordAssignment_2(), "rule__Spellbee__WordAssignment_2");
					put(grammarAccess.getImageLabelAccess().getHideFromViewAssignment_1(), "rule__ImageLabel__HideFromViewAssignment_1");
					put(grammarAccess.getImageLabelAccess().getCaptionAssignment_2(), "rule__ImageLabel__CaptionAssignment_2");
					put(grammarAccess.getImageLabelAccess().getImageNameAssignment_5(), "rule__ImageLabel__ImageNameAssignment_5");
					put(grammarAccess.getImageLabelAccess().getHotspotsAssignment_6(), "rule__ImageLabel__HotspotsAssignment_6");
					put(grammarAccess.getImageLabelAccess().getHotspotsAssignment_7_1(), "rule__ImageLabel__HotspotsAssignment_7_1");
					put(grammarAccess.getHotSpotAccess().getXAssignment_0(), "rule__HotSpot__XAssignment_0");
					put(grammarAccess.getHotSpotAccess().getYAssignment_2(), "rule__HotSpot__YAssignment_2");
					put(grammarAccess.getHotSpotAccess().getLabelAssignment_4(), "rule__HotSpot__LabelAssignment_4");
					put(grammarAccess.getEquationAccess().getHideFromViewAssignment_1(), "rule__Equation__HideFromViewAssignment_1");
					put(grammarAccess.getEquationAccess().getEquationAssignment_2(), "rule__Equation__EquationAssignment_2");
					put(grammarAccess.getEquationAccess().getDescriptionAssignment_4(), "rule__Equation__DescriptionAssignment_4");
					put(grammarAccess.getEquationAccess().getSymbolsAssignment_6(), "rule__Equation__SymbolsAssignment_6");
					put(grammarAccess.getEquationAccess().getSymbolsAssignment_7_1(), "rule__Equation__SymbolsAssignment_7_1");
					put(grammarAccess.getEqSymbolAccess().getSymbolAssignment_0(), "rule__EqSymbol__SymbolAssignment_0");
					put(grammarAccess.getEqSymbolAccess().getDescriptionAssignment_2(), "rule__EqSymbol__DescriptionAssignment_2");
					put(grammarAccess.getRefToContextAccess().getHideFromViewAssignment_1(), "rule__RefToContext__HideFromViewAssignment_1");
					put(grammarAccess.getRefToContextAccess().getContextAssignment_4(), "rule__RefToContext__ContextAssignment_4");
					put(grammarAccess.getRefToContextAccess().getRtcElementAssignment_5(), "rule__RefToContext__RtcElementAssignment_5");
					put(grammarAccess.getMultiChoiceAccess().getHideFromViewAssignment_1(), "rule__MultiChoice__HideFromViewAssignment_1");
					put(grammarAccess.getMultiChoiceAccess().getQuestionAssignment_2(), "rule__MultiChoice__QuestionAssignment_2");
					put(grammarAccess.getMultiChoiceAccess().getOptionsAssignment_6(), "rule__MultiChoice__OptionsAssignment_6");
					put(grammarAccess.getMultiChoiceAccess().getOptionsAssignment_7_1(), "rule__MultiChoice__OptionsAssignment_7_1");
					put(grammarAccess.getMultiChoiceAccess().getNumOptionsToShowAssignment_9_1(), "rule__MultiChoice__NumOptionsToShowAssignment_9_1");
					put(grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowAssignment_10_1(), "rule__MultiChoice__NumOptionsPerRowAssignment_10_1");
					put(grammarAccess.getMultiChoiceAccess().getExplanationAssignment_11_1(), "rule__MultiChoice__ExplanationAssignment_11_1");
					put(grammarAccess.getExerciseAccess().getHideFromViewAssignment_1(), "rule__Exercise__HideFromViewAssignment_1");
					put(grammarAccess.getExerciseAccess().getMarksAssignment_2_2(), "rule__Exercise__MarksAssignment_2_2");
					put(grammarAccess.getExerciseAccess().getQuestionAssignment_3(), "rule__Exercise__QuestionAssignment_3");
					put(grammarAccess.getExerciseAccess().getHintsAssignment_4_2(), "rule__Exercise__HintsAssignment_4_2");
					put(grammarAccess.getExerciseAccess().getAnswerAssignment_5_1(), "rule__Exercise__AnswerAssignment_5_1");
					put(grammarAccess.getVoiceToTextAccess().getHideFromViewAssignment_1(), "rule__VoiceToText__HideFromViewAssignment_1");
					put(grammarAccess.getVoiceToTextAccess().getClipNameAssignment_2(), "rule__VoiceToText__ClipNameAssignment_2");
					put(grammarAccess.getVoiceToTextAccess().getTextAssignment_3(), "rule__VoiceToText__TextAssignment_3");
					put(grammarAccess.getChapterSectionAccess().getSectionNameAssignment_1(), "rule__ChapterSection__SectionNameAssignment_1");
					put(grammarAccess.getOptionAccess().getOptionValueAssignment_0(), "rule__Option__OptionValueAssignment_0");
					put(grammarAccess.getOptionAccess().getCorrectOptionAssignment_1(), "rule__Option__CorrectOptionAssignment_1");
					put(grammarAccess.getCMapAccess().getContentAssignment_2(), "rule__CMap__ContentAssignment_2");
					put(grammarAccess.getScriptAccess().getEvalVarsAssignment_2(), "rule__Script__EvalVarsAssignment_2");
					put(grammarAccess.getScriptAccess().getEvalVarsAssignment_3_1(), "rule__Script__EvalVarsAssignment_3_1");
					put(grammarAccess.getScriptAccess().getScriptBodyAssignment_5(), "rule__Script__ScriptBodyAssignment_5");
					put(grammarAccess.getEvalVarAccess().getVarNameAssignment_0(), "rule__EvalVar__VarNameAssignment_0");
					put(grammarAccess.getEvalVarAccess().getVarExpressionAssignment_2(), "rule__EvalVar__VarExpressionAssignment_2");
					put(grammarAccess.getScriptBodyAccess().getScriptAssignment_2(), "rule__ScriptBody__ScriptAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.sandy.xtext.ui.contentassist.antlr.internal.InternalJoveNotesParser typedParser = (com.sandy.xtext.ui.contentassist.antlr.internal.InternalJoveNotesParser) parser;
			typedParser.entryRuleJoveNotes();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public JoveNotesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JoveNotesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
