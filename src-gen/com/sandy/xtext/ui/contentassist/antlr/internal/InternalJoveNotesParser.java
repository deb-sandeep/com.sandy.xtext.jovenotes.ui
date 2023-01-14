package com.sandy.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.sandy.xtext.services.JoveNotesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJoveNotesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'subject'", "'chapterNumber'", "'.'", "'chapterName'", "'@wm'", "'@qa'", "'@fib'", "'@definition'", "'@character'", "'@tn'", "'@match'", "'{'", "'}'", "'='", "'@mcq_config'", "'@forwardCaption'", "'@reverseCaption'", "'@numOptionsToShow'", "'@numOptionsPerRow'", "'@event'", "'@true_false'", "'@chem_equation'", "'>'", "'@chem_compound'", "'@spellbee'", "'@image_label'", "'imageName'", "','", "'@equation'", "'where'", "'@rtc'", "'context'", "'@multi_choice'", "'@options'", "'@explanation'", "'@exercise'", "'marks'", "'hints'", "'answer'", "'@voice2text'", "'@compiler_break'", "'@section'", "'cmap'", "'script_expressions'", "'script'", "'@skip_generation'", "'@skip_generation_in_production'", "'@exercise_bank'", "'hide'", "'skip_reverse_question'", "'correct'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_BOOL=6;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalJoveNotesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJoveNotesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJoveNotesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJoveNotes.g"; }


     
     	private JoveNotesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(JoveNotesGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleJoveNotes"
    // InternalJoveNotes.g:60:1: entryRuleJoveNotes : ruleJoveNotes EOF ;
    public final void entryRuleJoveNotes() throws RecognitionException {
        try {
            // InternalJoveNotes.g:61:1: ( ruleJoveNotes EOF )
            // InternalJoveNotes.g:62:1: ruleJoveNotes EOF
            {
             before(grammarAccess.getJoveNotesRule()); 
            pushFollow(FOLLOW_1);
            ruleJoveNotes();

            state._fsp--;

             after(grammarAccess.getJoveNotesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJoveNotes"


    // $ANTLR start "ruleJoveNotes"
    // InternalJoveNotes.g:69:1: ruleJoveNotes : ( ( rule__JoveNotes__Group__0 ) ) ;
    public final void ruleJoveNotes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:73:2: ( ( ( rule__JoveNotes__Group__0 ) ) )
            // InternalJoveNotes.g:74:1: ( ( rule__JoveNotes__Group__0 ) )
            {
            // InternalJoveNotes.g:74:1: ( ( rule__JoveNotes__Group__0 ) )
            // InternalJoveNotes.g:75:1: ( rule__JoveNotes__Group__0 )
            {
             before(grammarAccess.getJoveNotesAccess().getGroup()); 
            // InternalJoveNotes.g:76:1: ( rule__JoveNotes__Group__0 )
            // InternalJoveNotes.g:76:2: rule__JoveNotes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JoveNotes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoveNotesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoveNotes"


    // $ANTLR start "entryRuleProcessingHints"
    // InternalJoveNotes.g:88:1: entryRuleProcessingHints : ruleProcessingHints EOF ;
    public final void entryRuleProcessingHints() throws RecognitionException {
        try {
            // InternalJoveNotes.g:89:1: ( ruleProcessingHints EOF )
            // InternalJoveNotes.g:90:1: ruleProcessingHints EOF
            {
             before(grammarAccess.getProcessingHintsRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessingHints();

            state._fsp--;

             after(grammarAccess.getProcessingHintsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcessingHints"


    // $ANTLR start "ruleProcessingHints"
    // InternalJoveNotes.g:97:1: ruleProcessingHints : ( ( rule__ProcessingHints__Group__0 ) ) ;
    public final void ruleProcessingHints() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:101:2: ( ( ( rule__ProcessingHints__Group__0 ) ) )
            // InternalJoveNotes.g:102:1: ( ( rule__ProcessingHints__Group__0 ) )
            {
            // InternalJoveNotes.g:102:1: ( ( rule__ProcessingHints__Group__0 ) )
            // InternalJoveNotes.g:103:1: ( rule__ProcessingHints__Group__0 )
            {
             before(grammarAccess.getProcessingHintsAccess().getGroup()); 
            // InternalJoveNotes.g:104:1: ( rule__ProcessingHints__Group__0 )
            // InternalJoveNotes.g:104:2: rule__ProcessingHints__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProcessingHints__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessingHintsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessingHints"


    // $ANTLR start "entryRuleChapterDetails"
    // InternalJoveNotes.g:116:1: entryRuleChapterDetails : ruleChapterDetails EOF ;
    public final void entryRuleChapterDetails() throws RecognitionException {
        try {
            // InternalJoveNotes.g:117:1: ( ruleChapterDetails EOF )
            // InternalJoveNotes.g:118:1: ruleChapterDetails EOF
            {
             before(grammarAccess.getChapterDetailsRule()); 
            pushFollow(FOLLOW_1);
            ruleChapterDetails();

            state._fsp--;

             after(grammarAccess.getChapterDetailsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChapterDetails"


    // $ANTLR start "ruleChapterDetails"
    // InternalJoveNotes.g:125:1: ruleChapterDetails : ( ( rule__ChapterDetails__Group__0 ) ) ;
    public final void ruleChapterDetails() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:129:2: ( ( ( rule__ChapterDetails__Group__0 ) ) )
            // InternalJoveNotes.g:130:1: ( ( rule__ChapterDetails__Group__0 ) )
            {
            // InternalJoveNotes.g:130:1: ( ( rule__ChapterDetails__Group__0 ) )
            // InternalJoveNotes.g:131:1: ( rule__ChapterDetails__Group__0 )
            {
             before(grammarAccess.getChapterDetailsAccess().getGroup()); 
            // InternalJoveNotes.g:132:1: ( rule__ChapterDetails__Group__0 )
            // InternalJoveNotes.g:132:2: rule__ChapterDetails__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChapterDetails__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChapterDetailsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChapterDetails"


    // $ANTLR start "entryRuleNotesElement"
    // InternalJoveNotes.g:144:1: entryRuleNotesElement : ruleNotesElement EOF ;
    public final void entryRuleNotesElement() throws RecognitionException {
        try {
            // InternalJoveNotes.g:145:1: ( ruleNotesElement EOF )
            // InternalJoveNotes.g:146:1: ruleNotesElement EOF
            {
             before(grammarAccess.getNotesElementRule()); 
            pushFollow(FOLLOW_1);
            ruleNotesElement();

            state._fsp--;

             after(grammarAccess.getNotesElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotesElement"


    // $ANTLR start "ruleNotesElement"
    // InternalJoveNotes.g:153:1: ruleNotesElement : ( ( rule__NotesElement__Group__0 ) ) ;
    public final void ruleNotesElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:157:2: ( ( ( rule__NotesElement__Group__0 ) ) )
            // InternalJoveNotes.g:158:1: ( ( rule__NotesElement__Group__0 ) )
            {
            // InternalJoveNotes.g:158:1: ( ( rule__NotesElement__Group__0 ) )
            // InternalJoveNotes.g:159:1: ( rule__NotesElement__Group__0 )
            {
             before(grammarAccess.getNotesElementAccess().getGroup()); 
            // InternalJoveNotes.g:160:1: ( rule__NotesElement__Group__0 )
            // InternalJoveNotes.g:160:2: rule__NotesElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotesElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotesElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotesElement"


    // $ANTLR start "entryRuleWordMeaning"
    // InternalJoveNotes.g:172:1: entryRuleWordMeaning : ruleWordMeaning EOF ;
    public final void entryRuleWordMeaning() throws RecognitionException {
        try {
            // InternalJoveNotes.g:173:1: ( ruleWordMeaning EOF )
            // InternalJoveNotes.g:174:1: ruleWordMeaning EOF
            {
             before(grammarAccess.getWordMeaningRule()); 
            pushFollow(FOLLOW_1);
            ruleWordMeaning();

            state._fsp--;

             after(grammarAccess.getWordMeaningRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWordMeaning"


    // $ANTLR start "ruleWordMeaning"
    // InternalJoveNotes.g:181:1: ruleWordMeaning : ( ( rule__WordMeaning__Group__0 ) ) ;
    public final void ruleWordMeaning() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:185:2: ( ( ( rule__WordMeaning__Group__0 ) ) )
            // InternalJoveNotes.g:186:1: ( ( rule__WordMeaning__Group__0 ) )
            {
            // InternalJoveNotes.g:186:1: ( ( rule__WordMeaning__Group__0 ) )
            // InternalJoveNotes.g:187:1: ( rule__WordMeaning__Group__0 )
            {
             before(grammarAccess.getWordMeaningAccess().getGroup()); 
            // InternalJoveNotes.g:188:1: ( rule__WordMeaning__Group__0 )
            // InternalJoveNotes.g:188:2: rule__WordMeaning__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WordMeaning__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWordMeaningAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWordMeaning"


    // $ANTLR start "entryRuleQuestionAnswer"
    // InternalJoveNotes.g:200:1: entryRuleQuestionAnswer : ruleQuestionAnswer EOF ;
    public final void entryRuleQuestionAnswer() throws RecognitionException {
        try {
            // InternalJoveNotes.g:201:1: ( ruleQuestionAnswer EOF )
            // InternalJoveNotes.g:202:1: ruleQuestionAnswer EOF
            {
             before(grammarAccess.getQuestionAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionAnswer();

            state._fsp--;

             after(grammarAccess.getQuestionAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionAnswer"


    // $ANTLR start "ruleQuestionAnswer"
    // InternalJoveNotes.g:209:1: ruleQuestionAnswer : ( ( rule__QuestionAnswer__Group__0 ) ) ;
    public final void ruleQuestionAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:213:2: ( ( ( rule__QuestionAnswer__Group__0 ) ) )
            // InternalJoveNotes.g:214:1: ( ( rule__QuestionAnswer__Group__0 ) )
            {
            // InternalJoveNotes.g:214:1: ( ( rule__QuestionAnswer__Group__0 ) )
            // InternalJoveNotes.g:215:1: ( rule__QuestionAnswer__Group__0 )
            {
             before(grammarAccess.getQuestionAnswerAccess().getGroup()); 
            // InternalJoveNotes.g:216:1: ( rule__QuestionAnswer__Group__0 )
            // InternalJoveNotes.g:216:2: rule__QuestionAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuestionAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAnswerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionAnswer"


    // $ANTLR start "entryRuleFIB"
    // InternalJoveNotes.g:228:1: entryRuleFIB : ruleFIB EOF ;
    public final void entryRuleFIB() throws RecognitionException {
        try {
            // InternalJoveNotes.g:229:1: ( ruleFIB EOF )
            // InternalJoveNotes.g:230:1: ruleFIB EOF
            {
             before(grammarAccess.getFIBRule()); 
            pushFollow(FOLLOW_1);
            ruleFIB();

            state._fsp--;

             after(grammarAccess.getFIBRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFIB"


    // $ANTLR start "ruleFIB"
    // InternalJoveNotes.g:237:1: ruleFIB : ( ( rule__FIB__Group__0 ) ) ;
    public final void ruleFIB() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:241:2: ( ( ( rule__FIB__Group__0 ) ) )
            // InternalJoveNotes.g:242:1: ( ( rule__FIB__Group__0 ) )
            {
            // InternalJoveNotes.g:242:1: ( ( rule__FIB__Group__0 ) )
            // InternalJoveNotes.g:243:1: ( rule__FIB__Group__0 )
            {
             before(grammarAccess.getFIBAccess().getGroup()); 
            // InternalJoveNotes.g:244:1: ( rule__FIB__Group__0 )
            // InternalJoveNotes.g:244:2: rule__FIB__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FIB__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFIBAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFIB"


    // $ANTLR start "entryRuleDefinition"
    // InternalJoveNotes.g:256:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalJoveNotes.g:257:1: ( ruleDefinition EOF )
            // InternalJoveNotes.g:258:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalJoveNotes.g:265:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:269:2: ( ( ( rule__Definition__Group__0 ) ) )
            // InternalJoveNotes.g:270:1: ( ( rule__Definition__Group__0 ) )
            {
            // InternalJoveNotes.g:270:1: ( ( rule__Definition__Group__0 ) )
            // InternalJoveNotes.g:271:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // InternalJoveNotes.g:272:1: ( rule__Definition__Group__0 )
            // InternalJoveNotes.g:272:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleCharacter"
    // InternalJoveNotes.g:284:1: entryRuleCharacter : ruleCharacter EOF ;
    public final void entryRuleCharacter() throws RecognitionException {
        try {
            // InternalJoveNotes.g:285:1: ( ruleCharacter EOF )
            // InternalJoveNotes.g:286:1: ruleCharacter EOF
            {
             before(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacter();

            state._fsp--;

             after(grammarAccess.getCharacterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharacter"


    // $ANTLR start "ruleCharacter"
    // InternalJoveNotes.g:293:1: ruleCharacter : ( ( rule__Character__Group__0 ) ) ;
    public final void ruleCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:297:2: ( ( ( rule__Character__Group__0 ) ) )
            // InternalJoveNotes.g:298:1: ( ( rule__Character__Group__0 ) )
            {
            // InternalJoveNotes.g:298:1: ( ( rule__Character__Group__0 ) )
            // InternalJoveNotes.g:299:1: ( rule__Character__Group__0 )
            {
             before(grammarAccess.getCharacterAccess().getGroup()); 
            // InternalJoveNotes.g:300:1: ( rule__Character__Group__0 )
            // InternalJoveNotes.g:300:2: rule__Character__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Character__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacter"


    // $ANTLR start "entryRuleTeacherNote"
    // InternalJoveNotes.g:312:1: entryRuleTeacherNote : ruleTeacherNote EOF ;
    public final void entryRuleTeacherNote() throws RecognitionException {
        try {
            // InternalJoveNotes.g:313:1: ( ruleTeacherNote EOF )
            // InternalJoveNotes.g:314:1: ruleTeacherNote EOF
            {
             before(grammarAccess.getTeacherNoteRule()); 
            pushFollow(FOLLOW_1);
            ruleTeacherNote();

            state._fsp--;

             after(grammarAccess.getTeacherNoteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTeacherNote"


    // $ANTLR start "ruleTeacherNote"
    // InternalJoveNotes.g:321:1: ruleTeacherNote : ( ( rule__TeacherNote__Group__0 ) ) ;
    public final void ruleTeacherNote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:325:2: ( ( ( rule__TeacherNote__Group__0 ) ) )
            // InternalJoveNotes.g:326:1: ( ( rule__TeacherNote__Group__0 ) )
            {
            // InternalJoveNotes.g:326:1: ( ( rule__TeacherNote__Group__0 ) )
            // InternalJoveNotes.g:327:1: ( rule__TeacherNote__Group__0 )
            {
             before(grammarAccess.getTeacherNoteAccess().getGroup()); 
            // InternalJoveNotes.g:328:1: ( rule__TeacherNote__Group__0 )
            // InternalJoveNotes.g:328:2: rule__TeacherNote__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TeacherNote__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeacherNoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTeacherNote"


    // $ANTLR start "entryRuleMatching"
    // InternalJoveNotes.g:340:1: entryRuleMatching : ruleMatching EOF ;
    public final void entryRuleMatching() throws RecognitionException {
        try {
            // InternalJoveNotes.g:341:1: ( ruleMatching EOF )
            // InternalJoveNotes.g:342:1: ruleMatching EOF
            {
             before(grammarAccess.getMatchingRule()); 
            pushFollow(FOLLOW_1);
            ruleMatching();

            state._fsp--;

             after(grammarAccess.getMatchingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatching"


    // $ANTLR start "ruleMatching"
    // InternalJoveNotes.g:349:1: ruleMatching : ( ( rule__Matching__Group__0 ) ) ;
    public final void ruleMatching() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:353:2: ( ( ( rule__Matching__Group__0 ) ) )
            // InternalJoveNotes.g:354:1: ( ( rule__Matching__Group__0 ) )
            {
            // InternalJoveNotes.g:354:1: ( ( rule__Matching__Group__0 ) )
            // InternalJoveNotes.g:355:1: ( rule__Matching__Group__0 )
            {
             before(grammarAccess.getMatchingAccess().getGroup()); 
            // InternalJoveNotes.g:356:1: ( rule__Matching__Group__0 )
            // InternalJoveNotes.g:356:2: rule__Matching__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Matching__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatchingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatching"


    // $ANTLR start "entryRuleMatchPair"
    // InternalJoveNotes.g:368:1: entryRuleMatchPair : ruleMatchPair EOF ;
    public final void entryRuleMatchPair() throws RecognitionException {
        try {
            // InternalJoveNotes.g:369:1: ( ruleMatchPair EOF )
            // InternalJoveNotes.g:370:1: ruleMatchPair EOF
            {
             before(grammarAccess.getMatchPairRule()); 
            pushFollow(FOLLOW_1);
            ruleMatchPair();

            state._fsp--;

             after(grammarAccess.getMatchPairRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatchPair"


    // $ANTLR start "ruleMatchPair"
    // InternalJoveNotes.g:377:1: ruleMatchPair : ( ( rule__MatchPair__Group__0 ) ) ;
    public final void ruleMatchPair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:381:2: ( ( ( rule__MatchPair__Group__0 ) ) )
            // InternalJoveNotes.g:382:1: ( ( rule__MatchPair__Group__0 ) )
            {
            // InternalJoveNotes.g:382:1: ( ( rule__MatchPair__Group__0 ) )
            // InternalJoveNotes.g:383:1: ( rule__MatchPair__Group__0 )
            {
             before(grammarAccess.getMatchPairAccess().getGroup()); 
            // InternalJoveNotes.g:384:1: ( rule__MatchPair__Group__0 )
            // InternalJoveNotes.g:384:2: rule__MatchPair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MatchPair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatchPairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatchPair"


    // $ANTLR start "entryRuleMatchMCQConfig"
    // InternalJoveNotes.g:396:1: entryRuleMatchMCQConfig : ruleMatchMCQConfig EOF ;
    public final void entryRuleMatchMCQConfig() throws RecognitionException {
        try {
            // InternalJoveNotes.g:397:1: ( ruleMatchMCQConfig EOF )
            // InternalJoveNotes.g:398:1: ruleMatchMCQConfig EOF
            {
             before(grammarAccess.getMatchMCQConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleMatchMCQConfig();

            state._fsp--;

             after(grammarAccess.getMatchMCQConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatchMCQConfig"


    // $ANTLR start "ruleMatchMCQConfig"
    // InternalJoveNotes.g:405:1: ruleMatchMCQConfig : ( ( rule__MatchMCQConfig__Group__0 ) ) ;
    public final void ruleMatchMCQConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:409:2: ( ( ( rule__MatchMCQConfig__Group__0 ) ) )
            // InternalJoveNotes.g:410:1: ( ( rule__MatchMCQConfig__Group__0 ) )
            {
            // InternalJoveNotes.g:410:1: ( ( rule__MatchMCQConfig__Group__0 ) )
            // InternalJoveNotes.g:411:1: ( rule__MatchMCQConfig__Group__0 )
            {
             before(grammarAccess.getMatchMCQConfigAccess().getGroup()); 
            // InternalJoveNotes.g:412:1: ( rule__MatchMCQConfig__Group__0 )
            // InternalJoveNotes.g:412:2: rule__MatchMCQConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatchMCQConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatchMCQConfig"


    // $ANTLR start "entryRuleEvent"
    // InternalJoveNotes.g:424:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalJoveNotes.g:425:1: ( ruleEvent EOF )
            // InternalJoveNotes.g:426:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalJoveNotes.g:433:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:437:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalJoveNotes.g:438:1: ( ( rule__Event__Group__0 ) )
            {
            // InternalJoveNotes.g:438:1: ( ( rule__Event__Group__0 ) )
            // InternalJoveNotes.g:439:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalJoveNotes.g:440:1: ( rule__Event__Group__0 )
            // InternalJoveNotes.g:440:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleTrueFalse"
    // InternalJoveNotes.g:452:1: entryRuleTrueFalse : ruleTrueFalse EOF ;
    public final void entryRuleTrueFalse() throws RecognitionException {
        try {
            // InternalJoveNotes.g:453:1: ( ruleTrueFalse EOF )
            // InternalJoveNotes.g:454:1: ruleTrueFalse EOF
            {
             before(grammarAccess.getTrueFalseRule()); 
            pushFollow(FOLLOW_1);
            ruleTrueFalse();

            state._fsp--;

             after(grammarAccess.getTrueFalseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrueFalse"


    // $ANTLR start "ruleTrueFalse"
    // InternalJoveNotes.g:461:1: ruleTrueFalse : ( ( rule__TrueFalse__Group__0 ) ) ;
    public final void ruleTrueFalse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:465:2: ( ( ( rule__TrueFalse__Group__0 ) ) )
            // InternalJoveNotes.g:466:1: ( ( rule__TrueFalse__Group__0 ) )
            {
            // InternalJoveNotes.g:466:1: ( ( rule__TrueFalse__Group__0 ) )
            // InternalJoveNotes.g:467:1: ( rule__TrueFalse__Group__0 )
            {
             before(grammarAccess.getTrueFalseAccess().getGroup()); 
            // InternalJoveNotes.g:468:1: ( rule__TrueFalse__Group__0 )
            // InternalJoveNotes.g:468:2: rule__TrueFalse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrueFalse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrueFalseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrueFalse"


    // $ANTLR start "entryRuleChemEquation"
    // InternalJoveNotes.g:480:1: entryRuleChemEquation : ruleChemEquation EOF ;
    public final void entryRuleChemEquation() throws RecognitionException {
        try {
            // InternalJoveNotes.g:481:1: ( ruleChemEquation EOF )
            // InternalJoveNotes.g:482:1: ruleChemEquation EOF
            {
             before(grammarAccess.getChemEquationRule()); 
            pushFollow(FOLLOW_1);
            ruleChemEquation();

            state._fsp--;

             after(grammarAccess.getChemEquationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChemEquation"


    // $ANTLR start "ruleChemEquation"
    // InternalJoveNotes.g:489:1: ruleChemEquation : ( ( rule__ChemEquation__Group__0 ) ) ;
    public final void ruleChemEquation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:493:2: ( ( ( rule__ChemEquation__Group__0 ) ) )
            // InternalJoveNotes.g:494:1: ( ( rule__ChemEquation__Group__0 ) )
            {
            // InternalJoveNotes.g:494:1: ( ( rule__ChemEquation__Group__0 ) )
            // InternalJoveNotes.g:495:1: ( rule__ChemEquation__Group__0 )
            {
             before(grammarAccess.getChemEquationAccess().getGroup()); 
            // InternalJoveNotes.g:496:1: ( rule__ChemEquation__Group__0 )
            // InternalJoveNotes.g:496:2: rule__ChemEquation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChemEquation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChemEquationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChemEquation"


    // $ANTLR start "entryRuleChemCompound"
    // InternalJoveNotes.g:508:1: entryRuleChemCompound : ruleChemCompound EOF ;
    public final void entryRuleChemCompound() throws RecognitionException {
        try {
            // InternalJoveNotes.g:509:1: ( ruleChemCompound EOF )
            // InternalJoveNotes.g:510:1: ruleChemCompound EOF
            {
             before(grammarAccess.getChemCompoundRule()); 
            pushFollow(FOLLOW_1);
            ruleChemCompound();

            state._fsp--;

             after(grammarAccess.getChemCompoundRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChemCompound"


    // $ANTLR start "ruleChemCompound"
    // InternalJoveNotes.g:517:1: ruleChemCompound : ( ( rule__ChemCompound__Group__0 ) ) ;
    public final void ruleChemCompound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:521:2: ( ( ( rule__ChemCompound__Group__0 ) ) )
            // InternalJoveNotes.g:522:1: ( ( rule__ChemCompound__Group__0 ) )
            {
            // InternalJoveNotes.g:522:1: ( ( rule__ChemCompound__Group__0 ) )
            // InternalJoveNotes.g:523:1: ( rule__ChemCompound__Group__0 )
            {
             before(grammarAccess.getChemCompoundAccess().getGroup()); 
            // InternalJoveNotes.g:524:1: ( rule__ChemCompound__Group__0 )
            // InternalJoveNotes.g:524:2: rule__ChemCompound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChemCompound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChemCompoundAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChemCompound"


    // $ANTLR start "entryRuleSpellbee"
    // InternalJoveNotes.g:536:1: entryRuleSpellbee : ruleSpellbee EOF ;
    public final void entryRuleSpellbee() throws RecognitionException {
        try {
            // InternalJoveNotes.g:537:1: ( ruleSpellbee EOF )
            // InternalJoveNotes.g:538:1: ruleSpellbee EOF
            {
             before(grammarAccess.getSpellbeeRule()); 
            pushFollow(FOLLOW_1);
            ruleSpellbee();

            state._fsp--;

             after(grammarAccess.getSpellbeeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpellbee"


    // $ANTLR start "ruleSpellbee"
    // InternalJoveNotes.g:545:1: ruleSpellbee : ( ( rule__Spellbee__Group__0 ) ) ;
    public final void ruleSpellbee() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:549:2: ( ( ( rule__Spellbee__Group__0 ) ) )
            // InternalJoveNotes.g:550:1: ( ( rule__Spellbee__Group__0 ) )
            {
            // InternalJoveNotes.g:550:1: ( ( rule__Spellbee__Group__0 ) )
            // InternalJoveNotes.g:551:1: ( rule__Spellbee__Group__0 )
            {
             before(grammarAccess.getSpellbeeAccess().getGroup()); 
            // InternalJoveNotes.g:552:1: ( rule__Spellbee__Group__0 )
            // InternalJoveNotes.g:552:2: rule__Spellbee__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Spellbee__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpellbeeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpellbee"


    // $ANTLR start "entryRuleImageLabel"
    // InternalJoveNotes.g:564:1: entryRuleImageLabel : ruleImageLabel EOF ;
    public final void entryRuleImageLabel() throws RecognitionException {
        try {
            // InternalJoveNotes.g:565:1: ( ruleImageLabel EOF )
            // InternalJoveNotes.g:566:1: ruleImageLabel EOF
            {
             before(grammarAccess.getImageLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleImageLabel();

            state._fsp--;

             after(grammarAccess.getImageLabelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImageLabel"


    // $ANTLR start "ruleImageLabel"
    // InternalJoveNotes.g:573:1: ruleImageLabel : ( ( rule__ImageLabel__Group__0 ) ) ;
    public final void ruleImageLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:577:2: ( ( ( rule__ImageLabel__Group__0 ) ) )
            // InternalJoveNotes.g:578:1: ( ( rule__ImageLabel__Group__0 ) )
            {
            // InternalJoveNotes.g:578:1: ( ( rule__ImageLabel__Group__0 ) )
            // InternalJoveNotes.g:579:1: ( rule__ImageLabel__Group__0 )
            {
             before(grammarAccess.getImageLabelAccess().getGroup()); 
            // InternalJoveNotes.g:580:1: ( rule__ImageLabel__Group__0 )
            // InternalJoveNotes.g:580:2: rule__ImageLabel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageLabel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImageLabel"


    // $ANTLR start "entryRuleHotSpot"
    // InternalJoveNotes.g:592:1: entryRuleHotSpot : ruleHotSpot EOF ;
    public final void entryRuleHotSpot() throws RecognitionException {
        try {
            // InternalJoveNotes.g:593:1: ( ruleHotSpot EOF )
            // InternalJoveNotes.g:594:1: ruleHotSpot EOF
            {
             before(grammarAccess.getHotSpotRule()); 
            pushFollow(FOLLOW_1);
            ruleHotSpot();

            state._fsp--;

             after(grammarAccess.getHotSpotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHotSpot"


    // $ANTLR start "ruleHotSpot"
    // InternalJoveNotes.g:601:1: ruleHotSpot : ( ( rule__HotSpot__Group__0 ) ) ;
    public final void ruleHotSpot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:605:2: ( ( ( rule__HotSpot__Group__0 ) ) )
            // InternalJoveNotes.g:606:1: ( ( rule__HotSpot__Group__0 ) )
            {
            // InternalJoveNotes.g:606:1: ( ( rule__HotSpot__Group__0 ) )
            // InternalJoveNotes.g:607:1: ( rule__HotSpot__Group__0 )
            {
             before(grammarAccess.getHotSpotAccess().getGroup()); 
            // InternalJoveNotes.g:608:1: ( rule__HotSpot__Group__0 )
            // InternalJoveNotes.g:608:2: rule__HotSpot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HotSpot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHotSpotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHotSpot"


    // $ANTLR start "entryRuleEquation"
    // InternalJoveNotes.g:620:1: entryRuleEquation : ruleEquation EOF ;
    public final void entryRuleEquation() throws RecognitionException {
        try {
            // InternalJoveNotes.g:621:1: ( ruleEquation EOF )
            // InternalJoveNotes.g:622:1: ruleEquation EOF
            {
             before(grammarAccess.getEquationRule()); 
            pushFollow(FOLLOW_1);
            ruleEquation();

            state._fsp--;

             after(grammarAccess.getEquationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // InternalJoveNotes.g:629:1: ruleEquation : ( ( rule__Equation__Group__0 ) ) ;
    public final void ruleEquation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:633:2: ( ( ( rule__Equation__Group__0 ) ) )
            // InternalJoveNotes.g:634:1: ( ( rule__Equation__Group__0 ) )
            {
            // InternalJoveNotes.g:634:1: ( ( rule__Equation__Group__0 ) )
            // InternalJoveNotes.g:635:1: ( rule__Equation__Group__0 )
            {
             before(grammarAccess.getEquationAccess().getGroup()); 
            // InternalJoveNotes.g:636:1: ( rule__Equation__Group__0 )
            // InternalJoveNotes.g:636:2: rule__Equation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEquationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleEqSymbol"
    // InternalJoveNotes.g:648:1: entryRuleEqSymbol : ruleEqSymbol EOF ;
    public final void entryRuleEqSymbol() throws RecognitionException {
        try {
            // InternalJoveNotes.g:649:1: ( ruleEqSymbol EOF )
            // InternalJoveNotes.g:650:1: ruleEqSymbol EOF
            {
             before(grammarAccess.getEqSymbolRule()); 
            pushFollow(FOLLOW_1);
            ruleEqSymbol();

            state._fsp--;

             after(grammarAccess.getEqSymbolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqSymbol"


    // $ANTLR start "ruleEqSymbol"
    // InternalJoveNotes.g:657:1: ruleEqSymbol : ( ( rule__EqSymbol__Group__0 ) ) ;
    public final void ruleEqSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:661:2: ( ( ( rule__EqSymbol__Group__0 ) ) )
            // InternalJoveNotes.g:662:1: ( ( rule__EqSymbol__Group__0 ) )
            {
            // InternalJoveNotes.g:662:1: ( ( rule__EqSymbol__Group__0 ) )
            // InternalJoveNotes.g:663:1: ( rule__EqSymbol__Group__0 )
            {
             before(grammarAccess.getEqSymbolAccess().getGroup()); 
            // InternalJoveNotes.g:664:1: ( rule__EqSymbol__Group__0 )
            // InternalJoveNotes.g:664:2: rule__EqSymbol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqSymbol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqSymbolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqSymbol"


    // $ANTLR start "entryRuleRefToContext"
    // InternalJoveNotes.g:676:1: entryRuleRefToContext : ruleRefToContext EOF ;
    public final void entryRuleRefToContext() throws RecognitionException {
        try {
            // InternalJoveNotes.g:677:1: ( ruleRefToContext EOF )
            // InternalJoveNotes.g:678:1: ruleRefToContext EOF
            {
             before(grammarAccess.getRefToContextRule()); 
            pushFollow(FOLLOW_1);
            ruleRefToContext();

            state._fsp--;

             after(grammarAccess.getRefToContextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefToContext"


    // $ANTLR start "ruleRefToContext"
    // InternalJoveNotes.g:685:1: ruleRefToContext : ( ( rule__RefToContext__Group__0 ) ) ;
    public final void ruleRefToContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:689:2: ( ( ( rule__RefToContext__Group__0 ) ) )
            // InternalJoveNotes.g:690:1: ( ( rule__RefToContext__Group__0 ) )
            {
            // InternalJoveNotes.g:690:1: ( ( rule__RefToContext__Group__0 ) )
            // InternalJoveNotes.g:691:1: ( rule__RefToContext__Group__0 )
            {
             before(grammarAccess.getRefToContextAccess().getGroup()); 
            // InternalJoveNotes.g:692:1: ( rule__RefToContext__Group__0 )
            // InternalJoveNotes.g:692:2: rule__RefToContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RefToContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefToContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefToContext"


    // $ANTLR start "entryRuleRTCElement"
    // InternalJoveNotes.g:704:1: entryRuleRTCElement : ruleRTCElement EOF ;
    public final void entryRuleRTCElement() throws RecognitionException {
        try {
            // InternalJoveNotes.g:705:1: ( ruleRTCElement EOF )
            // InternalJoveNotes.g:706:1: ruleRTCElement EOF
            {
             before(grammarAccess.getRTCElementRule()); 
            pushFollow(FOLLOW_1);
            ruleRTCElement();

            state._fsp--;

             after(grammarAccess.getRTCElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRTCElement"


    // $ANTLR start "ruleRTCElement"
    // InternalJoveNotes.g:713:1: ruleRTCElement : ( ( rule__RTCElement__Alternatives ) ) ;
    public final void ruleRTCElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:717:2: ( ( ( rule__RTCElement__Alternatives ) ) )
            // InternalJoveNotes.g:718:1: ( ( rule__RTCElement__Alternatives ) )
            {
            // InternalJoveNotes.g:718:1: ( ( rule__RTCElement__Alternatives ) )
            // InternalJoveNotes.g:719:1: ( rule__RTCElement__Alternatives )
            {
             before(grammarAccess.getRTCElementAccess().getAlternatives()); 
            // InternalJoveNotes.g:720:1: ( rule__RTCElement__Alternatives )
            // InternalJoveNotes.g:720:2: rule__RTCElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RTCElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRTCElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRTCElement"


    // $ANTLR start "entryRuleMultiChoice"
    // InternalJoveNotes.g:732:1: entryRuleMultiChoice : ruleMultiChoice EOF ;
    public final void entryRuleMultiChoice() throws RecognitionException {
        try {
            // InternalJoveNotes.g:733:1: ( ruleMultiChoice EOF )
            // InternalJoveNotes.g:734:1: ruleMultiChoice EOF
            {
             before(grammarAccess.getMultiChoiceRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiChoice();

            state._fsp--;

             after(grammarAccess.getMultiChoiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiChoice"


    // $ANTLR start "ruleMultiChoice"
    // InternalJoveNotes.g:741:1: ruleMultiChoice : ( ( rule__MultiChoice__Group__0 ) ) ;
    public final void ruleMultiChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:745:2: ( ( ( rule__MultiChoice__Group__0 ) ) )
            // InternalJoveNotes.g:746:1: ( ( rule__MultiChoice__Group__0 ) )
            {
            // InternalJoveNotes.g:746:1: ( ( rule__MultiChoice__Group__0 ) )
            // InternalJoveNotes.g:747:1: ( rule__MultiChoice__Group__0 )
            {
             before(grammarAccess.getMultiChoiceAccess().getGroup()); 
            // InternalJoveNotes.g:748:1: ( rule__MultiChoice__Group__0 )
            // InternalJoveNotes.g:748:2: rule__MultiChoice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiChoice"


    // $ANTLR start "entryRuleExercise"
    // InternalJoveNotes.g:760:1: entryRuleExercise : ruleExercise EOF ;
    public final void entryRuleExercise() throws RecognitionException {
        try {
            // InternalJoveNotes.g:761:1: ( ruleExercise EOF )
            // InternalJoveNotes.g:762:1: ruleExercise EOF
            {
             before(grammarAccess.getExerciseRule()); 
            pushFollow(FOLLOW_1);
            ruleExercise();

            state._fsp--;

             after(grammarAccess.getExerciseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExercise"


    // $ANTLR start "ruleExercise"
    // InternalJoveNotes.g:769:1: ruleExercise : ( ( rule__Exercise__Group__0 ) ) ;
    public final void ruleExercise() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:773:2: ( ( ( rule__Exercise__Group__0 ) ) )
            // InternalJoveNotes.g:774:1: ( ( rule__Exercise__Group__0 ) )
            {
            // InternalJoveNotes.g:774:1: ( ( rule__Exercise__Group__0 ) )
            // InternalJoveNotes.g:775:1: ( rule__Exercise__Group__0 )
            {
             before(grammarAccess.getExerciseAccess().getGroup()); 
            // InternalJoveNotes.g:776:1: ( rule__Exercise__Group__0 )
            // InternalJoveNotes.g:776:2: rule__Exercise__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExercise"


    // $ANTLR start "entryRuleVoiceToText"
    // InternalJoveNotes.g:788:1: entryRuleVoiceToText : ruleVoiceToText EOF ;
    public final void entryRuleVoiceToText() throws RecognitionException {
        try {
            // InternalJoveNotes.g:789:1: ( ruleVoiceToText EOF )
            // InternalJoveNotes.g:790:1: ruleVoiceToText EOF
            {
             before(grammarAccess.getVoiceToTextRule()); 
            pushFollow(FOLLOW_1);
            ruleVoiceToText();

            state._fsp--;

             after(grammarAccess.getVoiceToTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVoiceToText"


    // $ANTLR start "ruleVoiceToText"
    // InternalJoveNotes.g:797:1: ruleVoiceToText : ( ( rule__VoiceToText__Group__0 ) ) ;
    public final void ruleVoiceToText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:801:2: ( ( ( rule__VoiceToText__Group__0 ) ) )
            // InternalJoveNotes.g:802:1: ( ( rule__VoiceToText__Group__0 ) )
            {
            // InternalJoveNotes.g:802:1: ( ( rule__VoiceToText__Group__0 ) )
            // InternalJoveNotes.g:803:1: ( rule__VoiceToText__Group__0 )
            {
             before(grammarAccess.getVoiceToTextAccess().getGroup()); 
            // InternalJoveNotes.g:804:1: ( rule__VoiceToText__Group__0 )
            // InternalJoveNotes.g:804:2: rule__VoiceToText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VoiceToText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVoiceToTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVoiceToText"


    // $ANTLR start "entryRuleCompilerBreak"
    // InternalJoveNotes.g:816:1: entryRuleCompilerBreak : ruleCompilerBreak EOF ;
    public final void entryRuleCompilerBreak() throws RecognitionException {
        try {
            // InternalJoveNotes.g:817:1: ( ruleCompilerBreak EOF )
            // InternalJoveNotes.g:818:1: ruleCompilerBreak EOF
            {
             before(grammarAccess.getCompilerBreakRule()); 
            pushFollow(FOLLOW_1);
            ruleCompilerBreak();

            state._fsp--;

             after(grammarAccess.getCompilerBreakRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompilerBreak"


    // $ANTLR start "ruleCompilerBreak"
    // InternalJoveNotes.g:825:1: ruleCompilerBreak : ( ( rule__CompilerBreak__Group__0 ) ) ;
    public final void ruleCompilerBreak() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:829:2: ( ( ( rule__CompilerBreak__Group__0 ) ) )
            // InternalJoveNotes.g:830:1: ( ( rule__CompilerBreak__Group__0 ) )
            {
            // InternalJoveNotes.g:830:1: ( ( rule__CompilerBreak__Group__0 ) )
            // InternalJoveNotes.g:831:1: ( rule__CompilerBreak__Group__0 )
            {
             before(grammarAccess.getCompilerBreakAccess().getGroup()); 
            // InternalJoveNotes.g:832:1: ( rule__CompilerBreak__Group__0 )
            // InternalJoveNotes.g:832:2: rule__CompilerBreak__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompilerBreak__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompilerBreakAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompilerBreak"


    // $ANTLR start "entryRuleChapterSection"
    // InternalJoveNotes.g:844:1: entryRuleChapterSection : ruleChapterSection EOF ;
    public final void entryRuleChapterSection() throws RecognitionException {
        try {
            // InternalJoveNotes.g:845:1: ( ruleChapterSection EOF )
            // InternalJoveNotes.g:846:1: ruleChapterSection EOF
            {
             before(grammarAccess.getChapterSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleChapterSection();

            state._fsp--;

             after(grammarAccess.getChapterSectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChapterSection"


    // $ANTLR start "ruleChapterSection"
    // InternalJoveNotes.g:853:1: ruleChapterSection : ( ( rule__ChapterSection__Group__0 ) ) ;
    public final void ruleChapterSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:857:2: ( ( ( rule__ChapterSection__Group__0 ) ) )
            // InternalJoveNotes.g:858:1: ( ( rule__ChapterSection__Group__0 ) )
            {
            // InternalJoveNotes.g:858:1: ( ( rule__ChapterSection__Group__0 ) )
            // InternalJoveNotes.g:859:1: ( rule__ChapterSection__Group__0 )
            {
             before(grammarAccess.getChapterSectionAccess().getGroup()); 
            // InternalJoveNotes.g:860:1: ( rule__ChapterSection__Group__0 )
            // InternalJoveNotes.g:860:2: rule__ChapterSection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChapterSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChapterSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChapterSection"


    // $ANTLR start "entryRuleOption"
    // InternalJoveNotes.g:872:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalJoveNotes.g:873:1: ( ruleOption EOF )
            // InternalJoveNotes.g:874:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalJoveNotes.g:881:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:885:2: ( ( ( rule__Option__Group__0 ) ) )
            // InternalJoveNotes.g:886:1: ( ( rule__Option__Group__0 ) )
            {
            // InternalJoveNotes.g:886:1: ( ( rule__Option__Group__0 ) )
            // InternalJoveNotes.g:887:1: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // InternalJoveNotes.g:888:1: ( rule__Option__Group__0 )
            // InternalJoveNotes.g:888:2: rule__Option__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleCMap"
    // InternalJoveNotes.g:900:1: entryRuleCMap : ruleCMap EOF ;
    public final void entryRuleCMap() throws RecognitionException {
        try {
            // InternalJoveNotes.g:901:1: ( ruleCMap EOF )
            // InternalJoveNotes.g:902:1: ruleCMap EOF
            {
             before(grammarAccess.getCMapRule()); 
            pushFollow(FOLLOW_1);
            ruleCMap();

            state._fsp--;

             after(grammarAccess.getCMapRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCMap"


    // $ANTLR start "ruleCMap"
    // InternalJoveNotes.g:909:1: ruleCMap : ( ( rule__CMap__Group__0 ) ) ;
    public final void ruleCMap() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:913:2: ( ( ( rule__CMap__Group__0 ) ) )
            // InternalJoveNotes.g:914:1: ( ( rule__CMap__Group__0 ) )
            {
            // InternalJoveNotes.g:914:1: ( ( rule__CMap__Group__0 ) )
            // InternalJoveNotes.g:915:1: ( rule__CMap__Group__0 )
            {
             before(grammarAccess.getCMapAccess().getGroup()); 
            // InternalJoveNotes.g:916:1: ( rule__CMap__Group__0 )
            // InternalJoveNotes.g:916:2: rule__CMap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CMap__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCMapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCMap"


    // $ANTLR start "entryRuleScript"
    // InternalJoveNotes.g:928:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // InternalJoveNotes.g:929:1: ( ruleScript EOF )
            // InternalJoveNotes.g:930:1: ruleScript EOF
            {
             before(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_1);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getScriptRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalJoveNotes.g:937:1: ruleScript : ( ( rule__Script__Group__0 ) ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:941:2: ( ( ( rule__Script__Group__0 ) ) )
            // InternalJoveNotes.g:942:1: ( ( rule__Script__Group__0 ) )
            {
            // InternalJoveNotes.g:942:1: ( ( rule__Script__Group__0 ) )
            // InternalJoveNotes.g:943:1: ( rule__Script__Group__0 )
            {
             before(grammarAccess.getScriptAccess().getGroup()); 
            // InternalJoveNotes.g:944:1: ( rule__Script__Group__0 )
            // InternalJoveNotes.g:944:2: rule__Script__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleEvalVar"
    // InternalJoveNotes.g:956:1: entryRuleEvalVar : ruleEvalVar EOF ;
    public final void entryRuleEvalVar() throws RecognitionException {
        try {
            // InternalJoveNotes.g:957:1: ( ruleEvalVar EOF )
            // InternalJoveNotes.g:958:1: ruleEvalVar EOF
            {
             before(grammarAccess.getEvalVarRule()); 
            pushFollow(FOLLOW_1);
            ruleEvalVar();

            state._fsp--;

             after(grammarAccess.getEvalVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvalVar"


    // $ANTLR start "ruleEvalVar"
    // InternalJoveNotes.g:965:1: ruleEvalVar : ( ( rule__EvalVar__Group__0 ) ) ;
    public final void ruleEvalVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:969:2: ( ( ( rule__EvalVar__Group__0 ) ) )
            // InternalJoveNotes.g:970:1: ( ( rule__EvalVar__Group__0 ) )
            {
            // InternalJoveNotes.g:970:1: ( ( rule__EvalVar__Group__0 ) )
            // InternalJoveNotes.g:971:1: ( rule__EvalVar__Group__0 )
            {
             before(grammarAccess.getEvalVarAccess().getGroup()); 
            // InternalJoveNotes.g:972:1: ( rule__EvalVar__Group__0 )
            // InternalJoveNotes.g:972:2: rule__EvalVar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvalVar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvalVarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvalVar"


    // $ANTLR start "entryRuleScriptBody"
    // InternalJoveNotes.g:984:1: entryRuleScriptBody : ruleScriptBody EOF ;
    public final void entryRuleScriptBody() throws RecognitionException {
        try {
            // InternalJoveNotes.g:985:1: ( ruleScriptBody EOF )
            // InternalJoveNotes.g:986:1: ruleScriptBody EOF
            {
             before(grammarAccess.getScriptBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleScriptBody();

            state._fsp--;

             after(grammarAccess.getScriptBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScriptBody"


    // $ANTLR start "ruleScriptBody"
    // InternalJoveNotes.g:993:1: ruleScriptBody : ( ( rule__ScriptBody__Group__0 ) ) ;
    public final void ruleScriptBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:997:2: ( ( ( rule__ScriptBody__Group__0 ) ) )
            // InternalJoveNotes.g:998:1: ( ( rule__ScriptBody__Group__0 ) )
            {
            // InternalJoveNotes.g:998:1: ( ( rule__ScriptBody__Group__0 ) )
            // InternalJoveNotes.g:999:1: ( rule__ScriptBody__Group__0 )
            {
             before(grammarAccess.getScriptBodyAccess().getGroup()); 
            // InternalJoveNotes.g:1000:1: ( rule__ScriptBody__Group__0 )
            // InternalJoveNotes.g:1000:2: rule__ScriptBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScriptBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScriptBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScriptBody"


    // $ANTLR start "rule__NotesElement__Alternatives_0"
    // InternalJoveNotes.g:1012:1: rule__NotesElement__Alternatives_0 : ( ( ruleWordMeaning ) | ( ruleQuestionAnswer ) | ( ruleFIB ) | ( ruleDefinition ) | ( ruleCharacter ) | ( ruleTeacherNote ) | ( ruleMatching ) | ( ruleEvent ) | ( ruleTrueFalse ) | ( ruleChemEquation ) | ( ruleChemCompound ) | ( ruleSpellbee ) | ( ruleImageLabel ) | ( ruleEquation ) | ( ruleRefToContext ) | ( ruleMultiChoice ) | ( ruleExercise ) | ( ruleVoiceToText ) | ( ruleCompilerBreak ) | ( ruleChapterSection ) );
    public final void rule__NotesElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1016:1: ( ( ruleWordMeaning ) | ( ruleQuestionAnswer ) | ( ruleFIB ) | ( ruleDefinition ) | ( ruleCharacter ) | ( ruleTeacherNote ) | ( ruleMatching ) | ( ruleEvent ) | ( ruleTrueFalse ) | ( ruleChemEquation ) | ( ruleChemCompound ) | ( ruleSpellbee ) | ( ruleImageLabel ) | ( ruleEquation ) | ( ruleRefToContext ) | ( ruleMultiChoice ) | ( ruleExercise ) | ( ruleVoiceToText ) | ( ruleCompilerBreak ) | ( ruleChapterSection ) )
            int alt1=20;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case 19:
                {
                alt1=4;
                }
                break;
            case 20:
                {
                alt1=5;
                }
                break;
            case 21:
                {
                alt1=6;
                }
                break;
            case 22:
                {
                alt1=7;
                }
                break;
            case 31:
                {
                alt1=8;
                }
                break;
            case 32:
                {
                alt1=9;
                }
                break;
            case 33:
                {
                alt1=10;
                }
                break;
            case 35:
                {
                alt1=11;
                }
                break;
            case 36:
                {
                alt1=12;
                }
                break;
            case 37:
                {
                alt1=13;
                }
                break;
            case 40:
                {
                alt1=14;
                }
                break;
            case 42:
                {
                alt1=15;
                }
                break;
            case 44:
                {
                alt1=16;
                }
                break;
            case 47:
                {
                alt1=17;
                }
                break;
            case 51:
                {
                alt1=18;
                }
                break;
            case 52:
                {
                alt1=19;
                }
                break;
            case 53:
                {
                alt1=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalJoveNotes.g:1017:1: ( ruleWordMeaning )
                    {
                    // InternalJoveNotes.g:1017:1: ( ruleWordMeaning )
                    // InternalJoveNotes.g:1018:1: ruleWordMeaning
                    {
                     before(grammarAccess.getNotesElementAccess().getWordMeaningParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWordMeaning();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getWordMeaningParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJoveNotes.g:1023:6: ( ruleQuestionAnswer )
                    {
                    // InternalJoveNotes.g:1023:6: ( ruleQuestionAnswer )
                    // InternalJoveNotes.g:1024:1: ruleQuestionAnswer
                    {
                     before(grammarAccess.getNotesElementAccess().getQuestionAnswerParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuestionAnswer();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getQuestionAnswerParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJoveNotes.g:1029:6: ( ruleFIB )
                    {
                    // InternalJoveNotes.g:1029:6: ( ruleFIB )
                    // InternalJoveNotes.g:1030:1: ruleFIB
                    {
                     before(grammarAccess.getNotesElementAccess().getFIBParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFIB();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getFIBParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJoveNotes.g:1035:6: ( ruleDefinition )
                    {
                    // InternalJoveNotes.g:1035:6: ( ruleDefinition )
                    // InternalJoveNotes.g:1036:1: ruleDefinition
                    {
                     before(grammarAccess.getNotesElementAccess().getDefinitionParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDefinition();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getDefinitionParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJoveNotes.g:1041:6: ( ruleCharacter )
                    {
                    // InternalJoveNotes.g:1041:6: ( ruleCharacter )
                    // InternalJoveNotes.g:1042:1: ruleCharacter
                    {
                     before(grammarAccess.getNotesElementAccess().getCharacterParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacter();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getCharacterParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJoveNotes.g:1047:6: ( ruleTeacherNote )
                    {
                    // InternalJoveNotes.g:1047:6: ( ruleTeacherNote )
                    // InternalJoveNotes.g:1048:1: ruleTeacherNote
                    {
                     before(grammarAccess.getNotesElementAccess().getTeacherNoteParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleTeacherNote();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getTeacherNoteParserRuleCall_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJoveNotes.g:1053:6: ( ruleMatching )
                    {
                    // InternalJoveNotes.g:1053:6: ( ruleMatching )
                    // InternalJoveNotes.g:1054:1: ruleMatching
                    {
                     before(grammarAccess.getNotesElementAccess().getMatchingParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleMatching();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getMatchingParserRuleCall_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalJoveNotes.g:1059:6: ( ruleEvent )
                    {
                    // InternalJoveNotes.g:1059:6: ( ruleEvent )
                    // InternalJoveNotes.g:1060:1: ruleEvent
                    {
                     before(grammarAccess.getNotesElementAccess().getEventParserRuleCall_0_7()); 
                    pushFollow(FOLLOW_2);
                    ruleEvent();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getEventParserRuleCall_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalJoveNotes.g:1065:6: ( ruleTrueFalse )
                    {
                    // InternalJoveNotes.g:1065:6: ( ruleTrueFalse )
                    // InternalJoveNotes.g:1066:1: ruleTrueFalse
                    {
                     before(grammarAccess.getNotesElementAccess().getTrueFalseParserRuleCall_0_8()); 
                    pushFollow(FOLLOW_2);
                    ruleTrueFalse();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getTrueFalseParserRuleCall_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalJoveNotes.g:1071:6: ( ruleChemEquation )
                    {
                    // InternalJoveNotes.g:1071:6: ( ruleChemEquation )
                    // InternalJoveNotes.g:1072:1: ruleChemEquation
                    {
                     before(grammarAccess.getNotesElementAccess().getChemEquationParserRuleCall_0_9()); 
                    pushFollow(FOLLOW_2);
                    ruleChemEquation();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getChemEquationParserRuleCall_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalJoveNotes.g:1077:6: ( ruleChemCompound )
                    {
                    // InternalJoveNotes.g:1077:6: ( ruleChemCompound )
                    // InternalJoveNotes.g:1078:1: ruleChemCompound
                    {
                     before(grammarAccess.getNotesElementAccess().getChemCompoundParserRuleCall_0_10()); 
                    pushFollow(FOLLOW_2);
                    ruleChemCompound();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getChemCompoundParserRuleCall_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalJoveNotes.g:1083:6: ( ruleSpellbee )
                    {
                    // InternalJoveNotes.g:1083:6: ( ruleSpellbee )
                    // InternalJoveNotes.g:1084:1: ruleSpellbee
                    {
                     before(grammarAccess.getNotesElementAccess().getSpellbeeParserRuleCall_0_11()); 
                    pushFollow(FOLLOW_2);
                    ruleSpellbee();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getSpellbeeParserRuleCall_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalJoveNotes.g:1089:6: ( ruleImageLabel )
                    {
                    // InternalJoveNotes.g:1089:6: ( ruleImageLabel )
                    // InternalJoveNotes.g:1090:1: ruleImageLabel
                    {
                     before(grammarAccess.getNotesElementAccess().getImageLabelParserRuleCall_0_12()); 
                    pushFollow(FOLLOW_2);
                    ruleImageLabel();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getImageLabelParserRuleCall_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalJoveNotes.g:1095:6: ( ruleEquation )
                    {
                    // InternalJoveNotes.g:1095:6: ( ruleEquation )
                    // InternalJoveNotes.g:1096:1: ruleEquation
                    {
                     before(grammarAccess.getNotesElementAccess().getEquationParserRuleCall_0_13()); 
                    pushFollow(FOLLOW_2);
                    ruleEquation();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getEquationParserRuleCall_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalJoveNotes.g:1101:6: ( ruleRefToContext )
                    {
                    // InternalJoveNotes.g:1101:6: ( ruleRefToContext )
                    // InternalJoveNotes.g:1102:1: ruleRefToContext
                    {
                     before(grammarAccess.getNotesElementAccess().getRefToContextParserRuleCall_0_14()); 
                    pushFollow(FOLLOW_2);
                    ruleRefToContext();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getRefToContextParserRuleCall_0_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalJoveNotes.g:1107:6: ( ruleMultiChoice )
                    {
                    // InternalJoveNotes.g:1107:6: ( ruleMultiChoice )
                    // InternalJoveNotes.g:1108:1: ruleMultiChoice
                    {
                     before(grammarAccess.getNotesElementAccess().getMultiChoiceParserRuleCall_0_15()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiChoice();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getMultiChoiceParserRuleCall_0_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalJoveNotes.g:1113:6: ( ruleExercise )
                    {
                    // InternalJoveNotes.g:1113:6: ( ruleExercise )
                    // InternalJoveNotes.g:1114:1: ruleExercise
                    {
                     before(grammarAccess.getNotesElementAccess().getExerciseParserRuleCall_0_16()); 
                    pushFollow(FOLLOW_2);
                    ruleExercise();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getExerciseParserRuleCall_0_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalJoveNotes.g:1119:6: ( ruleVoiceToText )
                    {
                    // InternalJoveNotes.g:1119:6: ( ruleVoiceToText )
                    // InternalJoveNotes.g:1120:1: ruleVoiceToText
                    {
                     before(grammarAccess.getNotesElementAccess().getVoiceToTextParserRuleCall_0_17()); 
                    pushFollow(FOLLOW_2);
                    ruleVoiceToText();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getVoiceToTextParserRuleCall_0_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalJoveNotes.g:1125:6: ( ruleCompilerBreak )
                    {
                    // InternalJoveNotes.g:1125:6: ( ruleCompilerBreak )
                    // InternalJoveNotes.g:1126:1: ruleCompilerBreak
                    {
                     before(grammarAccess.getNotesElementAccess().getCompilerBreakParserRuleCall_0_18()); 
                    pushFollow(FOLLOW_2);
                    ruleCompilerBreak();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getCompilerBreakParserRuleCall_0_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalJoveNotes.g:1131:6: ( ruleChapterSection )
                    {
                    // InternalJoveNotes.g:1131:6: ( ruleChapterSection )
                    // InternalJoveNotes.g:1132:1: ruleChapterSection
                    {
                     before(grammarAccess.getNotesElementAccess().getChapterSectionParserRuleCall_0_19()); 
                    pushFollow(FOLLOW_2);
                    ruleChapterSection();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getChapterSectionParserRuleCall_0_19()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotesElement__Alternatives_0"


    // $ANTLR start "rule__RTCElement__Alternatives"
    // InternalJoveNotes.g:1142:1: rule__RTCElement__Alternatives : ( ( ruleWordMeaning ) | ( ruleQuestionAnswer ) | ( ruleFIB ) | ( ruleDefinition ) | ( ruleCharacter ) | ( ruleTeacherNote ) | ( ruleMatching ) | ( ruleEvent ) | ( ruleTrueFalse ) | ( ruleChemEquation ) | ( ruleChemCompound ) | ( ruleImageLabel ) | ( ruleEquation ) | ( ruleMultiChoice ) );
    public final void rule__RTCElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1146:1: ( ( ruleWordMeaning ) | ( ruleQuestionAnswer ) | ( ruleFIB ) | ( ruleDefinition ) | ( ruleCharacter ) | ( ruleTeacherNote ) | ( ruleMatching ) | ( ruleEvent ) | ( ruleTrueFalse ) | ( ruleChemEquation ) | ( ruleChemCompound ) | ( ruleImageLabel ) | ( ruleEquation ) | ( ruleMultiChoice ) )
            int alt2=14;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 21:
                {
                alt2=6;
                }
                break;
            case 22:
                {
                alt2=7;
                }
                break;
            case 31:
                {
                alt2=8;
                }
                break;
            case 32:
                {
                alt2=9;
                }
                break;
            case 33:
                {
                alt2=10;
                }
                break;
            case 35:
                {
                alt2=11;
                }
                break;
            case 37:
                {
                alt2=12;
                }
                break;
            case 40:
                {
                alt2=13;
                }
                break;
            case 44:
                {
                alt2=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalJoveNotes.g:1147:1: ( ruleWordMeaning )
                    {
                    // InternalJoveNotes.g:1147:1: ( ruleWordMeaning )
                    // InternalJoveNotes.g:1148:1: ruleWordMeaning
                    {
                     before(grammarAccess.getRTCElementAccess().getWordMeaningParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWordMeaning();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getWordMeaningParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJoveNotes.g:1153:6: ( ruleQuestionAnswer )
                    {
                    // InternalJoveNotes.g:1153:6: ( ruleQuestionAnswer )
                    // InternalJoveNotes.g:1154:1: ruleQuestionAnswer
                    {
                     before(grammarAccess.getRTCElementAccess().getQuestionAnswerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuestionAnswer();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getQuestionAnswerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJoveNotes.g:1159:6: ( ruleFIB )
                    {
                    // InternalJoveNotes.g:1159:6: ( ruleFIB )
                    // InternalJoveNotes.g:1160:1: ruleFIB
                    {
                     before(grammarAccess.getRTCElementAccess().getFIBParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFIB();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getFIBParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJoveNotes.g:1165:6: ( ruleDefinition )
                    {
                    // InternalJoveNotes.g:1165:6: ( ruleDefinition )
                    // InternalJoveNotes.g:1166:1: ruleDefinition
                    {
                     before(grammarAccess.getRTCElementAccess().getDefinitionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDefinition();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getDefinitionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJoveNotes.g:1171:6: ( ruleCharacter )
                    {
                    // InternalJoveNotes.g:1171:6: ( ruleCharacter )
                    // InternalJoveNotes.g:1172:1: ruleCharacter
                    {
                     before(grammarAccess.getRTCElementAccess().getCharacterParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacter();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getCharacterParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJoveNotes.g:1177:6: ( ruleTeacherNote )
                    {
                    // InternalJoveNotes.g:1177:6: ( ruleTeacherNote )
                    // InternalJoveNotes.g:1178:1: ruleTeacherNote
                    {
                     before(grammarAccess.getRTCElementAccess().getTeacherNoteParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleTeacherNote();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getTeacherNoteParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJoveNotes.g:1183:6: ( ruleMatching )
                    {
                    // InternalJoveNotes.g:1183:6: ( ruleMatching )
                    // InternalJoveNotes.g:1184:1: ruleMatching
                    {
                     before(grammarAccess.getRTCElementAccess().getMatchingParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleMatching();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getMatchingParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalJoveNotes.g:1189:6: ( ruleEvent )
                    {
                    // InternalJoveNotes.g:1189:6: ( ruleEvent )
                    // InternalJoveNotes.g:1190:1: ruleEvent
                    {
                     before(grammarAccess.getRTCElementAccess().getEventParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleEvent();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getEventParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalJoveNotes.g:1195:6: ( ruleTrueFalse )
                    {
                    // InternalJoveNotes.g:1195:6: ( ruleTrueFalse )
                    // InternalJoveNotes.g:1196:1: ruleTrueFalse
                    {
                     before(grammarAccess.getRTCElementAccess().getTrueFalseParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleTrueFalse();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getTrueFalseParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalJoveNotes.g:1201:6: ( ruleChemEquation )
                    {
                    // InternalJoveNotes.g:1201:6: ( ruleChemEquation )
                    // InternalJoveNotes.g:1202:1: ruleChemEquation
                    {
                     before(grammarAccess.getRTCElementAccess().getChemEquationParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleChemEquation();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getChemEquationParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalJoveNotes.g:1207:6: ( ruleChemCompound )
                    {
                    // InternalJoveNotes.g:1207:6: ( ruleChemCompound )
                    // InternalJoveNotes.g:1208:1: ruleChemCompound
                    {
                     before(grammarAccess.getRTCElementAccess().getChemCompoundParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleChemCompound();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getChemCompoundParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalJoveNotes.g:1213:6: ( ruleImageLabel )
                    {
                    // InternalJoveNotes.g:1213:6: ( ruleImageLabel )
                    // InternalJoveNotes.g:1214:1: ruleImageLabel
                    {
                     before(grammarAccess.getRTCElementAccess().getImageLabelParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleImageLabel();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getImageLabelParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalJoveNotes.g:1219:6: ( ruleEquation )
                    {
                    // InternalJoveNotes.g:1219:6: ( ruleEquation )
                    // InternalJoveNotes.g:1220:1: ruleEquation
                    {
                     before(grammarAccess.getRTCElementAccess().getEquationParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleEquation();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getEquationParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalJoveNotes.g:1225:6: ( ruleMultiChoice )
                    {
                    // InternalJoveNotes.g:1225:6: ( ruleMultiChoice )
                    // InternalJoveNotes.g:1226:1: ruleMultiChoice
                    {
                     before(grammarAccess.getRTCElementAccess().getMultiChoiceParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiChoice();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getMultiChoiceParserRuleCall_13()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTCElement__Alternatives"


    // $ANTLR start "rule__JoveNotes__Group__0"
    // InternalJoveNotes.g:1238:1: rule__JoveNotes__Group__0 : rule__JoveNotes__Group__0__Impl rule__JoveNotes__Group__1 ;
    public final void rule__JoveNotes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1242:1: ( rule__JoveNotes__Group__0__Impl rule__JoveNotes__Group__1 )
            // InternalJoveNotes.g:1243:2: rule__JoveNotes__Group__0__Impl rule__JoveNotes__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__JoveNotes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoveNotes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__Group__0"


    // $ANTLR start "rule__JoveNotes__Group__0__Impl"
    // InternalJoveNotes.g:1250:1: rule__JoveNotes__Group__0__Impl : ( ( rule__JoveNotes__ProcessingHintsAssignment_0 ) ) ;
    public final void rule__JoveNotes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1254:1: ( ( ( rule__JoveNotes__ProcessingHintsAssignment_0 ) ) )
            // InternalJoveNotes.g:1255:1: ( ( rule__JoveNotes__ProcessingHintsAssignment_0 ) )
            {
            // InternalJoveNotes.g:1255:1: ( ( rule__JoveNotes__ProcessingHintsAssignment_0 ) )
            // InternalJoveNotes.g:1256:1: ( rule__JoveNotes__ProcessingHintsAssignment_0 )
            {
             before(grammarAccess.getJoveNotesAccess().getProcessingHintsAssignment_0()); 
            // InternalJoveNotes.g:1257:1: ( rule__JoveNotes__ProcessingHintsAssignment_0 )
            // InternalJoveNotes.g:1257:2: rule__JoveNotes__ProcessingHintsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__JoveNotes__ProcessingHintsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJoveNotesAccess().getProcessingHintsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__Group__0__Impl"


    // $ANTLR start "rule__JoveNotes__Group__1"
    // InternalJoveNotes.g:1267:1: rule__JoveNotes__Group__1 : rule__JoveNotes__Group__1__Impl rule__JoveNotes__Group__2 ;
    public final void rule__JoveNotes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1271:1: ( rule__JoveNotes__Group__1__Impl rule__JoveNotes__Group__2 )
            // InternalJoveNotes.g:1272:2: rule__JoveNotes__Group__1__Impl rule__JoveNotes__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__JoveNotes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoveNotes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__Group__1"


    // $ANTLR start "rule__JoveNotes__Group__1__Impl"
    // InternalJoveNotes.g:1279:1: rule__JoveNotes__Group__1__Impl : ( ( rule__JoveNotes__ChapterDetailsAssignment_1 ) ) ;
    public final void rule__JoveNotes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1283:1: ( ( ( rule__JoveNotes__ChapterDetailsAssignment_1 ) ) )
            // InternalJoveNotes.g:1284:1: ( ( rule__JoveNotes__ChapterDetailsAssignment_1 ) )
            {
            // InternalJoveNotes.g:1284:1: ( ( rule__JoveNotes__ChapterDetailsAssignment_1 ) )
            // InternalJoveNotes.g:1285:1: ( rule__JoveNotes__ChapterDetailsAssignment_1 )
            {
             before(grammarAccess.getJoveNotesAccess().getChapterDetailsAssignment_1()); 
            // InternalJoveNotes.g:1286:1: ( rule__JoveNotes__ChapterDetailsAssignment_1 )
            // InternalJoveNotes.g:1286:2: rule__JoveNotes__ChapterDetailsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JoveNotes__ChapterDetailsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJoveNotesAccess().getChapterDetailsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__Group__1__Impl"


    // $ANTLR start "rule__JoveNotes__Group__2"
    // InternalJoveNotes.g:1296:1: rule__JoveNotes__Group__2 : rule__JoveNotes__Group__2__Impl ;
    public final void rule__JoveNotes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1300:1: ( rule__JoveNotes__Group__2__Impl )
            // InternalJoveNotes.g:1301:2: rule__JoveNotes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JoveNotes__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__Group__2"


    // $ANTLR start "rule__JoveNotes__Group__2__Impl"
    // InternalJoveNotes.g:1307:1: rule__JoveNotes__Group__2__Impl : ( ( rule__JoveNotes__NotesElementsAssignment_2 )* ) ;
    public final void rule__JoveNotes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1311:1: ( ( ( rule__JoveNotes__NotesElementsAssignment_2 )* ) )
            // InternalJoveNotes.g:1312:1: ( ( rule__JoveNotes__NotesElementsAssignment_2 )* )
            {
            // InternalJoveNotes.g:1312:1: ( ( rule__JoveNotes__NotesElementsAssignment_2 )* )
            // InternalJoveNotes.g:1313:1: ( rule__JoveNotes__NotesElementsAssignment_2 )*
            {
             before(grammarAccess.getJoveNotesAccess().getNotesElementsAssignment_2()); 
            // InternalJoveNotes.g:1314:1: ( rule__JoveNotes__NotesElementsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=16 && LA3_0<=22)||(LA3_0>=31 && LA3_0<=33)||(LA3_0>=35 && LA3_0<=37)||LA3_0==40||LA3_0==42||LA3_0==44||LA3_0==47||(LA3_0>=51 && LA3_0<=53)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJoveNotes.g:1314:2: rule__JoveNotes__NotesElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__JoveNotes__NotesElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getJoveNotesAccess().getNotesElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__Group__2__Impl"


    // $ANTLR start "rule__ProcessingHints__Group__0"
    // InternalJoveNotes.g:1330:1: rule__ProcessingHints__Group__0 : rule__ProcessingHints__Group__0__Impl rule__ProcessingHints__Group__1 ;
    public final void rule__ProcessingHints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1334:1: ( rule__ProcessingHints__Group__0__Impl rule__ProcessingHints__Group__1 )
            // InternalJoveNotes.g:1335:2: rule__ProcessingHints__Group__0__Impl rule__ProcessingHints__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ProcessingHints__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessingHints__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingHints__Group__0"


    // $ANTLR start "rule__ProcessingHints__Group__0__Impl"
    // InternalJoveNotes.g:1342:1: rule__ProcessingHints__Group__0__Impl : ( () ) ;
    public final void rule__ProcessingHints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1346:1: ( ( () ) )
            // InternalJoveNotes.g:1347:1: ( () )
            {
            // InternalJoveNotes.g:1347:1: ( () )
            // InternalJoveNotes.g:1348:1: ()
            {
             before(grammarAccess.getProcessingHintsAccess().getProcessingHintsAction_0()); 
            // InternalJoveNotes.g:1349:1: ()
            // InternalJoveNotes.g:1351:1: 
            {
            }

             after(grammarAccess.getProcessingHintsAccess().getProcessingHintsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingHints__Group__0__Impl"


    // $ANTLR start "rule__ProcessingHints__Group__1"
    // InternalJoveNotes.g:1361:1: rule__ProcessingHints__Group__1 : rule__ProcessingHints__Group__1__Impl rule__ProcessingHints__Group__2 ;
    public final void rule__ProcessingHints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1365:1: ( rule__ProcessingHints__Group__1__Impl rule__ProcessingHints__Group__2 )
            // InternalJoveNotes.g:1366:2: rule__ProcessingHints__Group__1__Impl rule__ProcessingHints__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ProcessingHints__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessingHints__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingHints__Group__1"


    // $ANTLR start "rule__ProcessingHints__Group__1__Impl"
    // InternalJoveNotes.g:1373:1: rule__ProcessingHints__Group__1__Impl : ( ( rule__ProcessingHints__SkipGenerationAssignment_1 )? ) ;
    public final void rule__ProcessingHints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1377:1: ( ( ( rule__ProcessingHints__SkipGenerationAssignment_1 )? ) )
            // InternalJoveNotes.g:1378:1: ( ( rule__ProcessingHints__SkipGenerationAssignment_1 )? )
            {
            // InternalJoveNotes.g:1378:1: ( ( rule__ProcessingHints__SkipGenerationAssignment_1 )? )
            // InternalJoveNotes.g:1379:1: ( rule__ProcessingHints__SkipGenerationAssignment_1 )?
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationAssignment_1()); 
            // InternalJoveNotes.g:1380:1: ( rule__ProcessingHints__SkipGenerationAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==57) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJoveNotes.g:1380:2: rule__ProcessingHints__SkipGenerationAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProcessingHints__SkipGenerationAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessingHintsAccess().getSkipGenerationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingHints__Group__1__Impl"


    // $ANTLR start "rule__ProcessingHints__Group__2"
    // InternalJoveNotes.g:1390:1: rule__ProcessingHints__Group__2 : rule__ProcessingHints__Group__2__Impl ;
    public final void rule__ProcessingHints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1394:1: ( rule__ProcessingHints__Group__2__Impl )
            // InternalJoveNotes.g:1395:2: rule__ProcessingHints__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProcessingHints__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingHints__Group__2"


    // $ANTLR start "rule__ProcessingHints__Group__2__Impl"
    // InternalJoveNotes.g:1401:1: rule__ProcessingHints__Group__2__Impl : ( ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )? ) ;
    public final void rule__ProcessingHints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1405:1: ( ( ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )? ) )
            // InternalJoveNotes.g:1406:1: ( ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )? )
            {
            // InternalJoveNotes.g:1406:1: ( ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )? )
            // InternalJoveNotes.g:1407:1: ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )?
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionAssignment_2()); 
            // InternalJoveNotes.g:1408:1: ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==58) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJoveNotes.g:1408:2: rule__ProcessingHints__SkipGenerationInProductionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProcessingHints__SkipGenerationInProductionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingHints__Group__2__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__0"
    // InternalJoveNotes.g:1424:1: rule__ChapterDetails__Group__0 : rule__ChapterDetails__Group__0__Impl rule__ChapterDetails__Group__1 ;
    public final void rule__ChapterDetails__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1428:1: ( rule__ChapterDetails__Group__0__Impl rule__ChapterDetails__Group__1 )
            // InternalJoveNotes.g:1429:2: rule__ChapterDetails__Group__0__Impl rule__ChapterDetails__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ChapterDetails__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChapterDetails__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__0"


    // $ANTLR start "rule__ChapterDetails__Group__0__Impl"
    // InternalJoveNotes.g:1436:1: rule__ChapterDetails__Group__0__Impl : ( ( rule__ChapterDetails__ExerciseBankAssignment_0 )? ) ;
    public final void rule__ChapterDetails__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1440:1: ( ( ( rule__ChapterDetails__ExerciseBankAssignment_0 )? ) )
            // InternalJoveNotes.g:1441:1: ( ( rule__ChapterDetails__ExerciseBankAssignment_0 )? )
            {
            // InternalJoveNotes.g:1441:1: ( ( rule__ChapterDetails__ExerciseBankAssignment_0 )? )
            // InternalJoveNotes.g:1442:1: ( rule__ChapterDetails__ExerciseBankAssignment_0 )?
            {
             before(grammarAccess.getChapterDetailsAccess().getExerciseBankAssignment_0()); 
            // InternalJoveNotes.g:1443:1: ( rule__ChapterDetails__ExerciseBankAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==59) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJoveNotes.g:1443:2: rule__ChapterDetails__ExerciseBankAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChapterDetails__ExerciseBankAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChapterDetailsAccess().getExerciseBankAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__0__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__1"
    // InternalJoveNotes.g:1453:1: rule__ChapterDetails__Group__1 : rule__ChapterDetails__Group__1__Impl rule__ChapterDetails__Group__2 ;
    public final void rule__ChapterDetails__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1457:1: ( rule__ChapterDetails__Group__1__Impl rule__ChapterDetails__Group__2 )
            // InternalJoveNotes.g:1458:2: rule__ChapterDetails__Group__1__Impl rule__ChapterDetails__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ChapterDetails__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChapterDetails__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__1"


    // $ANTLR start "rule__ChapterDetails__Group__1__Impl"
    // InternalJoveNotes.g:1465:1: rule__ChapterDetails__Group__1__Impl : ( 'subject' ) ;
    public final void rule__ChapterDetails__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1469:1: ( ( 'subject' ) )
            // InternalJoveNotes.g:1470:1: ( 'subject' )
            {
            // InternalJoveNotes.g:1470:1: ( 'subject' )
            // InternalJoveNotes.g:1471:1: 'subject'
            {
             before(grammarAccess.getChapterDetailsAccess().getSubjectKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getChapterDetailsAccess().getSubjectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__1__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__2"
    // InternalJoveNotes.g:1484:1: rule__ChapterDetails__Group__2 : rule__ChapterDetails__Group__2__Impl rule__ChapterDetails__Group__3 ;
    public final void rule__ChapterDetails__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1488:1: ( rule__ChapterDetails__Group__2__Impl rule__ChapterDetails__Group__3 )
            // InternalJoveNotes.g:1489:2: rule__ChapterDetails__Group__2__Impl rule__ChapterDetails__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ChapterDetails__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChapterDetails__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__2"


    // $ANTLR start "rule__ChapterDetails__Group__2__Impl"
    // InternalJoveNotes.g:1496:1: rule__ChapterDetails__Group__2__Impl : ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) ) ;
    public final void rule__ChapterDetails__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1500:1: ( ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) ) )
            // InternalJoveNotes.g:1501:1: ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) )
            {
            // InternalJoveNotes.g:1501:1: ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) )
            // InternalJoveNotes.g:1502:1: ( rule__ChapterDetails__SubjectNameAssignment_2 )
            {
             before(grammarAccess.getChapterDetailsAccess().getSubjectNameAssignment_2()); 
            // InternalJoveNotes.g:1503:1: ( rule__ChapterDetails__SubjectNameAssignment_2 )
            // InternalJoveNotes.g:1503:2: rule__ChapterDetails__SubjectNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ChapterDetails__SubjectNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChapterDetailsAccess().getSubjectNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__2__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__3"
    // InternalJoveNotes.g:1513:1: rule__ChapterDetails__Group__3 : rule__ChapterDetails__Group__3__Impl rule__ChapterDetails__Group__4 ;
    public final void rule__ChapterDetails__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1517:1: ( rule__ChapterDetails__Group__3__Impl rule__ChapterDetails__Group__4 )
            // InternalJoveNotes.g:1518:2: rule__ChapterDetails__Group__3__Impl rule__ChapterDetails__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ChapterDetails__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChapterDetails__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__3"


    // $ANTLR start "rule__ChapterDetails__Group__3__Impl"
    // InternalJoveNotes.g:1525:1: rule__ChapterDetails__Group__3__Impl : ( 'chapterNumber' ) ;
    public final void rule__ChapterDetails__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1529:1: ( ( 'chapterNumber' ) )
            // InternalJoveNotes.g:1530:1: ( 'chapterNumber' )
            {
            // InternalJoveNotes.g:1530:1: ( 'chapterNumber' )
            // InternalJoveNotes.g:1531:1: 'chapterNumber'
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNumberKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getChapterDetailsAccess().getChapterNumberKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__3__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__4"
    // InternalJoveNotes.g:1544:1: rule__ChapterDetails__Group__4 : rule__ChapterDetails__Group__4__Impl rule__ChapterDetails__Group__5 ;
    public final void rule__ChapterDetails__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1548:1: ( rule__ChapterDetails__Group__4__Impl rule__ChapterDetails__Group__5 )
            // InternalJoveNotes.g:1549:2: rule__ChapterDetails__Group__4__Impl rule__ChapterDetails__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__ChapterDetails__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChapterDetails__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__4"


    // $ANTLR start "rule__ChapterDetails__Group__4__Impl"
    // InternalJoveNotes.g:1556:1: rule__ChapterDetails__Group__4__Impl : ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) ) ;
    public final void rule__ChapterDetails__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1560:1: ( ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) ) )
            // InternalJoveNotes.g:1561:1: ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) )
            {
            // InternalJoveNotes.g:1561:1: ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) )
            // InternalJoveNotes.g:1562:1: ( rule__ChapterDetails__ChapterNumberAssignment_4 )
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNumberAssignment_4()); 
            // InternalJoveNotes.g:1563:1: ( rule__ChapterDetails__ChapterNumberAssignment_4 )
            // InternalJoveNotes.g:1563:2: rule__ChapterDetails__ChapterNumberAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ChapterDetails__ChapterNumberAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChapterDetailsAccess().getChapterNumberAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__4__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__5"
    // InternalJoveNotes.g:1573:1: rule__ChapterDetails__Group__5 : rule__ChapterDetails__Group__5__Impl rule__ChapterDetails__Group__6 ;
    public final void rule__ChapterDetails__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1577:1: ( rule__ChapterDetails__Group__5__Impl rule__ChapterDetails__Group__6 )
            // InternalJoveNotes.g:1578:2: rule__ChapterDetails__Group__5__Impl rule__ChapterDetails__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ChapterDetails__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChapterDetails__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__5"


    // $ANTLR start "rule__ChapterDetails__Group__5__Impl"
    // InternalJoveNotes.g:1585:1: rule__ChapterDetails__Group__5__Impl : ( '.' ) ;
    public final void rule__ChapterDetails__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1589:1: ( ( '.' ) )
            // InternalJoveNotes.g:1590:1: ( '.' )
            {
            // InternalJoveNotes.g:1590:1: ( '.' )
            // InternalJoveNotes.g:1591:1: '.'
            {
             before(grammarAccess.getChapterDetailsAccess().getFullStopKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getChapterDetailsAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__5__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__6"
    // InternalJoveNotes.g:1604:1: rule__ChapterDetails__Group__6 : rule__ChapterDetails__Group__6__Impl rule__ChapterDetails__Group__7 ;
    public final void rule__ChapterDetails__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1608:1: ( rule__ChapterDetails__Group__6__Impl rule__ChapterDetails__Group__7 )
            // InternalJoveNotes.g:1609:2: rule__ChapterDetails__Group__6__Impl rule__ChapterDetails__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__ChapterDetails__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChapterDetails__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__6"


    // $ANTLR start "rule__ChapterDetails__Group__6__Impl"
    // InternalJoveNotes.g:1616:1: rule__ChapterDetails__Group__6__Impl : ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) ) ;
    public final void rule__ChapterDetails__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1620:1: ( ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) ) )
            // InternalJoveNotes.g:1621:1: ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) )
            {
            // InternalJoveNotes.g:1621:1: ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) )
            // InternalJoveNotes.g:1622:1: ( rule__ChapterDetails__SubChapterNumberAssignment_6 )
            {
             before(grammarAccess.getChapterDetailsAccess().getSubChapterNumberAssignment_6()); 
            // InternalJoveNotes.g:1623:1: ( rule__ChapterDetails__SubChapterNumberAssignment_6 )
            // InternalJoveNotes.g:1623:2: rule__ChapterDetails__SubChapterNumberAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ChapterDetails__SubChapterNumberAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getChapterDetailsAccess().getSubChapterNumberAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__6__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__7"
    // InternalJoveNotes.g:1633:1: rule__ChapterDetails__Group__7 : rule__ChapterDetails__Group__7__Impl rule__ChapterDetails__Group__8 ;
    public final void rule__ChapterDetails__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1637:1: ( rule__ChapterDetails__Group__7__Impl rule__ChapterDetails__Group__8 )
            // InternalJoveNotes.g:1638:2: rule__ChapterDetails__Group__7__Impl rule__ChapterDetails__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__ChapterDetails__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChapterDetails__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__7"


    // $ANTLR start "rule__ChapterDetails__Group__7__Impl"
    // InternalJoveNotes.g:1645:1: rule__ChapterDetails__Group__7__Impl : ( 'chapterName' ) ;
    public final void rule__ChapterDetails__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1649:1: ( ( 'chapterName' ) )
            // InternalJoveNotes.g:1650:1: ( 'chapterName' )
            {
            // InternalJoveNotes.g:1650:1: ( 'chapterName' )
            // InternalJoveNotes.g:1651:1: 'chapterName'
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNameKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChapterDetailsAccess().getChapterNameKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__7__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__8"
    // InternalJoveNotes.g:1664:1: rule__ChapterDetails__Group__8 : rule__ChapterDetails__Group__8__Impl rule__ChapterDetails__Group__9 ;
    public final void rule__ChapterDetails__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1668:1: ( rule__ChapterDetails__Group__8__Impl rule__ChapterDetails__Group__9 )
            // InternalJoveNotes.g:1669:2: rule__ChapterDetails__Group__8__Impl rule__ChapterDetails__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__ChapterDetails__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChapterDetails__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__8"


    // $ANTLR start "rule__ChapterDetails__Group__8__Impl"
    // InternalJoveNotes.g:1676:1: rule__ChapterDetails__Group__8__Impl : ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) ) ;
    public final void rule__ChapterDetails__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1680:1: ( ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) ) )
            // InternalJoveNotes.g:1681:1: ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) )
            {
            // InternalJoveNotes.g:1681:1: ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) )
            // InternalJoveNotes.g:1682:1: ( rule__ChapterDetails__ChapterNameAssignment_8 )
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNameAssignment_8()); 
            // InternalJoveNotes.g:1683:1: ( rule__ChapterDetails__ChapterNameAssignment_8 )
            // InternalJoveNotes.g:1683:2: rule__ChapterDetails__ChapterNameAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ChapterDetails__ChapterNameAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getChapterDetailsAccess().getChapterNameAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__8__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__9"
    // InternalJoveNotes.g:1693:1: rule__ChapterDetails__Group__9 : rule__ChapterDetails__Group__9__Impl ;
    public final void rule__ChapterDetails__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1697:1: ( rule__ChapterDetails__Group__9__Impl )
            // InternalJoveNotes.g:1698:2: rule__ChapterDetails__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChapterDetails__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__9"


    // $ANTLR start "rule__ChapterDetails__Group__9__Impl"
    // InternalJoveNotes.g:1704:1: rule__ChapterDetails__Group__9__Impl : ( ( rule__ChapterDetails__ScriptBodyAssignment_9 )? ) ;
    public final void rule__ChapterDetails__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1708:1: ( ( ( rule__ChapterDetails__ScriptBodyAssignment_9 )? ) )
            // InternalJoveNotes.g:1709:1: ( ( rule__ChapterDetails__ScriptBodyAssignment_9 )? )
            {
            // InternalJoveNotes.g:1709:1: ( ( rule__ChapterDetails__ScriptBodyAssignment_9 )? )
            // InternalJoveNotes.g:1710:1: ( rule__ChapterDetails__ScriptBodyAssignment_9 )?
            {
             before(grammarAccess.getChapterDetailsAccess().getScriptBodyAssignment_9()); 
            // InternalJoveNotes.g:1711:1: ( rule__ChapterDetails__ScriptBodyAssignment_9 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==56) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJoveNotes.g:1711:2: rule__ChapterDetails__ScriptBodyAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChapterDetails__ScriptBodyAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChapterDetailsAccess().getScriptBodyAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__9__Impl"


    // $ANTLR start "rule__NotesElement__Group__0"
    // InternalJoveNotes.g:1741:1: rule__NotesElement__Group__0 : rule__NotesElement__Group__0__Impl rule__NotesElement__Group__1 ;
    public final void rule__NotesElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1745:1: ( rule__NotesElement__Group__0__Impl rule__NotesElement__Group__1 )
            // InternalJoveNotes.g:1746:2: rule__NotesElement__Group__0__Impl rule__NotesElement__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__NotesElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotesElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotesElement__Group__0"


    // $ANTLR start "rule__NotesElement__Group__0__Impl"
    // InternalJoveNotes.g:1753:1: rule__NotesElement__Group__0__Impl : ( ( rule__NotesElement__Alternatives_0 ) ) ;
    public final void rule__NotesElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1757:1: ( ( ( rule__NotesElement__Alternatives_0 ) ) )
            // InternalJoveNotes.g:1758:1: ( ( rule__NotesElement__Alternatives_0 ) )
            {
            // InternalJoveNotes.g:1758:1: ( ( rule__NotesElement__Alternatives_0 ) )
            // InternalJoveNotes.g:1759:1: ( rule__NotesElement__Alternatives_0 )
            {
             before(grammarAccess.getNotesElementAccess().getAlternatives_0()); 
            // InternalJoveNotes.g:1760:1: ( rule__NotesElement__Alternatives_0 )
            // InternalJoveNotes.g:1760:2: rule__NotesElement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__NotesElement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNotesElementAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotesElement__Group__0__Impl"


    // $ANTLR start "rule__NotesElement__Group__1"
    // InternalJoveNotes.g:1770:1: rule__NotesElement__Group__1 : rule__NotesElement__Group__1__Impl ;
    public final void rule__NotesElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1774:1: ( rule__NotesElement__Group__1__Impl )
            // InternalJoveNotes.g:1775:2: rule__NotesElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotesElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotesElement__Group__1"


    // $ANTLR start "rule__NotesElement__Group__1__Impl"
    // InternalJoveNotes.g:1781:1: rule__NotesElement__Group__1__Impl : ( ( rule__NotesElement__ScriptAssignment_1 )? ) ;
    public final void rule__NotesElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1785:1: ( ( ( rule__NotesElement__ScriptAssignment_1 )? ) )
            // InternalJoveNotes.g:1786:1: ( ( rule__NotesElement__ScriptAssignment_1 )? )
            {
            // InternalJoveNotes.g:1786:1: ( ( rule__NotesElement__ScriptAssignment_1 )? )
            // InternalJoveNotes.g:1787:1: ( rule__NotesElement__ScriptAssignment_1 )?
            {
             before(grammarAccess.getNotesElementAccess().getScriptAssignment_1()); 
            // InternalJoveNotes.g:1788:1: ( rule__NotesElement__ScriptAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==55) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJoveNotes.g:1788:2: rule__NotesElement__ScriptAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NotesElement__ScriptAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNotesElementAccess().getScriptAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotesElement__Group__1__Impl"


    // $ANTLR start "rule__WordMeaning__Group__0"
    // InternalJoveNotes.g:1802:1: rule__WordMeaning__Group__0 : rule__WordMeaning__Group__0__Impl rule__WordMeaning__Group__1 ;
    public final void rule__WordMeaning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1806:1: ( rule__WordMeaning__Group__0__Impl rule__WordMeaning__Group__1 )
            // InternalJoveNotes.g:1807:2: rule__WordMeaning__Group__0__Impl rule__WordMeaning__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__WordMeaning__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WordMeaning__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__Group__0"


    // $ANTLR start "rule__WordMeaning__Group__0__Impl"
    // InternalJoveNotes.g:1814:1: rule__WordMeaning__Group__0__Impl : ( '@wm' ) ;
    public final void rule__WordMeaning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1818:1: ( ( '@wm' ) )
            // InternalJoveNotes.g:1819:1: ( '@wm' )
            {
            // InternalJoveNotes.g:1819:1: ( '@wm' )
            // InternalJoveNotes.g:1820:1: '@wm'
            {
             before(grammarAccess.getWordMeaningAccess().getWmKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWordMeaningAccess().getWmKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__Group__0__Impl"


    // $ANTLR start "rule__WordMeaning__Group__1"
    // InternalJoveNotes.g:1833:1: rule__WordMeaning__Group__1 : rule__WordMeaning__Group__1__Impl rule__WordMeaning__Group__2 ;
    public final void rule__WordMeaning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1837:1: ( rule__WordMeaning__Group__1__Impl rule__WordMeaning__Group__2 )
            // InternalJoveNotes.g:1838:2: rule__WordMeaning__Group__1__Impl rule__WordMeaning__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__WordMeaning__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WordMeaning__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__Group__1"


    // $ANTLR start "rule__WordMeaning__Group__1__Impl"
    // InternalJoveNotes.g:1845:1: rule__WordMeaning__Group__1__Impl : ( ( rule__WordMeaning__HideFromViewAssignment_1 )? ) ;
    public final void rule__WordMeaning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1849:1: ( ( ( rule__WordMeaning__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:1850:1: ( ( rule__WordMeaning__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:1850:1: ( ( rule__WordMeaning__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:1851:1: ( rule__WordMeaning__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getWordMeaningAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:1852:1: ( rule__WordMeaning__HideFromViewAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==60) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJoveNotes.g:1852:2: rule__WordMeaning__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__WordMeaning__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWordMeaningAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__Group__1__Impl"


    // $ANTLR start "rule__WordMeaning__Group__2"
    // InternalJoveNotes.g:1862:1: rule__WordMeaning__Group__2 : rule__WordMeaning__Group__2__Impl rule__WordMeaning__Group__3 ;
    public final void rule__WordMeaning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1866:1: ( rule__WordMeaning__Group__2__Impl rule__WordMeaning__Group__3 )
            // InternalJoveNotes.g:1867:2: rule__WordMeaning__Group__2__Impl rule__WordMeaning__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__WordMeaning__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WordMeaning__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__Group__2"


    // $ANTLR start "rule__WordMeaning__Group__2__Impl"
    // InternalJoveNotes.g:1874:1: rule__WordMeaning__Group__2__Impl : ( ( rule__WordMeaning__WordAssignment_2 ) ) ;
    public final void rule__WordMeaning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1878:1: ( ( ( rule__WordMeaning__WordAssignment_2 ) ) )
            // InternalJoveNotes.g:1879:1: ( ( rule__WordMeaning__WordAssignment_2 ) )
            {
            // InternalJoveNotes.g:1879:1: ( ( rule__WordMeaning__WordAssignment_2 ) )
            // InternalJoveNotes.g:1880:1: ( rule__WordMeaning__WordAssignment_2 )
            {
             before(grammarAccess.getWordMeaningAccess().getWordAssignment_2()); 
            // InternalJoveNotes.g:1881:1: ( rule__WordMeaning__WordAssignment_2 )
            // InternalJoveNotes.g:1881:2: rule__WordMeaning__WordAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WordMeaning__WordAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWordMeaningAccess().getWordAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__Group__2__Impl"


    // $ANTLR start "rule__WordMeaning__Group__3"
    // InternalJoveNotes.g:1891:1: rule__WordMeaning__Group__3 : rule__WordMeaning__Group__3__Impl ;
    public final void rule__WordMeaning__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1895:1: ( rule__WordMeaning__Group__3__Impl )
            // InternalJoveNotes.g:1896:2: rule__WordMeaning__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WordMeaning__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__Group__3"


    // $ANTLR start "rule__WordMeaning__Group__3__Impl"
    // InternalJoveNotes.g:1902:1: rule__WordMeaning__Group__3__Impl : ( ( rule__WordMeaning__MeaningAssignment_3 ) ) ;
    public final void rule__WordMeaning__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1906:1: ( ( ( rule__WordMeaning__MeaningAssignment_3 ) ) )
            // InternalJoveNotes.g:1907:1: ( ( rule__WordMeaning__MeaningAssignment_3 ) )
            {
            // InternalJoveNotes.g:1907:1: ( ( rule__WordMeaning__MeaningAssignment_3 ) )
            // InternalJoveNotes.g:1908:1: ( rule__WordMeaning__MeaningAssignment_3 )
            {
             before(grammarAccess.getWordMeaningAccess().getMeaningAssignment_3()); 
            // InternalJoveNotes.g:1909:1: ( rule__WordMeaning__MeaningAssignment_3 )
            // InternalJoveNotes.g:1909:2: rule__WordMeaning__MeaningAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WordMeaning__MeaningAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWordMeaningAccess().getMeaningAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__Group__3__Impl"


    // $ANTLR start "rule__QuestionAnswer__Group__0"
    // InternalJoveNotes.g:1927:1: rule__QuestionAnswer__Group__0 : rule__QuestionAnswer__Group__0__Impl rule__QuestionAnswer__Group__1 ;
    public final void rule__QuestionAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1931:1: ( rule__QuestionAnswer__Group__0__Impl rule__QuestionAnswer__Group__1 )
            // InternalJoveNotes.g:1932:2: rule__QuestionAnswer__Group__0__Impl rule__QuestionAnswer__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__QuestionAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionAnswer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__0"


    // $ANTLR start "rule__QuestionAnswer__Group__0__Impl"
    // InternalJoveNotes.g:1939:1: rule__QuestionAnswer__Group__0__Impl : ( '@qa' ) ;
    public final void rule__QuestionAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1943:1: ( ( '@qa' ) )
            // InternalJoveNotes.g:1944:1: ( '@qa' )
            {
            // InternalJoveNotes.g:1944:1: ( '@qa' )
            // InternalJoveNotes.g:1945:1: '@qa'
            {
             before(grammarAccess.getQuestionAnswerAccess().getQaKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuestionAnswerAccess().getQaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__0__Impl"


    // $ANTLR start "rule__QuestionAnswer__Group__1"
    // InternalJoveNotes.g:1958:1: rule__QuestionAnswer__Group__1 : rule__QuestionAnswer__Group__1__Impl rule__QuestionAnswer__Group__2 ;
    public final void rule__QuestionAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1962:1: ( rule__QuestionAnswer__Group__1__Impl rule__QuestionAnswer__Group__2 )
            // InternalJoveNotes.g:1963:2: rule__QuestionAnswer__Group__1__Impl rule__QuestionAnswer__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__QuestionAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionAnswer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__1"


    // $ANTLR start "rule__QuestionAnswer__Group__1__Impl"
    // InternalJoveNotes.g:1970:1: rule__QuestionAnswer__Group__1__Impl : ( ( rule__QuestionAnswer__HideFromViewAssignment_1 )? ) ;
    public final void rule__QuestionAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1974:1: ( ( ( rule__QuestionAnswer__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:1975:1: ( ( rule__QuestionAnswer__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:1975:1: ( ( rule__QuestionAnswer__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:1976:1: ( rule__QuestionAnswer__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getQuestionAnswerAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:1977:1: ( rule__QuestionAnswer__HideFromViewAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==60) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJoveNotes.g:1977:2: rule__QuestionAnswer__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionAnswer__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAnswerAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__1__Impl"


    // $ANTLR start "rule__QuestionAnswer__Group__2"
    // InternalJoveNotes.g:1987:1: rule__QuestionAnswer__Group__2 : rule__QuestionAnswer__Group__2__Impl rule__QuestionAnswer__Group__3 ;
    public final void rule__QuestionAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1991:1: ( rule__QuestionAnswer__Group__2__Impl rule__QuestionAnswer__Group__3 )
            // InternalJoveNotes.g:1992:2: rule__QuestionAnswer__Group__2__Impl rule__QuestionAnswer__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__QuestionAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionAnswer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__2"


    // $ANTLR start "rule__QuestionAnswer__Group__2__Impl"
    // InternalJoveNotes.g:1999:1: rule__QuestionAnswer__Group__2__Impl : ( ( rule__QuestionAnswer__QuestionAssignment_2 ) ) ;
    public final void rule__QuestionAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2003:1: ( ( ( rule__QuestionAnswer__QuestionAssignment_2 ) ) )
            // InternalJoveNotes.g:2004:1: ( ( rule__QuestionAnswer__QuestionAssignment_2 ) )
            {
            // InternalJoveNotes.g:2004:1: ( ( rule__QuestionAnswer__QuestionAssignment_2 ) )
            // InternalJoveNotes.g:2005:1: ( rule__QuestionAnswer__QuestionAssignment_2 )
            {
             before(grammarAccess.getQuestionAnswerAccess().getQuestionAssignment_2()); 
            // InternalJoveNotes.g:2006:1: ( rule__QuestionAnswer__QuestionAssignment_2 )
            // InternalJoveNotes.g:2006:2: rule__QuestionAnswer__QuestionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QuestionAnswer__QuestionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAnswerAccess().getQuestionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__2__Impl"


    // $ANTLR start "rule__QuestionAnswer__Group__3"
    // InternalJoveNotes.g:2016:1: rule__QuestionAnswer__Group__3 : rule__QuestionAnswer__Group__3__Impl rule__QuestionAnswer__Group__4 ;
    public final void rule__QuestionAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2020:1: ( rule__QuestionAnswer__Group__3__Impl rule__QuestionAnswer__Group__4 )
            // InternalJoveNotes.g:2021:2: rule__QuestionAnswer__Group__3__Impl rule__QuestionAnswer__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__QuestionAnswer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionAnswer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__3"


    // $ANTLR start "rule__QuestionAnswer__Group__3__Impl"
    // InternalJoveNotes.g:2028:1: rule__QuestionAnswer__Group__3__Impl : ( ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* ) ) ;
    public final void rule__QuestionAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2032:1: ( ( ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* ) ) )
            // InternalJoveNotes.g:2033:1: ( ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* ) )
            {
            // InternalJoveNotes.g:2033:1: ( ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* ) )
            // InternalJoveNotes.g:2034:1: ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* )
            {
            // InternalJoveNotes.g:2034:1: ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) )
            // InternalJoveNotes.g:2035:1: ( rule__QuestionAnswer__AnswerPartsAssignment_3 )
            {
             before(grammarAccess.getQuestionAnswerAccess().getAnswerPartsAssignment_3()); 
            // InternalJoveNotes.g:2036:1: ( rule__QuestionAnswer__AnswerPartsAssignment_3 )
            // InternalJoveNotes.g:2036:2: rule__QuestionAnswer__AnswerPartsAssignment_3
            {
            pushFollow(FOLLOW_16);
            rule__QuestionAnswer__AnswerPartsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAnswerAccess().getAnswerPartsAssignment_3()); 

            }

            // InternalJoveNotes.g:2039:1: ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* )
            // InternalJoveNotes.g:2040:1: ( rule__QuestionAnswer__AnswerPartsAssignment_3 )*
            {
             before(grammarAccess.getQuestionAnswerAccess().getAnswerPartsAssignment_3()); 
            // InternalJoveNotes.g:2041:1: ( rule__QuestionAnswer__AnswerPartsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJoveNotes.g:2041:2: rule__QuestionAnswer__AnswerPartsAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__QuestionAnswer__AnswerPartsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getQuestionAnswerAccess().getAnswerPartsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__3__Impl"


    // $ANTLR start "rule__QuestionAnswer__Group__4"
    // InternalJoveNotes.g:2052:1: rule__QuestionAnswer__Group__4 : rule__QuestionAnswer__Group__4__Impl ;
    public final void rule__QuestionAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2056:1: ( rule__QuestionAnswer__Group__4__Impl )
            // InternalJoveNotes.g:2057:2: rule__QuestionAnswer__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionAnswer__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__4"


    // $ANTLR start "rule__QuestionAnswer__Group__4__Impl"
    // InternalJoveNotes.g:2063:1: rule__QuestionAnswer__Group__4__Impl : ( ( rule__QuestionAnswer__CmapAssignment_4 )? ) ;
    public final void rule__QuestionAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2067:1: ( ( ( rule__QuestionAnswer__CmapAssignment_4 )? ) )
            // InternalJoveNotes.g:2068:1: ( ( rule__QuestionAnswer__CmapAssignment_4 )? )
            {
            // InternalJoveNotes.g:2068:1: ( ( rule__QuestionAnswer__CmapAssignment_4 )? )
            // InternalJoveNotes.g:2069:1: ( rule__QuestionAnswer__CmapAssignment_4 )?
            {
             before(grammarAccess.getQuestionAnswerAccess().getCmapAssignment_4()); 
            // InternalJoveNotes.g:2070:1: ( rule__QuestionAnswer__CmapAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==54) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJoveNotes.g:2070:2: rule__QuestionAnswer__CmapAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionAnswer__CmapAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAnswerAccess().getCmapAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__4__Impl"


    // $ANTLR start "rule__FIB__Group__0"
    // InternalJoveNotes.g:2090:1: rule__FIB__Group__0 : rule__FIB__Group__0__Impl rule__FIB__Group__1 ;
    public final void rule__FIB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2094:1: ( rule__FIB__Group__0__Impl rule__FIB__Group__1 )
            // InternalJoveNotes.g:2095:2: rule__FIB__Group__0__Impl rule__FIB__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__FIB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FIB__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__Group__0"


    // $ANTLR start "rule__FIB__Group__0__Impl"
    // InternalJoveNotes.g:2102:1: rule__FIB__Group__0__Impl : ( '@fib' ) ;
    public final void rule__FIB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2106:1: ( ( '@fib' ) )
            // InternalJoveNotes.g:2107:1: ( '@fib' )
            {
            // InternalJoveNotes.g:2107:1: ( '@fib' )
            // InternalJoveNotes.g:2108:1: '@fib'
            {
             before(grammarAccess.getFIBAccess().getFibKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFIBAccess().getFibKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__Group__0__Impl"


    // $ANTLR start "rule__FIB__Group__1"
    // InternalJoveNotes.g:2121:1: rule__FIB__Group__1 : rule__FIB__Group__1__Impl rule__FIB__Group__2 ;
    public final void rule__FIB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2125:1: ( rule__FIB__Group__1__Impl rule__FIB__Group__2 )
            // InternalJoveNotes.g:2126:2: rule__FIB__Group__1__Impl rule__FIB__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__FIB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FIB__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__Group__1"


    // $ANTLR start "rule__FIB__Group__1__Impl"
    // InternalJoveNotes.g:2133:1: rule__FIB__Group__1__Impl : ( ( rule__FIB__HideFromViewAssignment_1 )? ) ;
    public final void rule__FIB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2137:1: ( ( ( rule__FIB__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:2138:1: ( ( rule__FIB__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:2138:1: ( ( rule__FIB__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:2139:1: ( rule__FIB__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getFIBAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:2140:1: ( rule__FIB__HideFromViewAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==60) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJoveNotes.g:2140:2: rule__FIB__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FIB__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFIBAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__Group__1__Impl"


    // $ANTLR start "rule__FIB__Group__2"
    // InternalJoveNotes.g:2150:1: rule__FIB__Group__2 : rule__FIB__Group__2__Impl rule__FIB__Group__3 ;
    public final void rule__FIB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2154:1: ( rule__FIB__Group__2__Impl rule__FIB__Group__3 )
            // InternalJoveNotes.g:2155:2: rule__FIB__Group__2__Impl rule__FIB__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__FIB__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FIB__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__Group__2"


    // $ANTLR start "rule__FIB__Group__2__Impl"
    // InternalJoveNotes.g:2162:1: rule__FIB__Group__2__Impl : ( ( rule__FIB__QuestionAssignment_2 ) ) ;
    public final void rule__FIB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2166:1: ( ( ( rule__FIB__QuestionAssignment_2 ) ) )
            // InternalJoveNotes.g:2167:1: ( ( rule__FIB__QuestionAssignment_2 ) )
            {
            // InternalJoveNotes.g:2167:1: ( ( rule__FIB__QuestionAssignment_2 ) )
            // InternalJoveNotes.g:2168:1: ( rule__FIB__QuestionAssignment_2 )
            {
             before(grammarAccess.getFIBAccess().getQuestionAssignment_2()); 
            // InternalJoveNotes.g:2169:1: ( rule__FIB__QuestionAssignment_2 )
            // InternalJoveNotes.g:2169:2: rule__FIB__QuestionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FIB__QuestionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFIBAccess().getQuestionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__Group__2__Impl"


    // $ANTLR start "rule__FIB__Group__3"
    // InternalJoveNotes.g:2179:1: rule__FIB__Group__3 : rule__FIB__Group__3__Impl ;
    public final void rule__FIB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2183:1: ( rule__FIB__Group__3__Impl )
            // InternalJoveNotes.g:2184:2: rule__FIB__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FIB__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__Group__3"


    // $ANTLR start "rule__FIB__Group__3__Impl"
    // InternalJoveNotes.g:2190:1: rule__FIB__Group__3__Impl : ( ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* ) ) ;
    public final void rule__FIB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2194:1: ( ( ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* ) ) )
            // InternalJoveNotes.g:2195:1: ( ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* ) )
            {
            // InternalJoveNotes.g:2195:1: ( ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* ) )
            // InternalJoveNotes.g:2196:1: ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* )
            {
            // InternalJoveNotes.g:2196:1: ( ( rule__FIB__AnswersAssignment_3 ) )
            // InternalJoveNotes.g:2197:1: ( rule__FIB__AnswersAssignment_3 )
            {
             before(grammarAccess.getFIBAccess().getAnswersAssignment_3()); 
            // InternalJoveNotes.g:2198:1: ( rule__FIB__AnswersAssignment_3 )
            // InternalJoveNotes.g:2198:2: rule__FIB__AnswersAssignment_3
            {
            pushFollow(FOLLOW_16);
            rule__FIB__AnswersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFIBAccess().getAnswersAssignment_3()); 

            }

            // InternalJoveNotes.g:2201:1: ( ( rule__FIB__AnswersAssignment_3 )* )
            // InternalJoveNotes.g:2202:1: ( rule__FIB__AnswersAssignment_3 )*
            {
             before(grammarAccess.getFIBAccess().getAnswersAssignment_3()); 
            // InternalJoveNotes.g:2203:1: ( rule__FIB__AnswersAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJoveNotes.g:2203:2: rule__FIB__AnswersAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__FIB__AnswersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFIBAccess().getAnswersAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__Group__3__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // InternalJoveNotes.g:2222:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2226:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // InternalJoveNotes.g:2227:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // InternalJoveNotes.g:2234:1: rule__Definition__Group__0__Impl : ( '@definition' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2238:1: ( ( '@definition' ) )
            // InternalJoveNotes.g:2239:1: ( '@definition' )
            {
            // InternalJoveNotes.g:2239:1: ( '@definition' )
            // InternalJoveNotes.g:2240:1: '@definition'
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getDefinitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // InternalJoveNotes.g:2253:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2257:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // InternalJoveNotes.g:2258:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // InternalJoveNotes.g:2265:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__HideFromViewAssignment_1 )? ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2269:1: ( ( ( rule__Definition__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:2270:1: ( ( rule__Definition__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:2270:1: ( ( rule__Definition__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:2271:1: ( rule__Definition__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getDefinitionAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:2272:1: ( rule__Definition__HideFromViewAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==60) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJoveNotes.g:2272:2: rule__Definition__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__2"
    // InternalJoveNotes.g:2282:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2286:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // InternalJoveNotes.g:2287:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Definition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2"


    // $ANTLR start "rule__Definition__Group__2__Impl"
    // InternalJoveNotes.g:2294:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__TermAssignment_2 ) ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2298:1: ( ( ( rule__Definition__TermAssignment_2 ) ) )
            // InternalJoveNotes.g:2299:1: ( ( rule__Definition__TermAssignment_2 ) )
            {
            // InternalJoveNotes.g:2299:1: ( ( rule__Definition__TermAssignment_2 ) )
            // InternalJoveNotes.g:2300:1: ( rule__Definition__TermAssignment_2 )
            {
             before(grammarAccess.getDefinitionAccess().getTermAssignment_2()); 
            // InternalJoveNotes.g:2301:1: ( rule__Definition__TermAssignment_2 )
            // InternalJoveNotes.g:2301:2: rule__Definition__TermAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__TermAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getTermAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2__Impl"


    // $ANTLR start "rule__Definition__Group__3"
    // InternalJoveNotes.g:2311:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2315:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // InternalJoveNotes.g:2316:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Definition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__3"


    // $ANTLR start "rule__Definition__Group__3__Impl"
    // InternalJoveNotes.g:2323:1: rule__Definition__Group__3__Impl : ( ( rule__Definition__DefinitionAssignment_3 ) ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2327:1: ( ( ( rule__Definition__DefinitionAssignment_3 ) ) )
            // InternalJoveNotes.g:2328:1: ( ( rule__Definition__DefinitionAssignment_3 ) )
            {
            // InternalJoveNotes.g:2328:1: ( ( rule__Definition__DefinitionAssignment_3 ) )
            // InternalJoveNotes.g:2329:1: ( rule__Definition__DefinitionAssignment_3 )
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionAssignment_3()); 
            // InternalJoveNotes.g:2330:1: ( rule__Definition__DefinitionAssignment_3 )
            // InternalJoveNotes.g:2330:2: rule__Definition__DefinitionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Definition__DefinitionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getDefinitionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__3__Impl"


    // $ANTLR start "rule__Definition__Group__4"
    // InternalJoveNotes.g:2340:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2344:1: ( rule__Definition__Group__4__Impl )
            // InternalJoveNotes.g:2345:2: rule__Definition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__4"


    // $ANTLR start "rule__Definition__Group__4__Impl"
    // InternalJoveNotes.g:2351:1: rule__Definition__Group__4__Impl : ( ( rule__Definition__CmapAssignment_4 )? ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2355:1: ( ( ( rule__Definition__CmapAssignment_4 )? ) )
            // InternalJoveNotes.g:2356:1: ( ( rule__Definition__CmapAssignment_4 )? )
            {
            // InternalJoveNotes.g:2356:1: ( ( rule__Definition__CmapAssignment_4 )? )
            // InternalJoveNotes.g:2357:1: ( rule__Definition__CmapAssignment_4 )?
            {
             before(grammarAccess.getDefinitionAccess().getCmapAssignment_4()); 
            // InternalJoveNotes.g:2358:1: ( rule__Definition__CmapAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==54) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJoveNotes.g:2358:2: rule__Definition__CmapAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__CmapAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getCmapAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__4__Impl"


    // $ANTLR start "rule__Character__Group__0"
    // InternalJoveNotes.g:2378:1: rule__Character__Group__0 : rule__Character__Group__0__Impl rule__Character__Group__1 ;
    public final void rule__Character__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2382:1: ( rule__Character__Group__0__Impl rule__Character__Group__1 )
            // InternalJoveNotes.g:2383:2: rule__Character__Group__0__Impl rule__Character__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Character__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__0"


    // $ANTLR start "rule__Character__Group__0__Impl"
    // InternalJoveNotes.g:2390:1: rule__Character__Group__0__Impl : ( '@character' ) ;
    public final void rule__Character__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2394:1: ( ( '@character' ) )
            // InternalJoveNotes.g:2395:1: ( '@character' )
            {
            // InternalJoveNotes.g:2395:1: ( '@character' )
            // InternalJoveNotes.g:2396:1: '@character'
            {
             before(grammarAccess.getCharacterAccess().getCharacterKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getCharacterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__0__Impl"


    // $ANTLR start "rule__Character__Group__1"
    // InternalJoveNotes.g:2409:1: rule__Character__Group__1 : rule__Character__Group__1__Impl rule__Character__Group__2 ;
    public final void rule__Character__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2413:1: ( rule__Character__Group__1__Impl rule__Character__Group__2 )
            // InternalJoveNotes.g:2414:2: rule__Character__Group__1__Impl rule__Character__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Character__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__1"


    // $ANTLR start "rule__Character__Group__1__Impl"
    // InternalJoveNotes.g:2421:1: rule__Character__Group__1__Impl : ( ( rule__Character__HideFromViewAssignment_1 )? ) ;
    public final void rule__Character__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2425:1: ( ( ( rule__Character__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:2426:1: ( ( rule__Character__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:2426:1: ( ( rule__Character__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:2427:1: ( rule__Character__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getCharacterAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:2428:1: ( rule__Character__HideFromViewAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==60) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJoveNotes.g:2428:2: rule__Character__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Character__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacterAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__1__Impl"


    // $ANTLR start "rule__Character__Group__2"
    // InternalJoveNotes.g:2438:1: rule__Character__Group__2 : rule__Character__Group__2__Impl rule__Character__Group__3 ;
    public final void rule__Character__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2442:1: ( rule__Character__Group__2__Impl rule__Character__Group__3 )
            // InternalJoveNotes.g:2443:2: rule__Character__Group__2__Impl rule__Character__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Character__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__2"


    // $ANTLR start "rule__Character__Group__2__Impl"
    // InternalJoveNotes.g:2450:1: rule__Character__Group__2__Impl : ( ( rule__Character__CharacterAssignment_2 ) ) ;
    public final void rule__Character__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2454:1: ( ( ( rule__Character__CharacterAssignment_2 ) ) )
            // InternalJoveNotes.g:2455:1: ( ( rule__Character__CharacterAssignment_2 ) )
            {
            // InternalJoveNotes.g:2455:1: ( ( rule__Character__CharacterAssignment_2 ) )
            // InternalJoveNotes.g:2456:1: ( rule__Character__CharacterAssignment_2 )
            {
             before(grammarAccess.getCharacterAccess().getCharacterAssignment_2()); 
            // InternalJoveNotes.g:2457:1: ( rule__Character__CharacterAssignment_2 )
            // InternalJoveNotes.g:2457:2: rule__Character__CharacterAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Character__CharacterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getCharacterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__2__Impl"


    // $ANTLR start "rule__Character__Group__3"
    // InternalJoveNotes.g:2467:1: rule__Character__Group__3 : rule__Character__Group__3__Impl rule__Character__Group__4 ;
    public final void rule__Character__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2471:1: ( rule__Character__Group__3__Impl rule__Character__Group__4 )
            // InternalJoveNotes.g:2472:2: rule__Character__Group__3__Impl rule__Character__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Character__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__3"


    // $ANTLR start "rule__Character__Group__3__Impl"
    // InternalJoveNotes.g:2479:1: rule__Character__Group__3__Impl : ( ( rule__Character__EstimateAssignment_3 ) ) ;
    public final void rule__Character__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2483:1: ( ( ( rule__Character__EstimateAssignment_3 ) ) )
            // InternalJoveNotes.g:2484:1: ( ( rule__Character__EstimateAssignment_3 ) )
            {
            // InternalJoveNotes.g:2484:1: ( ( rule__Character__EstimateAssignment_3 ) )
            // InternalJoveNotes.g:2485:1: ( rule__Character__EstimateAssignment_3 )
            {
             before(grammarAccess.getCharacterAccess().getEstimateAssignment_3()); 
            // InternalJoveNotes.g:2486:1: ( rule__Character__EstimateAssignment_3 )
            // InternalJoveNotes.g:2486:2: rule__Character__EstimateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Character__EstimateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getEstimateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__3__Impl"


    // $ANTLR start "rule__Character__Group__4"
    // InternalJoveNotes.g:2496:1: rule__Character__Group__4 : rule__Character__Group__4__Impl ;
    public final void rule__Character__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2500:1: ( rule__Character__Group__4__Impl )
            // InternalJoveNotes.g:2501:2: rule__Character__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Character__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__4"


    // $ANTLR start "rule__Character__Group__4__Impl"
    // InternalJoveNotes.g:2507:1: rule__Character__Group__4__Impl : ( ( rule__Character__CmapAssignment_4 )? ) ;
    public final void rule__Character__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2511:1: ( ( ( rule__Character__CmapAssignment_4 )? ) )
            // InternalJoveNotes.g:2512:1: ( ( rule__Character__CmapAssignment_4 )? )
            {
            // InternalJoveNotes.g:2512:1: ( ( rule__Character__CmapAssignment_4 )? )
            // InternalJoveNotes.g:2513:1: ( rule__Character__CmapAssignment_4 )?
            {
             before(grammarAccess.getCharacterAccess().getCmapAssignment_4()); 
            // InternalJoveNotes.g:2514:1: ( rule__Character__CmapAssignment_4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==54) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJoveNotes.g:2514:2: rule__Character__CmapAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Character__CmapAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacterAccess().getCmapAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__4__Impl"


    // $ANTLR start "rule__TeacherNote__Group__0"
    // InternalJoveNotes.g:2534:1: rule__TeacherNote__Group__0 : rule__TeacherNote__Group__0__Impl rule__TeacherNote__Group__1 ;
    public final void rule__TeacherNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2538:1: ( rule__TeacherNote__Group__0__Impl rule__TeacherNote__Group__1 )
            // InternalJoveNotes.g:2539:2: rule__TeacherNote__Group__0__Impl rule__TeacherNote__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TeacherNote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TeacherNote__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__0"


    // $ANTLR start "rule__TeacherNote__Group__0__Impl"
    // InternalJoveNotes.g:2546:1: rule__TeacherNote__Group__0__Impl : ( '@tn' ) ;
    public final void rule__TeacherNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2550:1: ( ( '@tn' ) )
            // InternalJoveNotes.g:2551:1: ( '@tn' )
            {
            // InternalJoveNotes.g:2551:1: ( '@tn' )
            // InternalJoveNotes.g:2552:1: '@tn'
            {
             before(grammarAccess.getTeacherNoteAccess().getTnKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTeacherNoteAccess().getTnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__0__Impl"


    // $ANTLR start "rule__TeacherNote__Group__1"
    // InternalJoveNotes.g:2565:1: rule__TeacherNote__Group__1 : rule__TeacherNote__Group__1__Impl rule__TeacherNote__Group__2 ;
    public final void rule__TeacherNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2569:1: ( rule__TeacherNote__Group__1__Impl rule__TeacherNote__Group__2 )
            // InternalJoveNotes.g:2570:2: rule__TeacherNote__Group__1__Impl rule__TeacherNote__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__TeacherNote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TeacherNote__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__1"


    // $ANTLR start "rule__TeacherNote__Group__1__Impl"
    // InternalJoveNotes.g:2577:1: rule__TeacherNote__Group__1__Impl : ( ( rule__TeacherNote__HideFromViewAssignment_1 )? ) ;
    public final void rule__TeacherNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2581:1: ( ( ( rule__TeacherNote__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:2582:1: ( ( rule__TeacherNote__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:2582:1: ( ( rule__TeacherNote__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:2583:1: ( rule__TeacherNote__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getTeacherNoteAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:2584:1: ( rule__TeacherNote__HideFromViewAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==60) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJoveNotes.g:2584:2: rule__TeacherNote__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TeacherNote__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeacherNoteAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__1__Impl"


    // $ANTLR start "rule__TeacherNote__Group__2"
    // InternalJoveNotes.g:2594:1: rule__TeacherNote__Group__2 : rule__TeacherNote__Group__2__Impl rule__TeacherNote__Group__3 ;
    public final void rule__TeacherNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2598:1: ( rule__TeacherNote__Group__2__Impl rule__TeacherNote__Group__3 )
            // InternalJoveNotes.g:2599:2: rule__TeacherNote__Group__2__Impl rule__TeacherNote__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__TeacherNote__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TeacherNote__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__2"


    // $ANTLR start "rule__TeacherNote__Group__2__Impl"
    // InternalJoveNotes.g:2606:1: rule__TeacherNote__Group__2__Impl : ( ( rule__TeacherNote__CaptionAssignment_2 )? ) ;
    public final void rule__TeacherNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2610:1: ( ( ( rule__TeacherNote__CaptionAssignment_2 )? ) )
            // InternalJoveNotes.g:2611:1: ( ( rule__TeacherNote__CaptionAssignment_2 )? )
            {
            // InternalJoveNotes.g:2611:1: ( ( rule__TeacherNote__CaptionAssignment_2 )? )
            // InternalJoveNotes.g:2612:1: ( rule__TeacherNote__CaptionAssignment_2 )?
            {
             before(grammarAccess.getTeacherNoteAccess().getCaptionAssignment_2()); 
            // InternalJoveNotes.g:2613:1: ( rule__TeacherNote__CaptionAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_STRING) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalJoveNotes.g:2613:2: rule__TeacherNote__CaptionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TeacherNote__CaptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeacherNoteAccess().getCaptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__2__Impl"


    // $ANTLR start "rule__TeacherNote__Group__3"
    // InternalJoveNotes.g:2623:1: rule__TeacherNote__Group__3 : rule__TeacherNote__Group__3__Impl rule__TeacherNote__Group__4 ;
    public final void rule__TeacherNote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2627:1: ( rule__TeacherNote__Group__3__Impl rule__TeacherNote__Group__4 )
            // InternalJoveNotes.g:2628:2: rule__TeacherNote__Group__3__Impl rule__TeacherNote__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__TeacherNote__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TeacherNote__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__3"


    // $ANTLR start "rule__TeacherNote__Group__3__Impl"
    // InternalJoveNotes.g:2635:1: rule__TeacherNote__Group__3__Impl : ( ( rule__TeacherNote__NoteAssignment_3 ) ) ;
    public final void rule__TeacherNote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2639:1: ( ( ( rule__TeacherNote__NoteAssignment_3 ) ) )
            // InternalJoveNotes.g:2640:1: ( ( rule__TeacherNote__NoteAssignment_3 ) )
            {
            // InternalJoveNotes.g:2640:1: ( ( rule__TeacherNote__NoteAssignment_3 ) )
            // InternalJoveNotes.g:2641:1: ( rule__TeacherNote__NoteAssignment_3 )
            {
             before(grammarAccess.getTeacherNoteAccess().getNoteAssignment_3()); 
            // InternalJoveNotes.g:2642:1: ( rule__TeacherNote__NoteAssignment_3 )
            // InternalJoveNotes.g:2642:2: rule__TeacherNote__NoteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TeacherNote__NoteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTeacherNoteAccess().getNoteAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__3__Impl"


    // $ANTLR start "rule__TeacherNote__Group__4"
    // InternalJoveNotes.g:2652:1: rule__TeacherNote__Group__4 : rule__TeacherNote__Group__4__Impl ;
    public final void rule__TeacherNote__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2656:1: ( rule__TeacherNote__Group__4__Impl )
            // InternalJoveNotes.g:2657:2: rule__TeacherNote__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TeacherNote__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__4"


    // $ANTLR start "rule__TeacherNote__Group__4__Impl"
    // InternalJoveNotes.g:2663:1: rule__TeacherNote__Group__4__Impl : ( ( rule__TeacherNote__CmapAssignment_4 )? ) ;
    public final void rule__TeacherNote__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2667:1: ( ( ( rule__TeacherNote__CmapAssignment_4 )? ) )
            // InternalJoveNotes.g:2668:1: ( ( rule__TeacherNote__CmapAssignment_4 )? )
            {
            // InternalJoveNotes.g:2668:1: ( ( rule__TeacherNote__CmapAssignment_4 )? )
            // InternalJoveNotes.g:2669:1: ( rule__TeacherNote__CmapAssignment_4 )?
            {
             before(grammarAccess.getTeacherNoteAccess().getCmapAssignment_4()); 
            // InternalJoveNotes.g:2670:1: ( rule__TeacherNote__CmapAssignment_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==54) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJoveNotes.g:2670:2: rule__TeacherNote__CmapAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__TeacherNote__CmapAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeacherNoteAccess().getCmapAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__4__Impl"


    // $ANTLR start "rule__Matching__Group__0"
    // InternalJoveNotes.g:2690:1: rule__Matching__Group__0 : rule__Matching__Group__0__Impl rule__Matching__Group__1 ;
    public final void rule__Matching__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2694:1: ( rule__Matching__Group__0__Impl rule__Matching__Group__1 )
            // InternalJoveNotes.g:2695:2: rule__Matching__Group__0__Impl rule__Matching__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Matching__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matching__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__0"


    // $ANTLR start "rule__Matching__Group__0__Impl"
    // InternalJoveNotes.g:2702:1: rule__Matching__Group__0__Impl : ( '@match' ) ;
    public final void rule__Matching__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2706:1: ( ( '@match' ) )
            // InternalJoveNotes.g:2707:1: ( '@match' )
            {
            // InternalJoveNotes.g:2707:1: ( '@match' )
            // InternalJoveNotes.g:2708:1: '@match'
            {
             before(grammarAccess.getMatchingAccess().getMatchKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMatchingAccess().getMatchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__0__Impl"


    // $ANTLR start "rule__Matching__Group__1"
    // InternalJoveNotes.g:2721:1: rule__Matching__Group__1 : rule__Matching__Group__1__Impl rule__Matching__Group__2 ;
    public final void rule__Matching__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2725:1: ( rule__Matching__Group__1__Impl rule__Matching__Group__2 )
            // InternalJoveNotes.g:2726:2: rule__Matching__Group__1__Impl rule__Matching__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Matching__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matching__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__1"


    // $ANTLR start "rule__Matching__Group__1__Impl"
    // InternalJoveNotes.g:2733:1: rule__Matching__Group__1__Impl : ( ( rule__Matching__HideFromViewAssignment_1 )? ) ;
    public final void rule__Matching__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2737:1: ( ( ( rule__Matching__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:2738:1: ( ( rule__Matching__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:2738:1: ( ( rule__Matching__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:2739:1: ( rule__Matching__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getMatchingAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:2740:1: ( rule__Matching__HideFromViewAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==60) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJoveNotes.g:2740:2: rule__Matching__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Matching__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchingAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__1__Impl"


    // $ANTLR start "rule__Matching__Group__2"
    // InternalJoveNotes.g:2750:1: rule__Matching__Group__2 : rule__Matching__Group__2__Impl rule__Matching__Group__3 ;
    public final void rule__Matching__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2754:1: ( rule__Matching__Group__2__Impl rule__Matching__Group__3 )
            // InternalJoveNotes.g:2755:2: rule__Matching__Group__2__Impl rule__Matching__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Matching__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matching__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__2"


    // $ANTLR start "rule__Matching__Group__2__Impl"
    // InternalJoveNotes.g:2762:1: rule__Matching__Group__2__Impl : ( ( rule__Matching__SkipReverseQuestionAssignment_2 )? ) ;
    public final void rule__Matching__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2766:1: ( ( ( rule__Matching__SkipReverseQuestionAssignment_2 )? ) )
            // InternalJoveNotes.g:2767:1: ( ( rule__Matching__SkipReverseQuestionAssignment_2 )? )
            {
            // InternalJoveNotes.g:2767:1: ( ( rule__Matching__SkipReverseQuestionAssignment_2 )? )
            // InternalJoveNotes.g:2768:1: ( rule__Matching__SkipReverseQuestionAssignment_2 )?
            {
             before(grammarAccess.getMatchingAccess().getSkipReverseQuestionAssignment_2()); 
            // InternalJoveNotes.g:2769:1: ( rule__Matching__SkipReverseQuestionAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==61) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJoveNotes.g:2769:2: rule__Matching__SkipReverseQuestionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Matching__SkipReverseQuestionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchingAccess().getSkipReverseQuestionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__2__Impl"


    // $ANTLR start "rule__Matching__Group__3"
    // InternalJoveNotes.g:2779:1: rule__Matching__Group__3 : rule__Matching__Group__3__Impl rule__Matching__Group__4 ;
    public final void rule__Matching__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2783:1: ( rule__Matching__Group__3__Impl rule__Matching__Group__4 )
            // InternalJoveNotes.g:2784:2: rule__Matching__Group__3__Impl rule__Matching__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Matching__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matching__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__3"


    // $ANTLR start "rule__Matching__Group__3__Impl"
    // InternalJoveNotes.g:2791:1: rule__Matching__Group__3__Impl : ( ( rule__Matching__QuestionAssignment_3 )? ) ;
    public final void rule__Matching__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2795:1: ( ( ( rule__Matching__QuestionAssignment_3 )? ) )
            // InternalJoveNotes.g:2796:1: ( ( rule__Matching__QuestionAssignment_3 )? )
            {
            // InternalJoveNotes.g:2796:1: ( ( rule__Matching__QuestionAssignment_3 )? )
            // InternalJoveNotes.g:2797:1: ( rule__Matching__QuestionAssignment_3 )?
            {
             before(grammarAccess.getMatchingAccess().getQuestionAssignment_3()); 
            // InternalJoveNotes.g:2798:1: ( rule__Matching__QuestionAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJoveNotes.g:2798:2: rule__Matching__QuestionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Matching__QuestionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchingAccess().getQuestionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__3__Impl"


    // $ANTLR start "rule__Matching__Group__4"
    // InternalJoveNotes.g:2808:1: rule__Matching__Group__4 : rule__Matching__Group__4__Impl rule__Matching__Group__5 ;
    public final void rule__Matching__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2812:1: ( rule__Matching__Group__4__Impl rule__Matching__Group__5 )
            // InternalJoveNotes.g:2813:2: rule__Matching__Group__4__Impl rule__Matching__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Matching__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matching__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__4"


    // $ANTLR start "rule__Matching__Group__4__Impl"
    // InternalJoveNotes.g:2820:1: rule__Matching__Group__4__Impl : ( '{' ) ;
    public final void rule__Matching__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2824:1: ( ( '{' ) )
            // InternalJoveNotes.g:2825:1: ( '{' )
            {
            // InternalJoveNotes.g:2825:1: ( '{' )
            // InternalJoveNotes.g:2826:1: '{'
            {
             before(grammarAccess.getMatchingAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMatchingAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__4__Impl"


    // $ANTLR start "rule__Matching__Group__5"
    // InternalJoveNotes.g:2839:1: rule__Matching__Group__5 : rule__Matching__Group__5__Impl rule__Matching__Group__6 ;
    public final void rule__Matching__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2843:1: ( rule__Matching__Group__5__Impl rule__Matching__Group__6 )
            // InternalJoveNotes.g:2844:2: rule__Matching__Group__5__Impl rule__Matching__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Matching__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matching__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__5"


    // $ANTLR start "rule__Matching__Group__5__Impl"
    // InternalJoveNotes.g:2851:1: rule__Matching__Group__5__Impl : ( ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* ) ) ;
    public final void rule__Matching__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2855:1: ( ( ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* ) ) )
            // InternalJoveNotes.g:2856:1: ( ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* ) )
            {
            // InternalJoveNotes.g:2856:1: ( ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* ) )
            // InternalJoveNotes.g:2857:1: ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* )
            {
            // InternalJoveNotes.g:2857:1: ( ( rule__Matching__PairsAssignment_5 ) )
            // InternalJoveNotes.g:2858:1: ( rule__Matching__PairsAssignment_5 )
            {
             before(grammarAccess.getMatchingAccess().getPairsAssignment_5()); 
            // InternalJoveNotes.g:2859:1: ( rule__Matching__PairsAssignment_5 )
            // InternalJoveNotes.g:2859:2: rule__Matching__PairsAssignment_5
            {
            pushFollow(FOLLOW_16);
            rule__Matching__PairsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMatchingAccess().getPairsAssignment_5()); 

            }

            // InternalJoveNotes.g:2862:1: ( ( rule__Matching__PairsAssignment_5 )* )
            // InternalJoveNotes.g:2863:1: ( rule__Matching__PairsAssignment_5 )*
            {
             before(grammarAccess.getMatchingAccess().getPairsAssignment_5()); 
            // InternalJoveNotes.g:2864:1: ( rule__Matching__PairsAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalJoveNotes.g:2864:2: rule__Matching__PairsAssignment_5
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Matching__PairsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getMatchingAccess().getPairsAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__5__Impl"


    // $ANTLR start "rule__Matching__Group__6"
    // InternalJoveNotes.g:2875:1: rule__Matching__Group__6 : rule__Matching__Group__6__Impl rule__Matching__Group__7 ;
    public final void rule__Matching__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2879:1: ( rule__Matching__Group__6__Impl rule__Matching__Group__7 )
            // InternalJoveNotes.g:2880:2: rule__Matching__Group__6__Impl rule__Matching__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Matching__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matching__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__6"


    // $ANTLR start "rule__Matching__Group__6__Impl"
    // InternalJoveNotes.g:2887:1: rule__Matching__Group__6__Impl : ( ( rule__Matching__McqConfigAssignment_6 )? ) ;
    public final void rule__Matching__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2891:1: ( ( ( rule__Matching__McqConfigAssignment_6 )? ) )
            // InternalJoveNotes.g:2892:1: ( ( rule__Matching__McqConfigAssignment_6 )? )
            {
            // InternalJoveNotes.g:2892:1: ( ( rule__Matching__McqConfigAssignment_6 )? )
            // InternalJoveNotes.g:2893:1: ( rule__Matching__McqConfigAssignment_6 )?
            {
             before(grammarAccess.getMatchingAccess().getMcqConfigAssignment_6()); 
            // InternalJoveNotes.g:2894:1: ( rule__Matching__McqConfigAssignment_6 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJoveNotes.g:2894:2: rule__Matching__McqConfigAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Matching__McqConfigAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchingAccess().getMcqConfigAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__6__Impl"


    // $ANTLR start "rule__Matching__Group__7"
    // InternalJoveNotes.g:2904:1: rule__Matching__Group__7 : rule__Matching__Group__7__Impl ;
    public final void rule__Matching__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2908:1: ( rule__Matching__Group__7__Impl )
            // InternalJoveNotes.g:2909:2: rule__Matching__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Matching__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__7"


    // $ANTLR start "rule__Matching__Group__7__Impl"
    // InternalJoveNotes.g:2915:1: rule__Matching__Group__7__Impl : ( '}' ) ;
    public final void rule__Matching__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2919:1: ( ( '}' ) )
            // InternalJoveNotes.g:2920:1: ( '}' )
            {
            // InternalJoveNotes.g:2920:1: ( '}' )
            // InternalJoveNotes.g:2921:1: '}'
            {
             before(grammarAccess.getMatchingAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMatchingAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__7__Impl"


    // $ANTLR start "rule__MatchPair__Group__0"
    // InternalJoveNotes.g:2950:1: rule__MatchPair__Group__0 : rule__MatchPair__Group__0__Impl rule__MatchPair__Group__1 ;
    public final void rule__MatchPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2954:1: ( rule__MatchPair__Group__0__Impl rule__MatchPair__Group__1 )
            // InternalJoveNotes.g:2955:2: rule__MatchPair__Group__0__Impl rule__MatchPair__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MatchPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchPair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPair__Group__0"


    // $ANTLR start "rule__MatchPair__Group__0__Impl"
    // InternalJoveNotes.g:2962:1: rule__MatchPair__Group__0__Impl : ( ( rule__MatchPair__MatchQuestionAssignment_0 ) ) ;
    public final void rule__MatchPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2966:1: ( ( ( rule__MatchPair__MatchQuestionAssignment_0 ) ) )
            // InternalJoveNotes.g:2967:1: ( ( rule__MatchPair__MatchQuestionAssignment_0 ) )
            {
            // InternalJoveNotes.g:2967:1: ( ( rule__MatchPair__MatchQuestionAssignment_0 ) )
            // InternalJoveNotes.g:2968:1: ( rule__MatchPair__MatchQuestionAssignment_0 )
            {
             before(grammarAccess.getMatchPairAccess().getMatchQuestionAssignment_0()); 
            // InternalJoveNotes.g:2969:1: ( rule__MatchPair__MatchQuestionAssignment_0 )
            // InternalJoveNotes.g:2969:2: rule__MatchPair__MatchQuestionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MatchPair__MatchQuestionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMatchPairAccess().getMatchQuestionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPair__Group__0__Impl"


    // $ANTLR start "rule__MatchPair__Group__1"
    // InternalJoveNotes.g:2979:1: rule__MatchPair__Group__1 : rule__MatchPair__Group__1__Impl rule__MatchPair__Group__2 ;
    public final void rule__MatchPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2983:1: ( rule__MatchPair__Group__1__Impl rule__MatchPair__Group__2 )
            // InternalJoveNotes.g:2984:2: rule__MatchPair__Group__1__Impl rule__MatchPair__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__MatchPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchPair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPair__Group__1"


    // $ANTLR start "rule__MatchPair__Group__1__Impl"
    // InternalJoveNotes.g:2991:1: rule__MatchPair__Group__1__Impl : ( '=' ) ;
    public final void rule__MatchPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2995:1: ( ( '=' ) )
            // InternalJoveNotes.g:2996:1: ( '=' )
            {
            // InternalJoveNotes.g:2996:1: ( '=' )
            // InternalJoveNotes.g:2997:1: '='
            {
             before(grammarAccess.getMatchPairAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMatchPairAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPair__Group__1__Impl"


    // $ANTLR start "rule__MatchPair__Group__2"
    // InternalJoveNotes.g:3010:1: rule__MatchPair__Group__2 : rule__MatchPair__Group__2__Impl ;
    public final void rule__MatchPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3014:1: ( rule__MatchPair__Group__2__Impl )
            // InternalJoveNotes.g:3015:2: rule__MatchPair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchPair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPair__Group__2"


    // $ANTLR start "rule__MatchPair__Group__2__Impl"
    // InternalJoveNotes.g:3021:1: rule__MatchPair__Group__2__Impl : ( ( rule__MatchPair__MatchAnswerAssignment_2 ) ) ;
    public final void rule__MatchPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3025:1: ( ( ( rule__MatchPair__MatchAnswerAssignment_2 ) ) )
            // InternalJoveNotes.g:3026:1: ( ( rule__MatchPair__MatchAnswerAssignment_2 ) )
            {
            // InternalJoveNotes.g:3026:1: ( ( rule__MatchPair__MatchAnswerAssignment_2 ) )
            // InternalJoveNotes.g:3027:1: ( rule__MatchPair__MatchAnswerAssignment_2 )
            {
             before(grammarAccess.getMatchPairAccess().getMatchAnswerAssignment_2()); 
            // InternalJoveNotes.g:3028:1: ( rule__MatchPair__MatchAnswerAssignment_2 )
            // InternalJoveNotes.g:3028:2: rule__MatchPair__MatchAnswerAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MatchPair__MatchAnswerAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMatchPairAccess().getMatchAnswerAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPair__Group__2__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group__0"
    // InternalJoveNotes.g:3044:1: rule__MatchMCQConfig__Group__0 : rule__MatchMCQConfig__Group__0__Impl rule__MatchMCQConfig__Group__1 ;
    public final void rule__MatchMCQConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3048:1: ( rule__MatchMCQConfig__Group__0__Impl rule__MatchMCQConfig__Group__1 )
            // InternalJoveNotes.g:3049:2: rule__MatchMCQConfig__Group__0__Impl rule__MatchMCQConfig__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__MatchMCQConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__0"


    // $ANTLR start "rule__MatchMCQConfig__Group__0__Impl"
    // InternalJoveNotes.g:3056:1: rule__MatchMCQConfig__Group__0__Impl : ( '@mcq_config' ) ;
    public final void rule__MatchMCQConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3060:1: ( ( '@mcq_config' ) )
            // InternalJoveNotes.g:3061:1: ( '@mcq_config' )
            {
            // InternalJoveNotes.g:3061:1: ( '@mcq_config' )
            // InternalJoveNotes.g:3062:1: '@mcq_config'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getMcq_configKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMatchMCQConfigAccess().getMcq_configKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__0__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group__1"
    // InternalJoveNotes.g:3075:1: rule__MatchMCQConfig__Group__1 : rule__MatchMCQConfig__Group__1__Impl rule__MatchMCQConfig__Group__2 ;
    public final void rule__MatchMCQConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3079:1: ( rule__MatchMCQConfig__Group__1__Impl rule__MatchMCQConfig__Group__2 )
            // InternalJoveNotes.g:3080:2: rule__MatchMCQConfig__Group__1__Impl rule__MatchMCQConfig__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__MatchMCQConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__1"


    // $ANTLR start "rule__MatchMCQConfig__Group__1__Impl"
    // InternalJoveNotes.g:3087:1: rule__MatchMCQConfig__Group__1__Impl : ( '{' ) ;
    public final void rule__MatchMCQConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3091:1: ( ( '{' ) )
            // InternalJoveNotes.g:3092:1: ( '{' )
            {
            // InternalJoveNotes.g:3092:1: ( '{' )
            // InternalJoveNotes.g:3093:1: '{'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMatchMCQConfigAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__1__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group__2"
    // InternalJoveNotes.g:3106:1: rule__MatchMCQConfig__Group__2 : rule__MatchMCQConfig__Group__2__Impl rule__MatchMCQConfig__Group__3 ;
    public final void rule__MatchMCQConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3110:1: ( rule__MatchMCQConfig__Group__2__Impl rule__MatchMCQConfig__Group__3 )
            // InternalJoveNotes.g:3111:2: rule__MatchMCQConfig__Group__2__Impl rule__MatchMCQConfig__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__MatchMCQConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__2"


    // $ANTLR start "rule__MatchMCQConfig__Group__2__Impl"
    // InternalJoveNotes.g:3118:1: rule__MatchMCQConfig__Group__2__Impl : ( '@forwardCaption' ) ;
    public final void rule__MatchMCQConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3122:1: ( ( '@forwardCaption' ) )
            // InternalJoveNotes.g:3123:1: ( '@forwardCaption' )
            {
            // InternalJoveNotes.g:3123:1: ( '@forwardCaption' )
            // InternalJoveNotes.g:3124:1: '@forwardCaption'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getForwardCaptionKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMatchMCQConfigAccess().getForwardCaptionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__2__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group__3"
    // InternalJoveNotes.g:3137:1: rule__MatchMCQConfig__Group__3 : rule__MatchMCQConfig__Group__3__Impl rule__MatchMCQConfig__Group__4 ;
    public final void rule__MatchMCQConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3141:1: ( rule__MatchMCQConfig__Group__3__Impl rule__MatchMCQConfig__Group__4 )
            // InternalJoveNotes.g:3142:2: rule__MatchMCQConfig__Group__3__Impl rule__MatchMCQConfig__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__MatchMCQConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__3"


    // $ANTLR start "rule__MatchMCQConfig__Group__3__Impl"
    // InternalJoveNotes.g:3149:1: rule__MatchMCQConfig__Group__3__Impl : ( ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 ) ) ;
    public final void rule__MatchMCQConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3153:1: ( ( ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 ) ) )
            // InternalJoveNotes.g:3154:1: ( ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 ) )
            {
            // InternalJoveNotes.g:3154:1: ( ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 ) )
            // InternalJoveNotes.g:3155:1: ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 )
            {
             before(grammarAccess.getMatchMCQConfigAccess().getForwardCaptionAssignment_3()); 
            // InternalJoveNotes.g:3156:1: ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 )
            // InternalJoveNotes.g:3156:2: rule__MatchMCQConfig__ForwardCaptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__ForwardCaptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMatchMCQConfigAccess().getForwardCaptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__3__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group__4"
    // InternalJoveNotes.g:3166:1: rule__MatchMCQConfig__Group__4 : rule__MatchMCQConfig__Group__4__Impl rule__MatchMCQConfig__Group__5 ;
    public final void rule__MatchMCQConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3170:1: ( rule__MatchMCQConfig__Group__4__Impl rule__MatchMCQConfig__Group__5 )
            // InternalJoveNotes.g:3171:2: rule__MatchMCQConfig__Group__4__Impl rule__MatchMCQConfig__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__MatchMCQConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__4"


    // $ANTLR start "rule__MatchMCQConfig__Group__4__Impl"
    // InternalJoveNotes.g:3178:1: rule__MatchMCQConfig__Group__4__Impl : ( ( rule__MatchMCQConfig__Group_4__0 )? ) ;
    public final void rule__MatchMCQConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3182:1: ( ( ( rule__MatchMCQConfig__Group_4__0 )? ) )
            // InternalJoveNotes.g:3183:1: ( ( rule__MatchMCQConfig__Group_4__0 )? )
            {
            // InternalJoveNotes.g:3183:1: ( ( rule__MatchMCQConfig__Group_4__0 )? )
            // InternalJoveNotes.g:3184:1: ( rule__MatchMCQConfig__Group_4__0 )?
            {
             before(grammarAccess.getMatchMCQConfigAccess().getGroup_4()); 
            // InternalJoveNotes.g:3185:1: ( rule__MatchMCQConfig__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJoveNotes.g:3185:2: rule__MatchMCQConfig__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MatchMCQConfig__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchMCQConfigAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__4__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group__5"
    // InternalJoveNotes.g:3195:1: rule__MatchMCQConfig__Group__5 : rule__MatchMCQConfig__Group__5__Impl rule__MatchMCQConfig__Group__6 ;
    public final void rule__MatchMCQConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3199:1: ( rule__MatchMCQConfig__Group__5__Impl rule__MatchMCQConfig__Group__6 )
            // InternalJoveNotes.g:3200:2: rule__MatchMCQConfig__Group__5__Impl rule__MatchMCQConfig__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__MatchMCQConfig__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__5"


    // $ANTLR start "rule__MatchMCQConfig__Group__5__Impl"
    // InternalJoveNotes.g:3207:1: rule__MatchMCQConfig__Group__5__Impl : ( ( rule__MatchMCQConfig__Group_5__0 )? ) ;
    public final void rule__MatchMCQConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3211:1: ( ( ( rule__MatchMCQConfig__Group_5__0 )? ) )
            // InternalJoveNotes.g:3212:1: ( ( rule__MatchMCQConfig__Group_5__0 )? )
            {
            // InternalJoveNotes.g:3212:1: ( ( rule__MatchMCQConfig__Group_5__0 )? )
            // InternalJoveNotes.g:3213:1: ( rule__MatchMCQConfig__Group_5__0 )?
            {
             before(grammarAccess.getMatchMCQConfigAccess().getGroup_5()); 
            // InternalJoveNotes.g:3214:1: ( rule__MatchMCQConfig__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJoveNotes.g:3214:2: rule__MatchMCQConfig__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MatchMCQConfig__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchMCQConfigAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__5__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group__6"
    // InternalJoveNotes.g:3224:1: rule__MatchMCQConfig__Group__6 : rule__MatchMCQConfig__Group__6__Impl rule__MatchMCQConfig__Group__7 ;
    public final void rule__MatchMCQConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3228:1: ( rule__MatchMCQConfig__Group__6__Impl rule__MatchMCQConfig__Group__7 )
            // InternalJoveNotes.g:3229:2: rule__MatchMCQConfig__Group__6__Impl rule__MatchMCQConfig__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__MatchMCQConfig__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__6"


    // $ANTLR start "rule__MatchMCQConfig__Group__6__Impl"
    // InternalJoveNotes.g:3236:1: rule__MatchMCQConfig__Group__6__Impl : ( ( rule__MatchMCQConfig__Group_6__0 )? ) ;
    public final void rule__MatchMCQConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3240:1: ( ( ( rule__MatchMCQConfig__Group_6__0 )? ) )
            // InternalJoveNotes.g:3241:1: ( ( rule__MatchMCQConfig__Group_6__0 )? )
            {
            // InternalJoveNotes.g:3241:1: ( ( rule__MatchMCQConfig__Group_6__0 )? )
            // InternalJoveNotes.g:3242:1: ( rule__MatchMCQConfig__Group_6__0 )?
            {
             before(grammarAccess.getMatchMCQConfigAccess().getGroup_6()); 
            // InternalJoveNotes.g:3243:1: ( rule__MatchMCQConfig__Group_6__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalJoveNotes.g:3243:2: rule__MatchMCQConfig__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MatchMCQConfig__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchMCQConfigAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__6__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group__7"
    // InternalJoveNotes.g:3253:1: rule__MatchMCQConfig__Group__7 : rule__MatchMCQConfig__Group__7__Impl ;
    public final void rule__MatchMCQConfig__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3257:1: ( rule__MatchMCQConfig__Group__7__Impl )
            // InternalJoveNotes.g:3258:2: rule__MatchMCQConfig__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__7"


    // $ANTLR start "rule__MatchMCQConfig__Group__7__Impl"
    // InternalJoveNotes.g:3264:1: rule__MatchMCQConfig__Group__7__Impl : ( '}' ) ;
    public final void rule__MatchMCQConfig__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3268:1: ( ( '}' ) )
            // InternalJoveNotes.g:3269:1: ( '}' )
            {
            // InternalJoveNotes.g:3269:1: ( '}' )
            // InternalJoveNotes.g:3270:1: '}'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMatchMCQConfigAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__7__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group_4__0"
    // InternalJoveNotes.g:3299:1: rule__MatchMCQConfig__Group_4__0 : rule__MatchMCQConfig__Group_4__0__Impl rule__MatchMCQConfig__Group_4__1 ;
    public final void rule__MatchMCQConfig__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3303:1: ( rule__MatchMCQConfig__Group_4__0__Impl rule__MatchMCQConfig__Group_4__1 )
            // InternalJoveNotes.g:3304:2: rule__MatchMCQConfig__Group_4__0__Impl rule__MatchMCQConfig__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__MatchMCQConfig__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_4__0"


    // $ANTLR start "rule__MatchMCQConfig__Group_4__0__Impl"
    // InternalJoveNotes.g:3311:1: rule__MatchMCQConfig__Group_4__0__Impl : ( '@reverseCaption' ) ;
    public final void rule__MatchMCQConfig__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3315:1: ( ( '@reverseCaption' ) )
            // InternalJoveNotes.g:3316:1: ( '@reverseCaption' )
            {
            // InternalJoveNotes.g:3316:1: ( '@reverseCaption' )
            // InternalJoveNotes.g:3317:1: '@reverseCaption'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getReverseCaptionKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMatchMCQConfigAccess().getReverseCaptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_4__0__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group_4__1"
    // InternalJoveNotes.g:3330:1: rule__MatchMCQConfig__Group_4__1 : rule__MatchMCQConfig__Group_4__1__Impl ;
    public final void rule__MatchMCQConfig__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3334:1: ( rule__MatchMCQConfig__Group_4__1__Impl )
            // InternalJoveNotes.g:3335:2: rule__MatchMCQConfig__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_4__1"


    // $ANTLR start "rule__MatchMCQConfig__Group_4__1__Impl"
    // InternalJoveNotes.g:3341:1: rule__MatchMCQConfig__Group_4__1__Impl : ( ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 ) ) ;
    public final void rule__MatchMCQConfig__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3345:1: ( ( ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 ) ) )
            // InternalJoveNotes.g:3346:1: ( ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 ) )
            {
            // InternalJoveNotes.g:3346:1: ( ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 ) )
            // InternalJoveNotes.g:3347:1: ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 )
            {
             before(grammarAccess.getMatchMCQConfigAccess().getReverseCaptionAssignment_4_1()); 
            // InternalJoveNotes.g:3348:1: ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 )
            // InternalJoveNotes.g:3348:2: rule__MatchMCQConfig__ReverseCaptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__ReverseCaptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchMCQConfigAccess().getReverseCaptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_4__1__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group_5__0"
    // InternalJoveNotes.g:3362:1: rule__MatchMCQConfig__Group_5__0 : rule__MatchMCQConfig__Group_5__0__Impl rule__MatchMCQConfig__Group_5__1 ;
    public final void rule__MatchMCQConfig__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3366:1: ( rule__MatchMCQConfig__Group_5__0__Impl rule__MatchMCQConfig__Group_5__1 )
            // InternalJoveNotes.g:3367:2: rule__MatchMCQConfig__Group_5__0__Impl rule__MatchMCQConfig__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__MatchMCQConfig__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_5__0"


    // $ANTLR start "rule__MatchMCQConfig__Group_5__0__Impl"
    // InternalJoveNotes.g:3374:1: rule__MatchMCQConfig__Group_5__0__Impl : ( '@numOptionsToShow' ) ;
    public final void rule__MatchMCQConfig__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3378:1: ( ( '@numOptionsToShow' ) )
            // InternalJoveNotes.g:3379:1: ( '@numOptionsToShow' )
            {
            // InternalJoveNotes.g:3379:1: ( '@numOptionsToShow' )
            // InternalJoveNotes.g:3380:1: '@numOptionsToShow'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_5__0__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group_5__1"
    // InternalJoveNotes.g:3393:1: rule__MatchMCQConfig__Group_5__1 : rule__MatchMCQConfig__Group_5__1__Impl ;
    public final void rule__MatchMCQConfig__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3397:1: ( rule__MatchMCQConfig__Group_5__1__Impl )
            // InternalJoveNotes.g:3398:2: rule__MatchMCQConfig__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_5__1"


    // $ANTLR start "rule__MatchMCQConfig__Group_5__1__Impl"
    // InternalJoveNotes.g:3404:1: rule__MatchMCQConfig__Group_5__1__Impl : ( ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 ) ) ;
    public final void rule__MatchMCQConfig__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3408:1: ( ( ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 ) ) )
            // InternalJoveNotes.g:3409:1: ( ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 ) )
            {
            // InternalJoveNotes.g:3409:1: ( ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 ) )
            // InternalJoveNotes.g:3410:1: ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 )
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowAssignment_5_1()); 
            // InternalJoveNotes.g:3411:1: ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 )
            // InternalJoveNotes.g:3411:2: rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_5__1__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group_6__0"
    // InternalJoveNotes.g:3425:1: rule__MatchMCQConfig__Group_6__0 : rule__MatchMCQConfig__Group_6__0__Impl rule__MatchMCQConfig__Group_6__1 ;
    public final void rule__MatchMCQConfig__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3429:1: ( rule__MatchMCQConfig__Group_6__0__Impl rule__MatchMCQConfig__Group_6__1 )
            // InternalJoveNotes.g:3430:2: rule__MatchMCQConfig__Group_6__0__Impl rule__MatchMCQConfig__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__MatchMCQConfig__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_6__0"


    // $ANTLR start "rule__MatchMCQConfig__Group_6__0__Impl"
    // InternalJoveNotes.g:3437:1: rule__MatchMCQConfig__Group_6__0__Impl : ( '@numOptionsPerRow' ) ;
    public final void rule__MatchMCQConfig__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3441:1: ( ( '@numOptionsPerRow' ) )
            // InternalJoveNotes.g:3442:1: ( '@numOptionsPerRow' )
            {
            // InternalJoveNotes.g:3442:1: ( '@numOptionsPerRow' )
            // InternalJoveNotes.g:3443:1: '@numOptionsPerRow'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_6__0__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group_6__1"
    // InternalJoveNotes.g:3456:1: rule__MatchMCQConfig__Group_6__1 : rule__MatchMCQConfig__Group_6__1__Impl ;
    public final void rule__MatchMCQConfig__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3460:1: ( rule__MatchMCQConfig__Group_6__1__Impl )
            // InternalJoveNotes.g:3461:2: rule__MatchMCQConfig__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_6__1"


    // $ANTLR start "rule__MatchMCQConfig__Group_6__1__Impl"
    // InternalJoveNotes.g:3467:1: rule__MatchMCQConfig__Group_6__1__Impl : ( ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 ) ) ;
    public final void rule__MatchMCQConfig__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3471:1: ( ( ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 ) ) )
            // InternalJoveNotes.g:3472:1: ( ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 ) )
            {
            // InternalJoveNotes.g:3472:1: ( ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 ) )
            // InternalJoveNotes.g:3473:1: ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 )
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowAssignment_6_1()); 
            // InternalJoveNotes.g:3474:1: ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 )
            // InternalJoveNotes.g:3474:2: rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_6__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // InternalJoveNotes.g:3488:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3492:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalJoveNotes.g:3493:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // InternalJoveNotes.g:3500:1: rule__Event__Group__0__Impl : ( '@event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3504:1: ( ( '@event' ) )
            // InternalJoveNotes.g:3505:1: ( '@event' )
            {
            // InternalJoveNotes.g:3505:1: ( '@event' )
            // InternalJoveNotes.g:3506:1: '@event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getEventKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // InternalJoveNotes.g:3519:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3523:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalJoveNotes.g:3524:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // InternalJoveNotes.g:3531:1: rule__Event__Group__1__Impl : ( ( rule__Event__HideFromViewAssignment_1 )? ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3535:1: ( ( ( rule__Event__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:3536:1: ( ( rule__Event__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:3536:1: ( ( rule__Event__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:3537:1: ( rule__Event__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getEventAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:3538:1: ( rule__Event__HideFromViewAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==60) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalJoveNotes.g:3538:2: rule__Event__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // InternalJoveNotes.g:3548:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3552:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalJoveNotes.g:3553:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // InternalJoveNotes.g:3560:1: rule__Event__Group__2__Impl : ( ( rule__Event__EventAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3564:1: ( ( ( rule__Event__EventAssignment_2 ) ) )
            // InternalJoveNotes.g:3565:1: ( ( rule__Event__EventAssignment_2 ) )
            {
            // InternalJoveNotes.g:3565:1: ( ( rule__Event__EventAssignment_2 ) )
            // InternalJoveNotes.g:3566:1: ( rule__Event__EventAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getEventAssignment_2()); 
            // InternalJoveNotes.g:3567:1: ( rule__Event__EventAssignment_2 )
            // InternalJoveNotes.g:3567:2: rule__Event__EventAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Event__EventAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // InternalJoveNotes.g:3577:1: rule__Event__Group__3 : rule__Event__Group__3__Impl ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3581:1: ( rule__Event__Group__3__Impl )
            // InternalJoveNotes.g:3582:2: rule__Event__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // InternalJoveNotes.g:3588:1: rule__Event__Group__3__Impl : ( ( rule__Event__TimeAssignment_3 ) ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3592:1: ( ( ( rule__Event__TimeAssignment_3 ) ) )
            // InternalJoveNotes.g:3593:1: ( ( rule__Event__TimeAssignment_3 ) )
            {
            // InternalJoveNotes.g:3593:1: ( ( rule__Event__TimeAssignment_3 ) )
            // InternalJoveNotes.g:3594:1: ( rule__Event__TimeAssignment_3 )
            {
             before(grammarAccess.getEventAccess().getTimeAssignment_3()); 
            // InternalJoveNotes.g:3595:1: ( rule__Event__TimeAssignment_3 )
            // InternalJoveNotes.g:3595:2: rule__Event__TimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Event__TimeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getTimeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__TrueFalse__Group__0"
    // InternalJoveNotes.g:3613:1: rule__TrueFalse__Group__0 : rule__TrueFalse__Group__0__Impl rule__TrueFalse__Group__1 ;
    public final void rule__TrueFalse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3617:1: ( rule__TrueFalse__Group__0__Impl rule__TrueFalse__Group__1 )
            // InternalJoveNotes.g:3618:2: rule__TrueFalse__Group__0__Impl rule__TrueFalse__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TrueFalse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueFalse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__0"


    // $ANTLR start "rule__TrueFalse__Group__0__Impl"
    // InternalJoveNotes.g:3625:1: rule__TrueFalse__Group__0__Impl : ( '@true_false' ) ;
    public final void rule__TrueFalse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3629:1: ( ( '@true_false' ) )
            // InternalJoveNotes.g:3630:1: ( '@true_false' )
            {
            // InternalJoveNotes.g:3630:1: ( '@true_false' )
            // InternalJoveNotes.g:3631:1: '@true_false'
            {
             before(grammarAccess.getTrueFalseAccess().getTrue_falseKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTrueFalseAccess().getTrue_falseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__0__Impl"


    // $ANTLR start "rule__TrueFalse__Group__1"
    // InternalJoveNotes.g:3644:1: rule__TrueFalse__Group__1 : rule__TrueFalse__Group__1__Impl rule__TrueFalse__Group__2 ;
    public final void rule__TrueFalse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3648:1: ( rule__TrueFalse__Group__1__Impl rule__TrueFalse__Group__2 )
            // InternalJoveNotes.g:3649:2: rule__TrueFalse__Group__1__Impl rule__TrueFalse__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__TrueFalse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueFalse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__1"


    // $ANTLR start "rule__TrueFalse__Group__1__Impl"
    // InternalJoveNotes.g:3656:1: rule__TrueFalse__Group__1__Impl : ( ( rule__TrueFalse__HideFromViewAssignment_1 )? ) ;
    public final void rule__TrueFalse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3660:1: ( ( ( rule__TrueFalse__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:3661:1: ( ( rule__TrueFalse__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:3661:1: ( ( rule__TrueFalse__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:3662:1: ( rule__TrueFalse__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getTrueFalseAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:3663:1: ( rule__TrueFalse__HideFromViewAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==60) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalJoveNotes.g:3663:2: rule__TrueFalse__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TrueFalse__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrueFalseAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__1__Impl"


    // $ANTLR start "rule__TrueFalse__Group__2"
    // InternalJoveNotes.g:3673:1: rule__TrueFalse__Group__2 : rule__TrueFalse__Group__2__Impl rule__TrueFalse__Group__3 ;
    public final void rule__TrueFalse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3677:1: ( rule__TrueFalse__Group__2__Impl rule__TrueFalse__Group__3 )
            // InternalJoveNotes.g:3678:2: rule__TrueFalse__Group__2__Impl rule__TrueFalse__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__TrueFalse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueFalse__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__2"


    // $ANTLR start "rule__TrueFalse__Group__2__Impl"
    // InternalJoveNotes.g:3685:1: rule__TrueFalse__Group__2__Impl : ( ( rule__TrueFalse__StatementAssignment_2 ) ) ;
    public final void rule__TrueFalse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3689:1: ( ( ( rule__TrueFalse__StatementAssignment_2 ) ) )
            // InternalJoveNotes.g:3690:1: ( ( rule__TrueFalse__StatementAssignment_2 ) )
            {
            // InternalJoveNotes.g:3690:1: ( ( rule__TrueFalse__StatementAssignment_2 ) )
            // InternalJoveNotes.g:3691:1: ( rule__TrueFalse__StatementAssignment_2 )
            {
             before(grammarAccess.getTrueFalseAccess().getStatementAssignment_2()); 
            // InternalJoveNotes.g:3692:1: ( rule__TrueFalse__StatementAssignment_2 )
            // InternalJoveNotes.g:3692:2: rule__TrueFalse__StatementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TrueFalse__StatementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrueFalseAccess().getStatementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__2__Impl"


    // $ANTLR start "rule__TrueFalse__Group__3"
    // InternalJoveNotes.g:3702:1: rule__TrueFalse__Group__3 : rule__TrueFalse__Group__3__Impl rule__TrueFalse__Group__4 ;
    public final void rule__TrueFalse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3706:1: ( rule__TrueFalse__Group__3__Impl rule__TrueFalse__Group__4 )
            // InternalJoveNotes.g:3707:2: rule__TrueFalse__Group__3__Impl rule__TrueFalse__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__TrueFalse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueFalse__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__3"


    // $ANTLR start "rule__TrueFalse__Group__3__Impl"
    // InternalJoveNotes.g:3714:1: rule__TrueFalse__Group__3__Impl : ( ( rule__TrueFalse__TruthValueAssignment_3 ) ) ;
    public final void rule__TrueFalse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3718:1: ( ( ( rule__TrueFalse__TruthValueAssignment_3 ) ) )
            // InternalJoveNotes.g:3719:1: ( ( rule__TrueFalse__TruthValueAssignment_3 ) )
            {
            // InternalJoveNotes.g:3719:1: ( ( rule__TrueFalse__TruthValueAssignment_3 ) )
            // InternalJoveNotes.g:3720:1: ( rule__TrueFalse__TruthValueAssignment_3 )
            {
             before(grammarAccess.getTrueFalseAccess().getTruthValueAssignment_3()); 
            // InternalJoveNotes.g:3721:1: ( rule__TrueFalse__TruthValueAssignment_3 )
            // InternalJoveNotes.g:3721:2: rule__TrueFalse__TruthValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TrueFalse__TruthValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTrueFalseAccess().getTruthValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__3__Impl"


    // $ANTLR start "rule__TrueFalse__Group__4"
    // InternalJoveNotes.g:3731:1: rule__TrueFalse__Group__4 : rule__TrueFalse__Group__4__Impl ;
    public final void rule__TrueFalse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3735:1: ( rule__TrueFalse__Group__4__Impl )
            // InternalJoveNotes.g:3736:2: rule__TrueFalse__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrueFalse__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__4"


    // $ANTLR start "rule__TrueFalse__Group__4__Impl"
    // InternalJoveNotes.g:3742:1: rule__TrueFalse__Group__4__Impl : ( ( rule__TrueFalse__JustificationAssignment_4 )? ) ;
    public final void rule__TrueFalse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3746:1: ( ( ( rule__TrueFalse__JustificationAssignment_4 )? ) )
            // InternalJoveNotes.g:3747:1: ( ( rule__TrueFalse__JustificationAssignment_4 )? )
            {
            // InternalJoveNotes.g:3747:1: ( ( rule__TrueFalse__JustificationAssignment_4 )? )
            // InternalJoveNotes.g:3748:1: ( rule__TrueFalse__JustificationAssignment_4 )?
            {
             before(grammarAccess.getTrueFalseAccess().getJustificationAssignment_4()); 
            // InternalJoveNotes.g:3749:1: ( rule__TrueFalse__JustificationAssignment_4 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalJoveNotes.g:3749:2: rule__TrueFalse__JustificationAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__TrueFalse__JustificationAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrueFalseAccess().getJustificationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__4__Impl"


    // $ANTLR start "rule__ChemEquation__Group__0"
    // InternalJoveNotes.g:3769:1: rule__ChemEquation__Group__0 : rule__ChemEquation__Group__0__Impl rule__ChemEquation__Group__1 ;
    public final void rule__ChemEquation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3773:1: ( rule__ChemEquation__Group__0__Impl rule__ChemEquation__Group__1 )
            // InternalJoveNotes.g:3774:2: rule__ChemEquation__Group__0__Impl rule__ChemEquation__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ChemEquation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChemEquation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__0"


    // $ANTLR start "rule__ChemEquation__Group__0__Impl"
    // InternalJoveNotes.g:3781:1: rule__ChemEquation__Group__0__Impl : ( '@chem_equation' ) ;
    public final void rule__ChemEquation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3785:1: ( ( '@chem_equation' ) )
            // InternalJoveNotes.g:3786:1: ( '@chem_equation' )
            {
            // InternalJoveNotes.g:3786:1: ( '@chem_equation' )
            // InternalJoveNotes.g:3787:1: '@chem_equation'
            {
             before(grammarAccess.getChemEquationAccess().getChem_equationKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getChemEquationAccess().getChem_equationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__0__Impl"


    // $ANTLR start "rule__ChemEquation__Group__1"
    // InternalJoveNotes.g:3800:1: rule__ChemEquation__Group__1 : rule__ChemEquation__Group__1__Impl rule__ChemEquation__Group__2 ;
    public final void rule__ChemEquation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3804:1: ( rule__ChemEquation__Group__1__Impl rule__ChemEquation__Group__2 )
            // InternalJoveNotes.g:3805:2: rule__ChemEquation__Group__1__Impl rule__ChemEquation__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ChemEquation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChemEquation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__1"


    // $ANTLR start "rule__ChemEquation__Group__1__Impl"
    // InternalJoveNotes.g:3812:1: rule__ChemEquation__Group__1__Impl : ( ( rule__ChemEquation__HideFromViewAssignment_1 )? ) ;
    public final void rule__ChemEquation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3816:1: ( ( ( rule__ChemEquation__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:3817:1: ( ( rule__ChemEquation__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:3817:1: ( ( rule__ChemEquation__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:3818:1: ( rule__ChemEquation__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getChemEquationAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:3819:1: ( rule__ChemEquation__HideFromViewAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==60) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalJoveNotes.g:3819:2: rule__ChemEquation__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChemEquation__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChemEquationAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__1__Impl"


    // $ANTLR start "rule__ChemEquation__Group__2"
    // InternalJoveNotes.g:3829:1: rule__ChemEquation__Group__2 : rule__ChemEquation__Group__2__Impl rule__ChemEquation__Group__3 ;
    public final void rule__ChemEquation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3833:1: ( rule__ChemEquation__Group__2__Impl rule__ChemEquation__Group__3 )
            // InternalJoveNotes.g:3834:2: rule__ChemEquation__Group__2__Impl rule__ChemEquation__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ChemEquation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChemEquation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__2"


    // $ANTLR start "rule__ChemEquation__Group__2__Impl"
    // InternalJoveNotes.g:3841:1: rule__ChemEquation__Group__2__Impl : ( ( rule__ChemEquation__DescriptionAssignment_2 )? ) ;
    public final void rule__ChemEquation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3845:1: ( ( ( rule__ChemEquation__DescriptionAssignment_2 )? ) )
            // InternalJoveNotes.g:3846:1: ( ( rule__ChemEquation__DescriptionAssignment_2 )? )
            {
            // InternalJoveNotes.g:3846:1: ( ( rule__ChemEquation__DescriptionAssignment_2 )? )
            // InternalJoveNotes.g:3847:1: ( rule__ChemEquation__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getChemEquationAccess().getDescriptionAssignment_2()); 
            // InternalJoveNotes.g:3848:1: ( rule__ChemEquation__DescriptionAssignment_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalJoveNotes.g:3848:2: rule__ChemEquation__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChemEquation__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChemEquationAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__2__Impl"


    // $ANTLR start "rule__ChemEquation__Group__3"
    // InternalJoveNotes.g:3858:1: rule__ChemEquation__Group__3 : rule__ChemEquation__Group__3__Impl rule__ChemEquation__Group__4 ;
    public final void rule__ChemEquation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3862:1: ( rule__ChemEquation__Group__3__Impl rule__ChemEquation__Group__4 )
            // InternalJoveNotes.g:3863:2: rule__ChemEquation__Group__3__Impl rule__ChemEquation__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ChemEquation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChemEquation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__3"


    // $ANTLR start "rule__ChemEquation__Group__3__Impl"
    // InternalJoveNotes.g:3870:1: rule__ChemEquation__Group__3__Impl : ( '{' ) ;
    public final void rule__ChemEquation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3874:1: ( ( '{' ) )
            // InternalJoveNotes.g:3875:1: ( '{' )
            {
            // InternalJoveNotes.g:3875:1: ( '{' )
            // InternalJoveNotes.g:3876:1: '{'
            {
             before(grammarAccess.getChemEquationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getChemEquationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__3__Impl"


    // $ANTLR start "rule__ChemEquation__Group__4"
    // InternalJoveNotes.g:3889:1: rule__ChemEquation__Group__4 : rule__ChemEquation__Group__4__Impl rule__ChemEquation__Group__5 ;
    public final void rule__ChemEquation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3893:1: ( rule__ChemEquation__Group__4__Impl rule__ChemEquation__Group__5 )
            // InternalJoveNotes.g:3894:2: rule__ChemEquation__Group__4__Impl rule__ChemEquation__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__ChemEquation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChemEquation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__4"


    // $ANTLR start "rule__ChemEquation__Group__4__Impl"
    // InternalJoveNotes.g:3901:1: rule__ChemEquation__Group__4__Impl : ( ( rule__ChemEquation__ReactantsAssignment_4 ) ) ;
    public final void rule__ChemEquation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3905:1: ( ( ( rule__ChemEquation__ReactantsAssignment_4 ) ) )
            // InternalJoveNotes.g:3906:1: ( ( rule__ChemEquation__ReactantsAssignment_4 ) )
            {
            // InternalJoveNotes.g:3906:1: ( ( rule__ChemEquation__ReactantsAssignment_4 ) )
            // InternalJoveNotes.g:3907:1: ( rule__ChemEquation__ReactantsAssignment_4 )
            {
             before(grammarAccess.getChemEquationAccess().getReactantsAssignment_4()); 
            // InternalJoveNotes.g:3908:1: ( rule__ChemEquation__ReactantsAssignment_4 )
            // InternalJoveNotes.g:3908:2: rule__ChemEquation__ReactantsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ChemEquation__ReactantsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChemEquationAccess().getReactantsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__4__Impl"


    // $ANTLR start "rule__ChemEquation__Group__5"
    // InternalJoveNotes.g:3918:1: rule__ChemEquation__Group__5 : rule__ChemEquation__Group__5__Impl rule__ChemEquation__Group__6 ;
    public final void rule__ChemEquation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3922:1: ( rule__ChemEquation__Group__5__Impl rule__ChemEquation__Group__6 )
            // InternalJoveNotes.g:3923:2: rule__ChemEquation__Group__5__Impl rule__ChemEquation__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__ChemEquation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChemEquation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__5"


    // $ANTLR start "rule__ChemEquation__Group__5__Impl"
    // InternalJoveNotes.g:3930:1: rule__ChemEquation__Group__5__Impl : ( '>' ) ;
    public final void rule__ChemEquation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3934:1: ( ( '>' ) )
            // InternalJoveNotes.g:3935:1: ( '>' )
            {
            // InternalJoveNotes.g:3935:1: ( '>' )
            // InternalJoveNotes.g:3936:1: '>'
            {
             before(grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__5__Impl"


    // $ANTLR start "rule__ChemEquation__Group__6"
    // InternalJoveNotes.g:3949:1: rule__ChemEquation__Group__6 : rule__ChemEquation__Group__6__Impl rule__ChemEquation__Group__7 ;
    public final void rule__ChemEquation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3953:1: ( rule__ChemEquation__Group__6__Impl rule__ChemEquation__Group__7 )
            // InternalJoveNotes.g:3954:2: rule__ChemEquation__Group__6__Impl rule__ChemEquation__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__ChemEquation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChemEquation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__6"


    // $ANTLR start "rule__ChemEquation__Group__6__Impl"
    // InternalJoveNotes.g:3961:1: rule__ChemEquation__Group__6__Impl : ( ( rule__ChemEquation__ProducesAssignment_6 )? ) ;
    public final void rule__ChemEquation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3965:1: ( ( ( rule__ChemEquation__ProducesAssignment_6 )? ) )
            // InternalJoveNotes.g:3966:1: ( ( rule__ChemEquation__ProducesAssignment_6 )? )
            {
            // InternalJoveNotes.g:3966:1: ( ( rule__ChemEquation__ProducesAssignment_6 )? )
            // InternalJoveNotes.g:3967:1: ( rule__ChemEquation__ProducesAssignment_6 )?
            {
             before(grammarAccess.getChemEquationAccess().getProducesAssignment_6()); 
            // InternalJoveNotes.g:3968:1: ( rule__ChemEquation__ProducesAssignment_6 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalJoveNotes.g:3968:2: rule__ChemEquation__ProducesAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChemEquation__ProducesAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChemEquationAccess().getProducesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__6__Impl"


    // $ANTLR start "rule__ChemEquation__Group__7"
    // InternalJoveNotes.g:3978:1: rule__ChemEquation__Group__7 : rule__ChemEquation__Group__7__Impl rule__ChemEquation__Group__8 ;
    public final void rule__ChemEquation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3982:1: ( rule__ChemEquation__Group__7__Impl rule__ChemEquation__Group__8 )
            // InternalJoveNotes.g:3983:2: rule__ChemEquation__Group__7__Impl rule__ChemEquation__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__ChemEquation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChemEquation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__7"


    // $ANTLR start "rule__ChemEquation__Group__7__Impl"
    // InternalJoveNotes.g:3990:1: rule__ChemEquation__Group__7__Impl : ( '>' ) ;
    public final void rule__ChemEquation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3994:1: ( ( '>' ) )
            // InternalJoveNotes.g:3995:1: ( '>' )
            {
            // InternalJoveNotes.g:3995:1: ( '>' )
            // InternalJoveNotes.g:3996:1: '>'
            {
             before(grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_7()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__7__Impl"


    // $ANTLR start "rule__ChemEquation__Group__8"
    // InternalJoveNotes.g:4009:1: rule__ChemEquation__Group__8 : rule__ChemEquation__Group__8__Impl rule__ChemEquation__Group__9 ;
    public final void rule__ChemEquation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4013:1: ( rule__ChemEquation__Group__8__Impl rule__ChemEquation__Group__9 )
            // InternalJoveNotes.g:4014:2: rule__ChemEquation__Group__8__Impl rule__ChemEquation__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__ChemEquation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChemEquation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__8"


    // $ANTLR start "rule__ChemEquation__Group__8__Impl"
    // InternalJoveNotes.g:4021:1: rule__ChemEquation__Group__8__Impl : ( ( rule__ChemEquation__ProductsAssignment_8 ) ) ;
    public final void rule__ChemEquation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4025:1: ( ( ( rule__ChemEquation__ProductsAssignment_8 ) ) )
            // InternalJoveNotes.g:4026:1: ( ( rule__ChemEquation__ProductsAssignment_8 ) )
            {
            // InternalJoveNotes.g:4026:1: ( ( rule__ChemEquation__ProductsAssignment_8 ) )
            // InternalJoveNotes.g:4027:1: ( rule__ChemEquation__ProductsAssignment_8 )
            {
             before(grammarAccess.getChemEquationAccess().getProductsAssignment_8()); 
            // InternalJoveNotes.g:4028:1: ( rule__ChemEquation__ProductsAssignment_8 )
            // InternalJoveNotes.g:4028:2: rule__ChemEquation__ProductsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ChemEquation__ProductsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getChemEquationAccess().getProductsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__8__Impl"


    // $ANTLR start "rule__ChemEquation__Group__9"
    // InternalJoveNotes.g:4038:1: rule__ChemEquation__Group__9 : rule__ChemEquation__Group__9__Impl ;
    public final void rule__ChemEquation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4042:1: ( rule__ChemEquation__Group__9__Impl )
            // InternalJoveNotes.g:4043:2: rule__ChemEquation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChemEquation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__9"


    // $ANTLR start "rule__ChemEquation__Group__9__Impl"
    // InternalJoveNotes.g:4049:1: rule__ChemEquation__Group__9__Impl : ( '}' ) ;
    public final void rule__ChemEquation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4053:1: ( ( '}' ) )
            // InternalJoveNotes.g:4054:1: ( '}' )
            {
            // InternalJoveNotes.g:4054:1: ( '}' )
            // InternalJoveNotes.g:4055:1: '}'
            {
             before(grammarAccess.getChemEquationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getChemEquationAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__9__Impl"


    // $ANTLR start "rule__ChemCompound__Group__0"
    // InternalJoveNotes.g:4088:1: rule__ChemCompound__Group__0 : rule__ChemCompound__Group__0__Impl rule__ChemCompound__Group__1 ;
    public final void rule__ChemCompound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4092:1: ( rule__ChemCompound__Group__0__Impl rule__ChemCompound__Group__1 )
            // InternalJoveNotes.g:4093:2: rule__ChemCompound__Group__0__Impl rule__ChemCompound__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ChemCompound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChemCompound__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__0"


    // $ANTLR start "rule__ChemCompound__Group__0__Impl"
    // InternalJoveNotes.g:4100:1: rule__ChemCompound__Group__0__Impl : ( '@chem_compound' ) ;
    public final void rule__ChemCompound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4104:1: ( ( '@chem_compound' ) )
            // InternalJoveNotes.g:4105:1: ( '@chem_compound' )
            {
            // InternalJoveNotes.g:4105:1: ( '@chem_compound' )
            // InternalJoveNotes.g:4106:1: '@chem_compound'
            {
             before(grammarAccess.getChemCompoundAccess().getChem_compoundKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getChemCompoundAccess().getChem_compoundKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__0__Impl"


    // $ANTLR start "rule__ChemCompound__Group__1"
    // InternalJoveNotes.g:4119:1: rule__ChemCompound__Group__1 : rule__ChemCompound__Group__1__Impl rule__ChemCompound__Group__2 ;
    public final void rule__ChemCompound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4123:1: ( rule__ChemCompound__Group__1__Impl rule__ChemCompound__Group__2 )
            // InternalJoveNotes.g:4124:2: rule__ChemCompound__Group__1__Impl rule__ChemCompound__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ChemCompound__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChemCompound__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__1"


    // $ANTLR start "rule__ChemCompound__Group__1__Impl"
    // InternalJoveNotes.g:4131:1: rule__ChemCompound__Group__1__Impl : ( ( rule__ChemCompound__HideFromViewAssignment_1 )? ) ;
    public final void rule__ChemCompound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4135:1: ( ( ( rule__ChemCompound__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:4136:1: ( ( rule__ChemCompound__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:4136:1: ( ( rule__ChemCompound__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:4137:1: ( rule__ChemCompound__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getChemCompoundAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:4138:1: ( rule__ChemCompound__HideFromViewAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==60) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalJoveNotes.g:4138:2: rule__ChemCompound__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChemCompound__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChemCompoundAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__1__Impl"


    // $ANTLR start "rule__ChemCompound__Group__2"
    // InternalJoveNotes.g:4148:1: rule__ChemCompound__Group__2 : rule__ChemCompound__Group__2__Impl rule__ChemCompound__Group__3 ;
    public final void rule__ChemCompound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4152:1: ( rule__ChemCompound__Group__2__Impl rule__ChemCompound__Group__3 )
            // InternalJoveNotes.g:4153:2: rule__ChemCompound__Group__2__Impl rule__ChemCompound__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ChemCompound__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChemCompound__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__2"


    // $ANTLR start "rule__ChemCompound__Group__2__Impl"
    // InternalJoveNotes.g:4160:1: rule__ChemCompound__Group__2__Impl : ( ( rule__ChemCompound__SymbolAssignment_2 ) ) ;
    public final void rule__ChemCompound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4164:1: ( ( ( rule__ChemCompound__SymbolAssignment_2 ) ) )
            // InternalJoveNotes.g:4165:1: ( ( rule__ChemCompound__SymbolAssignment_2 ) )
            {
            // InternalJoveNotes.g:4165:1: ( ( rule__ChemCompound__SymbolAssignment_2 ) )
            // InternalJoveNotes.g:4166:1: ( rule__ChemCompound__SymbolAssignment_2 )
            {
             before(grammarAccess.getChemCompoundAccess().getSymbolAssignment_2()); 
            // InternalJoveNotes.g:4167:1: ( rule__ChemCompound__SymbolAssignment_2 )
            // InternalJoveNotes.g:4167:2: rule__ChemCompound__SymbolAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ChemCompound__SymbolAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChemCompoundAccess().getSymbolAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__2__Impl"


    // $ANTLR start "rule__ChemCompound__Group__3"
    // InternalJoveNotes.g:4177:1: rule__ChemCompound__Group__3 : rule__ChemCompound__Group__3__Impl rule__ChemCompound__Group__4 ;
    public final void rule__ChemCompound__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4181:1: ( rule__ChemCompound__Group__3__Impl rule__ChemCompound__Group__4 )
            // InternalJoveNotes.g:4182:2: rule__ChemCompound__Group__3__Impl rule__ChemCompound__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ChemCompound__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChemCompound__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__3"


    // $ANTLR start "rule__ChemCompound__Group__3__Impl"
    // InternalJoveNotes.g:4189:1: rule__ChemCompound__Group__3__Impl : ( ( rule__ChemCompound__ChemicalNameAssignment_3 ) ) ;
    public final void rule__ChemCompound__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4193:1: ( ( ( rule__ChemCompound__ChemicalNameAssignment_3 ) ) )
            // InternalJoveNotes.g:4194:1: ( ( rule__ChemCompound__ChemicalNameAssignment_3 ) )
            {
            // InternalJoveNotes.g:4194:1: ( ( rule__ChemCompound__ChemicalNameAssignment_3 ) )
            // InternalJoveNotes.g:4195:1: ( rule__ChemCompound__ChemicalNameAssignment_3 )
            {
             before(grammarAccess.getChemCompoundAccess().getChemicalNameAssignment_3()); 
            // InternalJoveNotes.g:4196:1: ( rule__ChemCompound__ChemicalNameAssignment_3 )
            // InternalJoveNotes.g:4196:2: rule__ChemCompound__ChemicalNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ChemCompound__ChemicalNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChemCompoundAccess().getChemicalNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__3__Impl"


    // $ANTLR start "rule__ChemCompound__Group__4"
    // InternalJoveNotes.g:4206:1: rule__ChemCompound__Group__4 : rule__ChemCompound__Group__4__Impl ;
    public final void rule__ChemCompound__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4210:1: ( rule__ChemCompound__Group__4__Impl )
            // InternalJoveNotes.g:4211:2: rule__ChemCompound__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChemCompound__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__4"


    // $ANTLR start "rule__ChemCompound__Group__4__Impl"
    // InternalJoveNotes.g:4217:1: rule__ChemCompound__Group__4__Impl : ( ( rule__ChemCompound__CommonNameAssignment_4 )? ) ;
    public final void rule__ChemCompound__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4221:1: ( ( ( rule__ChemCompound__CommonNameAssignment_4 )? ) )
            // InternalJoveNotes.g:4222:1: ( ( rule__ChemCompound__CommonNameAssignment_4 )? )
            {
            // InternalJoveNotes.g:4222:1: ( ( rule__ChemCompound__CommonNameAssignment_4 )? )
            // InternalJoveNotes.g:4223:1: ( rule__ChemCompound__CommonNameAssignment_4 )?
            {
             before(grammarAccess.getChemCompoundAccess().getCommonNameAssignment_4()); 
            // InternalJoveNotes.g:4224:1: ( rule__ChemCompound__CommonNameAssignment_4 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalJoveNotes.g:4224:2: rule__ChemCompound__CommonNameAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChemCompound__CommonNameAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChemCompoundAccess().getCommonNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__4__Impl"


    // $ANTLR start "rule__Spellbee__Group__0"
    // InternalJoveNotes.g:4244:1: rule__Spellbee__Group__0 : rule__Spellbee__Group__0__Impl rule__Spellbee__Group__1 ;
    public final void rule__Spellbee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4248:1: ( rule__Spellbee__Group__0__Impl rule__Spellbee__Group__1 )
            // InternalJoveNotes.g:4249:2: rule__Spellbee__Group__0__Impl rule__Spellbee__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Spellbee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spellbee__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spellbee__Group__0"


    // $ANTLR start "rule__Spellbee__Group__0__Impl"
    // InternalJoveNotes.g:4256:1: rule__Spellbee__Group__0__Impl : ( '@spellbee' ) ;
    public final void rule__Spellbee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4260:1: ( ( '@spellbee' ) )
            // InternalJoveNotes.g:4261:1: ( '@spellbee' )
            {
            // InternalJoveNotes.g:4261:1: ( '@spellbee' )
            // InternalJoveNotes.g:4262:1: '@spellbee'
            {
             before(grammarAccess.getSpellbeeAccess().getSpellbeeKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSpellbeeAccess().getSpellbeeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spellbee__Group__0__Impl"


    // $ANTLR start "rule__Spellbee__Group__1"
    // InternalJoveNotes.g:4275:1: rule__Spellbee__Group__1 : rule__Spellbee__Group__1__Impl rule__Spellbee__Group__2 ;
    public final void rule__Spellbee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4279:1: ( rule__Spellbee__Group__1__Impl rule__Spellbee__Group__2 )
            // InternalJoveNotes.g:4280:2: rule__Spellbee__Group__1__Impl rule__Spellbee__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Spellbee__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spellbee__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spellbee__Group__1"


    // $ANTLR start "rule__Spellbee__Group__1__Impl"
    // InternalJoveNotes.g:4287:1: rule__Spellbee__Group__1__Impl : ( ( rule__Spellbee__HideFromViewAssignment_1 )? ) ;
    public final void rule__Spellbee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4291:1: ( ( ( rule__Spellbee__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:4292:1: ( ( rule__Spellbee__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:4292:1: ( ( rule__Spellbee__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:4293:1: ( rule__Spellbee__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getSpellbeeAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:4294:1: ( rule__Spellbee__HideFromViewAssignment_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==60) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalJoveNotes.g:4294:2: rule__Spellbee__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Spellbee__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpellbeeAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spellbee__Group__1__Impl"


    // $ANTLR start "rule__Spellbee__Group__2"
    // InternalJoveNotes.g:4304:1: rule__Spellbee__Group__2 : rule__Spellbee__Group__2__Impl ;
    public final void rule__Spellbee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4308:1: ( rule__Spellbee__Group__2__Impl )
            // InternalJoveNotes.g:4309:2: rule__Spellbee__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Spellbee__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spellbee__Group__2"


    // $ANTLR start "rule__Spellbee__Group__2__Impl"
    // InternalJoveNotes.g:4315:1: rule__Spellbee__Group__2__Impl : ( ( rule__Spellbee__WordAssignment_2 ) ) ;
    public final void rule__Spellbee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4319:1: ( ( ( rule__Spellbee__WordAssignment_2 ) ) )
            // InternalJoveNotes.g:4320:1: ( ( rule__Spellbee__WordAssignment_2 ) )
            {
            // InternalJoveNotes.g:4320:1: ( ( rule__Spellbee__WordAssignment_2 ) )
            // InternalJoveNotes.g:4321:1: ( rule__Spellbee__WordAssignment_2 )
            {
             before(grammarAccess.getSpellbeeAccess().getWordAssignment_2()); 
            // InternalJoveNotes.g:4322:1: ( rule__Spellbee__WordAssignment_2 )
            // InternalJoveNotes.g:4322:2: rule__Spellbee__WordAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Spellbee__WordAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpellbeeAccess().getWordAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spellbee__Group__2__Impl"


    // $ANTLR start "rule__ImageLabel__Group__0"
    // InternalJoveNotes.g:4338:1: rule__ImageLabel__Group__0 : rule__ImageLabel__Group__0__Impl rule__ImageLabel__Group__1 ;
    public final void rule__ImageLabel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4342:1: ( rule__ImageLabel__Group__0__Impl rule__ImageLabel__Group__1 )
            // InternalJoveNotes.g:4343:2: rule__ImageLabel__Group__0__Impl rule__ImageLabel__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ImageLabel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageLabel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__0"


    // $ANTLR start "rule__ImageLabel__Group__0__Impl"
    // InternalJoveNotes.g:4350:1: rule__ImageLabel__Group__0__Impl : ( '@image_label' ) ;
    public final void rule__ImageLabel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4354:1: ( ( '@image_label' ) )
            // InternalJoveNotes.g:4355:1: ( '@image_label' )
            {
            // InternalJoveNotes.g:4355:1: ( '@image_label' )
            // InternalJoveNotes.g:4356:1: '@image_label'
            {
             before(grammarAccess.getImageLabelAccess().getImage_labelKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getImageLabelAccess().getImage_labelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__0__Impl"


    // $ANTLR start "rule__ImageLabel__Group__1"
    // InternalJoveNotes.g:4369:1: rule__ImageLabel__Group__1 : rule__ImageLabel__Group__1__Impl rule__ImageLabel__Group__2 ;
    public final void rule__ImageLabel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4373:1: ( rule__ImageLabel__Group__1__Impl rule__ImageLabel__Group__2 )
            // InternalJoveNotes.g:4374:2: rule__ImageLabel__Group__1__Impl rule__ImageLabel__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ImageLabel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageLabel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__1"


    // $ANTLR start "rule__ImageLabel__Group__1__Impl"
    // InternalJoveNotes.g:4381:1: rule__ImageLabel__Group__1__Impl : ( ( rule__ImageLabel__HideFromViewAssignment_1 )? ) ;
    public final void rule__ImageLabel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4385:1: ( ( ( rule__ImageLabel__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:4386:1: ( ( rule__ImageLabel__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:4386:1: ( ( rule__ImageLabel__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:4387:1: ( rule__ImageLabel__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getImageLabelAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:4388:1: ( rule__ImageLabel__HideFromViewAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==60) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalJoveNotes.g:4388:2: rule__ImageLabel__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImageLabel__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageLabelAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__1__Impl"


    // $ANTLR start "rule__ImageLabel__Group__2"
    // InternalJoveNotes.g:4398:1: rule__ImageLabel__Group__2 : rule__ImageLabel__Group__2__Impl rule__ImageLabel__Group__3 ;
    public final void rule__ImageLabel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4402:1: ( rule__ImageLabel__Group__2__Impl rule__ImageLabel__Group__3 )
            // InternalJoveNotes.g:4403:2: rule__ImageLabel__Group__2__Impl rule__ImageLabel__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ImageLabel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageLabel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__2"


    // $ANTLR start "rule__ImageLabel__Group__2__Impl"
    // InternalJoveNotes.g:4410:1: rule__ImageLabel__Group__2__Impl : ( ( rule__ImageLabel__CaptionAssignment_2 )? ) ;
    public final void rule__ImageLabel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4414:1: ( ( ( rule__ImageLabel__CaptionAssignment_2 )? ) )
            // InternalJoveNotes.g:4415:1: ( ( rule__ImageLabel__CaptionAssignment_2 )? )
            {
            // InternalJoveNotes.g:4415:1: ( ( rule__ImageLabel__CaptionAssignment_2 )? )
            // InternalJoveNotes.g:4416:1: ( rule__ImageLabel__CaptionAssignment_2 )?
            {
             before(grammarAccess.getImageLabelAccess().getCaptionAssignment_2()); 
            // InternalJoveNotes.g:4417:1: ( rule__ImageLabel__CaptionAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalJoveNotes.g:4417:2: rule__ImageLabel__CaptionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImageLabel__CaptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageLabelAccess().getCaptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__2__Impl"


    // $ANTLR start "rule__ImageLabel__Group__3"
    // InternalJoveNotes.g:4427:1: rule__ImageLabel__Group__3 : rule__ImageLabel__Group__3__Impl rule__ImageLabel__Group__4 ;
    public final void rule__ImageLabel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4431:1: ( rule__ImageLabel__Group__3__Impl rule__ImageLabel__Group__4 )
            // InternalJoveNotes.g:4432:2: rule__ImageLabel__Group__3__Impl rule__ImageLabel__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__ImageLabel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageLabel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__3"


    // $ANTLR start "rule__ImageLabel__Group__3__Impl"
    // InternalJoveNotes.g:4439:1: rule__ImageLabel__Group__3__Impl : ( '{' ) ;
    public final void rule__ImageLabel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4443:1: ( ( '{' ) )
            // InternalJoveNotes.g:4444:1: ( '{' )
            {
            // InternalJoveNotes.g:4444:1: ( '{' )
            // InternalJoveNotes.g:4445:1: '{'
            {
             before(grammarAccess.getImageLabelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getImageLabelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__3__Impl"


    // $ANTLR start "rule__ImageLabel__Group__4"
    // InternalJoveNotes.g:4458:1: rule__ImageLabel__Group__4 : rule__ImageLabel__Group__4__Impl rule__ImageLabel__Group__5 ;
    public final void rule__ImageLabel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4462:1: ( rule__ImageLabel__Group__4__Impl rule__ImageLabel__Group__5 )
            // InternalJoveNotes.g:4463:2: rule__ImageLabel__Group__4__Impl rule__ImageLabel__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ImageLabel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageLabel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__4"


    // $ANTLR start "rule__ImageLabel__Group__4__Impl"
    // InternalJoveNotes.g:4470:1: rule__ImageLabel__Group__4__Impl : ( 'imageName' ) ;
    public final void rule__ImageLabel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4474:1: ( ( 'imageName' ) )
            // InternalJoveNotes.g:4475:1: ( 'imageName' )
            {
            // InternalJoveNotes.g:4475:1: ( 'imageName' )
            // InternalJoveNotes.g:4476:1: 'imageName'
            {
             before(grammarAccess.getImageLabelAccess().getImageNameKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getImageLabelAccess().getImageNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__4__Impl"


    // $ANTLR start "rule__ImageLabel__Group__5"
    // InternalJoveNotes.g:4489:1: rule__ImageLabel__Group__5 : rule__ImageLabel__Group__5__Impl rule__ImageLabel__Group__6 ;
    public final void rule__ImageLabel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4493:1: ( rule__ImageLabel__Group__5__Impl rule__ImageLabel__Group__6 )
            // InternalJoveNotes.g:4494:2: rule__ImageLabel__Group__5__Impl rule__ImageLabel__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ImageLabel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageLabel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__5"


    // $ANTLR start "rule__ImageLabel__Group__5__Impl"
    // InternalJoveNotes.g:4501:1: rule__ImageLabel__Group__5__Impl : ( ( rule__ImageLabel__ImageNameAssignment_5 ) ) ;
    public final void rule__ImageLabel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4505:1: ( ( ( rule__ImageLabel__ImageNameAssignment_5 ) ) )
            // InternalJoveNotes.g:4506:1: ( ( rule__ImageLabel__ImageNameAssignment_5 ) )
            {
            // InternalJoveNotes.g:4506:1: ( ( rule__ImageLabel__ImageNameAssignment_5 ) )
            // InternalJoveNotes.g:4507:1: ( rule__ImageLabel__ImageNameAssignment_5 )
            {
             before(grammarAccess.getImageLabelAccess().getImageNameAssignment_5()); 
            // InternalJoveNotes.g:4508:1: ( rule__ImageLabel__ImageNameAssignment_5 )
            // InternalJoveNotes.g:4508:2: rule__ImageLabel__ImageNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ImageLabel__ImageNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getImageLabelAccess().getImageNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__5__Impl"


    // $ANTLR start "rule__ImageLabel__Group__6"
    // InternalJoveNotes.g:4518:1: rule__ImageLabel__Group__6 : rule__ImageLabel__Group__6__Impl rule__ImageLabel__Group__7 ;
    public final void rule__ImageLabel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4522:1: ( rule__ImageLabel__Group__6__Impl rule__ImageLabel__Group__7 )
            // InternalJoveNotes.g:4523:2: rule__ImageLabel__Group__6__Impl rule__ImageLabel__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__ImageLabel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageLabel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__6"


    // $ANTLR start "rule__ImageLabel__Group__6__Impl"
    // InternalJoveNotes.g:4530:1: rule__ImageLabel__Group__6__Impl : ( ( rule__ImageLabel__HotspotsAssignment_6 ) ) ;
    public final void rule__ImageLabel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4534:1: ( ( ( rule__ImageLabel__HotspotsAssignment_6 ) ) )
            // InternalJoveNotes.g:4535:1: ( ( rule__ImageLabel__HotspotsAssignment_6 ) )
            {
            // InternalJoveNotes.g:4535:1: ( ( rule__ImageLabel__HotspotsAssignment_6 ) )
            // InternalJoveNotes.g:4536:1: ( rule__ImageLabel__HotspotsAssignment_6 )
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsAssignment_6()); 
            // InternalJoveNotes.g:4537:1: ( rule__ImageLabel__HotspotsAssignment_6 )
            // InternalJoveNotes.g:4537:2: rule__ImageLabel__HotspotsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ImageLabel__HotspotsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getImageLabelAccess().getHotspotsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__6__Impl"


    // $ANTLR start "rule__ImageLabel__Group__7"
    // InternalJoveNotes.g:4547:1: rule__ImageLabel__Group__7 : rule__ImageLabel__Group__7__Impl rule__ImageLabel__Group__8 ;
    public final void rule__ImageLabel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4551:1: ( rule__ImageLabel__Group__7__Impl rule__ImageLabel__Group__8 )
            // InternalJoveNotes.g:4552:2: rule__ImageLabel__Group__7__Impl rule__ImageLabel__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__ImageLabel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageLabel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__7"


    // $ANTLR start "rule__ImageLabel__Group__7__Impl"
    // InternalJoveNotes.g:4559:1: rule__ImageLabel__Group__7__Impl : ( ( rule__ImageLabel__Group_7__0 )* ) ;
    public final void rule__ImageLabel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4563:1: ( ( ( rule__ImageLabel__Group_7__0 )* ) )
            // InternalJoveNotes.g:4564:1: ( ( rule__ImageLabel__Group_7__0 )* )
            {
            // InternalJoveNotes.g:4564:1: ( ( rule__ImageLabel__Group_7__0 )* )
            // InternalJoveNotes.g:4565:1: ( rule__ImageLabel__Group_7__0 )*
            {
             before(grammarAccess.getImageLabelAccess().getGroup_7()); 
            // InternalJoveNotes.g:4566:1: ( rule__ImageLabel__Group_7__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==39) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalJoveNotes.g:4566:2: rule__ImageLabel__Group_7__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ImageLabel__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getImageLabelAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__7__Impl"


    // $ANTLR start "rule__ImageLabel__Group__8"
    // InternalJoveNotes.g:4576:1: rule__ImageLabel__Group__8 : rule__ImageLabel__Group__8__Impl ;
    public final void rule__ImageLabel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4580:1: ( rule__ImageLabel__Group__8__Impl )
            // InternalJoveNotes.g:4581:2: rule__ImageLabel__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageLabel__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__8"


    // $ANTLR start "rule__ImageLabel__Group__8__Impl"
    // InternalJoveNotes.g:4587:1: rule__ImageLabel__Group__8__Impl : ( '}' ) ;
    public final void rule__ImageLabel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4591:1: ( ( '}' ) )
            // InternalJoveNotes.g:4592:1: ( '}' )
            {
            // InternalJoveNotes.g:4592:1: ( '}' )
            // InternalJoveNotes.g:4593:1: '}'
            {
             before(grammarAccess.getImageLabelAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getImageLabelAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__8__Impl"


    // $ANTLR start "rule__ImageLabel__Group_7__0"
    // InternalJoveNotes.g:4624:1: rule__ImageLabel__Group_7__0 : rule__ImageLabel__Group_7__0__Impl rule__ImageLabel__Group_7__1 ;
    public final void rule__ImageLabel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4628:1: ( rule__ImageLabel__Group_7__0__Impl rule__ImageLabel__Group_7__1 )
            // InternalJoveNotes.g:4629:2: rule__ImageLabel__Group_7__0__Impl rule__ImageLabel__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__ImageLabel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageLabel__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group_7__0"


    // $ANTLR start "rule__ImageLabel__Group_7__0__Impl"
    // InternalJoveNotes.g:4636:1: rule__ImageLabel__Group_7__0__Impl : ( ',' ) ;
    public final void rule__ImageLabel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4640:1: ( ( ',' ) )
            // InternalJoveNotes.g:4641:1: ( ',' )
            {
            // InternalJoveNotes.g:4641:1: ( ',' )
            // InternalJoveNotes.g:4642:1: ','
            {
             before(grammarAccess.getImageLabelAccess().getCommaKeyword_7_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getImageLabelAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group_7__0__Impl"


    // $ANTLR start "rule__ImageLabel__Group_7__1"
    // InternalJoveNotes.g:4655:1: rule__ImageLabel__Group_7__1 : rule__ImageLabel__Group_7__1__Impl ;
    public final void rule__ImageLabel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4659:1: ( rule__ImageLabel__Group_7__1__Impl )
            // InternalJoveNotes.g:4660:2: rule__ImageLabel__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageLabel__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group_7__1"


    // $ANTLR start "rule__ImageLabel__Group_7__1__Impl"
    // InternalJoveNotes.g:4666:1: rule__ImageLabel__Group_7__1__Impl : ( ( rule__ImageLabel__HotspotsAssignment_7_1 ) ) ;
    public final void rule__ImageLabel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4670:1: ( ( ( rule__ImageLabel__HotspotsAssignment_7_1 ) ) )
            // InternalJoveNotes.g:4671:1: ( ( rule__ImageLabel__HotspotsAssignment_7_1 ) )
            {
            // InternalJoveNotes.g:4671:1: ( ( rule__ImageLabel__HotspotsAssignment_7_1 ) )
            // InternalJoveNotes.g:4672:1: ( rule__ImageLabel__HotspotsAssignment_7_1 )
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsAssignment_7_1()); 
            // InternalJoveNotes.g:4673:1: ( rule__ImageLabel__HotspotsAssignment_7_1 )
            // InternalJoveNotes.g:4673:2: rule__ImageLabel__HotspotsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ImageLabel__HotspotsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getImageLabelAccess().getHotspotsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group_7__1__Impl"


    // $ANTLR start "rule__HotSpot__Group__0"
    // InternalJoveNotes.g:4687:1: rule__HotSpot__Group__0 : rule__HotSpot__Group__0__Impl rule__HotSpot__Group__1 ;
    public final void rule__HotSpot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4691:1: ( rule__HotSpot__Group__0__Impl rule__HotSpot__Group__1 )
            // InternalJoveNotes.g:4692:2: rule__HotSpot__Group__0__Impl rule__HotSpot__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__HotSpot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HotSpot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__0"


    // $ANTLR start "rule__HotSpot__Group__0__Impl"
    // InternalJoveNotes.g:4699:1: rule__HotSpot__Group__0__Impl : ( ( rule__HotSpot__XAssignment_0 ) ) ;
    public final void rule__HotSpot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4703:1: ( ( ( rule__HotSpot__XAssignment_0 ) ) )
            // InternalJoveNotes.g:4704:1: ( ( rule__HotSpot__XAssignment_0 ) )
            {
            // InternalJoveNotes.g:4704:1: ( ( rule__HotSpot__XAssignment_0 ) )
            // InternalJoveNotes.g:4705:1: ( rule__HotSpot__XAssignment_0 )
            {
             before(grammarAccess.getHotSpotAccess().getXAssignment_0()); 
            // InternalJoveNotes.g:4706:1: ( rule__HotSpot__XAssignment_0 )
            // InternalJoveNotes.g:4706:2: rule__HotSpot__XAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__HotSpot__XAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHotSpotAccess().getXAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__0__Impl"


    // $ANTLR start "rule__HotSpot__Group__1"
    // InternalJoveNotes.g:4716:1: rule__HotSpot__Group__1 : rule__HotSpot__Group__1__Impl rule__HotSpot__Group__2 ;
    public final void rule__HotSpot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4720:1: ( rule__HotSpot__Group__1__Impl rule__HotSpot__Group__2 )
            // InternalJoveNotes.g:4721:2: rule__HotSpot__Group__1__Impl rule__HotSpot__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__HotSpot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HotSpot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__1"


    // $ANTLR start "rule__HotSpot__Group__1__Impl"
    // InternalJoveNotes.g:4728:1: rule__HotSpot__Group__1__Impl : ( ',' ) ;
    public final void rule__HotSpot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4732:1: ( ( ',' ) )
            // InternalJoveNotes.g:4733:1: ( ',' )
            {
            // InternalJoveNotes.g:4733:1: ( ',' )
            // InternalJoveNotes.g:4734:1: ','
            {
             before(grammarAccess.getHotSpotAccess().getCommaKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getHotSpotAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__1__Impl"


    // $ANTLR start "rule__HotSpot__Group__2"
    // InternalJoveNotes.g:4747:1: rule__HotSpot__Group__2 : rule__HotSpot__Group__2__Impl rule__HotSpot__Group__3 ;
    public final void rule__HotSpot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4751:1: ( rule__HotSpot__Group__2__Impl rule__HotSpot__Group__3 )
            // InternalJoveNotes.g:4752:2: rule__HotSpot__Group__2__Impl rule__HotSpot__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__HotSpot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HotSpot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__2"


    // $ANTLR start "rule__HotSpot__Group__2__Impl"
    // InternalJoveNotes.g:4759:1: rule__HotSpot__Group__2__Impl : ( ( rule__HotSpot__YAssignment_2 ) ) ;
    public final void rule__HotSpot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4763:1: ( ( ( rule__HotSpot__YAssignment_2 ) ) )
            // InternalJoveNotes.g:4764:1: ( ( rule__HotSpot__YAssignment_2 ) )
            {
            // InternalJoveNotes.g:4764:1: ( ( rule__HotSpot__YAssignment_2 ) )
            // InternalJoveNotes.g:4765:1: ( rule__HotSpot__YAssignment_2 )
            {
             before(grammarAccess.getHotSpotAccess().getYAssignment_2()); 
            // InternalJoveNotes.g:4766:1: ( rule__HotSpot__YAssignment_2 )
            // InternalJoveNotes.g:4766:2: rule__HotSpot__YAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HotSpot__YAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHotSpotAccess().getYAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__2__Impl"


    // $ANTLR start "rule__HotSpot__Group__3"
    // InternalJoveNotes.g:4776:1: rule__HotSpot__Group__3 : rule__HotSpot__Group__3__Impl rule__HotSpot__Group__4 ;
    public final void rule__HotSpot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4780:1: ( rule__HotSpot__Group__3__Impl rule__HotSpot__Group__4 )
            // InternalJoveNotes.g:4781:2: rule__HotSpot__Group__3__Impl rule__HotSpot__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__HotSpot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HotSpot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__3"


    // $ANTLR start "rule__HotSpot__Group__3__Impl"
    // InternalJoveNotes.g:4788:1: rule__HotSpot__Group__3__Impl : ( '=' ) ;
    public final void rule__HotSpot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4792:1: ( ( '=' ) )
            // InternalJoveNotes.g:4793:1: ( '=' )
            {
            // InternalJoveNotes.g:4793:1: ( '=' )
            // InternalJoveNotes.g:4794:1: '='
            {
             before(grammarAccess.getHotSpotAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHotSpotAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__3__Impl"


    // $ANTLR start "rule__HotSpot__Group__4"
    // InternalJoveNotes.g:4807:1: rule__HotSpot__Group__4 : rule__HotSpot__Group__4__Impl ;
    public final void rule__HotSpot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4811:1: ( rule__HotSpot__Group__4__Impl )
            // InternalJoveNotes.g:4812:2: rule__HotSpot__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HotSpot__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__4"


    // $ANTLR start "rule__HotSpot__Group__4__Impl"
    // InternalJoveNotes.g:4818:1: rule__HotSpot__Group__4__Impl : ( ( rule__HotSpot__LabelAssignment_4 ) ) ;
    public final void rule__HotSpot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4822:1: ( ( ( rule__HotSpot__LabelAssignment_4 ) ) )
            // InternalJoveNotes.g:4823:1: ( ( rule__HotSpot__LabelAssignment_4 ) )
            {
            // InternalJoveNotes.g:4823:1: ( ( rule__HotSpot__LabelAssignment_4 ) )
            // InternalJoveNotes.g:4824:1: ( rule__HotSpot__LabelAssignment_4 )
            {
             before(grammarAccess.getHotSpotAccess().getLabelAssignment_4()); 
            // InternalJoveNotes.g:4825:1: ( rule__HotSpot__LabelAssignment_4 )
            // InternalJoveNotes.g:4825:2: rule__HotSpot__LabelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__HotSpot__LabelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHotSpotAccess().getLabelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__4__Impl"


    // $ANTLR start "rule__Equation__Group__0"
    // InternalJoveNotes.g:4845:1: rule__Equation__Group__0 : rule__Equation__Group__0__Impl rule__Equation__Group__1 ;
    public final void rule__Equation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4849:1: ( rule__Equation__Group__0__Impl rule__Equation__Group__1 )
            // InternalJoveNotes.g:4850:2: rule__Equation__Group__0__Impl rule__Equation__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Equation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__0"


    // $ANTLR start "rule__Equation__Group__0__Impl"
    // InternalJoveNotes.g:4857:1: rule__Equation__Group__0__Impl : ( '@equation' ) ;
    public final void rule__Equation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4861:1: ( ( '@equation' ) )
            // InternalJoveNotes.g:4862:1: ( '@equation' )
            {
            // InternalJoveNotes.g:4862:1: ( '@equation' )
            // InternalJoveNotes.g:4863:1: '@equation'
            {
             before(grammarAccess.getEquationAccess().getEquationKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEquationAccess().getEquationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__0__Impl"


    // $ANTLR start "rule__Equation__Group__1"
    // InternalJoveNotes.g:4876:1: rule__Equation__Group__1 : rule__Equation__Group__1__Impl rule__Equation__Group__2 ;
    public final void rule__Equation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4880:1: ( rule__Equation__Group__1__Impl rule__Equation__Group__2 )
            // InternalJoveNotes.g:4881:2: rule__Equation__Group__1__Impl rule__Equation__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Equation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__1"


    // $ANTLR start "rule__Equation__Group__1__Impl"
    // InternalJoveNotes.g:4888:1: rule__Equation__Group__1__Impl : ( ( rule__Equation__HideFromViewAssignment_1 )? ) ;
    public final void rule__Equation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4892:1: ( ( ( rule__Equation__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:4893:1: ( ( rule__Equation__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:4893:1: ( ( rule__Equation__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:4894:1: ( rule__Equation__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getEquationAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:4895:1: ( rule__Equation__HideFromViewAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==60) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalJoveNotes.g:4895:2: rule__Equation__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equation__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEquationAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__1__Impl"


    // $ANTLR start "rule__Equation__Group__2"
    // InternalJoveNotes.g:4905:1: rule__Equation__Group__2 : rule__Equation__Group__2__Impl rule__Equation__Group__3 ;
    public final void rule__Equation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4909:1: ( rule__Equation__Group__2__Impl rule__Equation__Group__3 )
            // InternalJoveNotes.g:4910:2: rule__Equation__Group__2__Impl rule__Equation__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Equation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__2"


    // $ANTLR start "rule__Equation__Group__2__Impl"
    // InternalJoveNotes.g:4917:1: rule__Equation__Group__2__Impl : ( ( rule__Equation__EquationAssignment_2 ) ) ;
    public final void rule__Equation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4921:1: ( ( ( rule__Equation__EquationAssignment_2 ) ) )
            // InternalJoveNotes.g:4922:1: ( ( rule__Equation__EquationAssignment_2 ) )
            {
            // InternalJoveNotes.g:4922:1: ( ( rule__Equation__EquationAssignment_2 ) )
            // InternalJoveNotes.g:4923:1: ( rule__Equation__EquationAssignment_2 )
            {
             before(grammarAccess.getEquationAccess().getEquationAssignment_2()); 
            // InternalJoveNotes.g:4924:1: ( rule__Equation__EquationAssignment_2 )
            // InternalJoveNotes.g:4924:2: rule__Equation__EquationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Equation__EquationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEquationAccess().getEquationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__2__Impl"


    // $ANTLR start "rule__Equation__Group__3"
    // InternalJoveNotes.g:4934:1: rule__Equation__Group__3 : rule__Equation__Group__3__Impl rule__Equation__Group__4 ;
    public final void rule__Equation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4938:1: ( rule__Equation__Group__3__Impl rule__Equation__Group__4 )
            // InternalJoveNotes.g:4939:2: rule__Equation__Group__3__Impl rule__Equation__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Equation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__3"


    // $ANTLR start "rule__Equation__Group__3__Impl"
    // InternalJoveNotes.g:4946:1: rule__Equation__Group__3__Impl : ( '{' ) ;
    public final void rule__Equation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4950:1: ( ( '{' ) )
            // InternalJoveNotes.g:4951:1: ( '{' )
            {
            // InternalJoveNotes.g:4951:1: ( '{' )
            // InternalJoveNotes.g:4952:1: '{'
            {
             before(grammarAccess.getEquationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEquationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__3__Impl"


    // $ANTLR start "rule__Equation__Group__4"
    // InternalJoveNotes.g:4965:1: rule__Equation__Group__4 : rule__Equation__Group__4__Impl rule__Equation__Group__5 ;
    public final void rule__Equation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4969:1: ( rule__Equation__Group__4__Impl rule__Equation__Group__5 )
            // InternalJoveNotes.g:4970:2: rule__Equation__Group__4__Impl rule__Equation__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Equation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__4"


    // $ANTLR start "rule__Equation__Group__4__Impl"
    // InternalJoveNotes.g:4977:1: rule__Equation__Group__4__Impl : ( ( rule__Equation__DescriptionAssignment_4 )? ) ;
    public final void rule__Equation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4981:1: ( ( ( rule__Equation__DescriptionAssignment_4 )? ) )
            // InternalJoveNotes.g:4982:1: ( ( rule__Equation__DescriptionAssignment_4 )? )
            {
            // InternalJoveNotes.g:4982:1: ( ( rule__Equation__DescriptionAssignment_4 )? )
            // InternalJoveNotes.g:4983:1: ( rule__Equation__DescriptionAssignment_4 )?
            {
             before(grammarAccess.getEquationAccess().getDescriptionAssignment_4()); 
            // InternalJoveNotes.g:4984:1: ( rule__Equation__DescriptionAssignment_4 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_STRING) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalJoveNotes.g:4984:2: rule__Equation__DescriptionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equation__DescriptionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEquationAccess().getDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__4__Impl"


    // $ANTLR start "rule__Equation__Group__5"
    // InternalJoveNotes.g:4994:1: rule__Equation__Group__5 : rule__Equation__Group__5__Impl rule__Equation__Group__6 ;
    public final void rule__Equation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4998:1: ( rule__Equation__Group__5__Impl rule__Equation__Group__6 )
            // InternalJoveNotes.g:4999:2: rule__Equation__Group__5__Impl rule__Equation__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Equation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__5"


    // $ANTLR start "rule__Equation__Group__5__Impl"
    // InternalJoveNotes.g:5006:1: rule__Equation__Group__5__Impl : ( 'where' ) ;
    public final void rule__Equation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5010:1: ( ( 'where' ) )
            // InternalJoveNotes.g:5011:1: ( 'where' )
            {
            // InternalJoveNotes.g:5011:1: ( 'where' )
            // InternalJoveNotes.g:5012:1: 'where'
            {
             before(grammarAccess.getEquationAccess().getWhereKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEquationAccess().getWhereKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__5__Impl"


    // $ANTLR start "rule__Equation__Group__6"
    // InternalJoveNotes.g:5025:1: rule__Equation__Group__6 : rule__Equation__Group__6__Impl rule__Equation__Group__7 ;
    public final void rule__Equation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5029:1: ( rule__Equation__Group__6__Impl rule__Equation__Group__7 )
            // InternalJoveNotes.g:5030:2: rule__Equation__Group__6__Impl rule__Equation__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__Equation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__6"


    // $ANTLR start "rule__Equation__Group__6__Impl"
    // InternalJoveNotes.g:5037:1: rule__Equation__Group__6__Impl : ( ( rule__Equation__SymbolsAssignment_6 ) ) ;
    public final void rule__Equation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5041:1: ( ( ( rule__Equation__SymbolsAssignment_6 ) ) )
            // InternalJoveNotes.g:5042:1: ( ( rule__Equation__SymbolsAssignment_6 ) )
            {
            // InternalJoveNotes.g:5042:1: ( ( rule__Equation__SymbolsAssignment_6 ) )
            // InternalJoveNotes.g:5043:1: ( rule__Equation__SymbolsAssignment_6 )
            {
             before(grammarAccess.getEquationAccess().getSymbolsAssignment_6()); 
            // InternalJoveNotes.g:5044:1: ( rule__Equation__SymbolsAssignment_6 )
            // InternalJoveNotes.g:5044:2: rule__Equation__SymbolsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Equation__SymbolsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEquationAccess().getSymbolsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__6__Impl"


    // $ANTLR start "rule__Equation__Group__7"
    // InternalJoveNotes.g:5054:1: rule__Equation__Group__7 : rule__Equation__Group__7__Impl rule__Equation__Group__8 ;
    public final void rule__Equation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5058:1: ( rule__Equation__Group__7__Impl rule__Equation__Group__8 )
            // InternalJoveNotes.g:5059:2: rule__Equation__Group__7__Impl rule__Equation__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__Equation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__7"


    // $ANTLR start "rule__Equation__Group__7__Impl"
    // InternalJoveNotes.g:5066:1: rule__Equation__Group__7__Impl : ( ( rule__Equation__Group_7__0 )* ) ;
    public final void rule__Equation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5070:1: ( ( ( rule__Equation__Group_7__0 )* ) )
            // InternalJoveNotes.g:5071:1: ( ( rule__Equation__Group_7__0 )* )
            {
            // InternalJoveNotes.g:5071:1: ( ( rule__Equation__Group_7__0 )* )
            // InternalJoveNotes.g:5072:1: ( rule__Equation__Group_7__0 )*
            {
             before(grammarAccess.getEquationAccess().getGroup_7()); 
            // InternalJoveNotes.g:5073:1: ( rule__Equation__Group_7__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==39) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalJoveNotes.g:5073:2: rule__Equation__Group_7__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Equation__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getEquationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__7__Impl"


    // $ANTLR start "rule__Equation__Group__8"
    // InternalJoveNotes.g:5083:1: rule__Equation__Group__8 : rule__Equation__Group__8__Impl ;
    public final void rule__Equation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5087:1: ( rule__Equation__Group__8__Impl )
            // InternalJoveNotes.g:5088:2: rule__Equation__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equation__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__8"


    // $ANTLR start "rule__Equation__Group__8__Impl"
    // InternalJoveNotes.g:5094:1: rule__Equation__Group__8__Impl : ( '}' ) ;
    public final void rule__Equation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5098:1: ( ( '}' ) )
            // InternalJoveNotes.g:5099:1: ( '}' )
            {
            // InternalJoveNotes.g:5099:1: ( '}' )
            // InternalJoveNotes.g:5100:1: '}'
            {
             before(grammarAccess.getEquationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEquationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__8__Impl"


    // $ANTLR start "rule__Equation__Group_7__0"
    // InternalJoveNotes.g:5131:1: rule__Equation__Group_7__0 : rule__Equation__Group_7__0__Impl rule__Equation__Group_7__1 ;
    public final void rule__Equation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5135:1: ( rule__Equation__Group_7__0__Impl rule__Equation__Group_7__1 )
            // InternalJoveNotes.g:5136:2: rule__Equation__Group_7__0__Impl rule__Equation__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__Equation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group_7__0"


    // $ANTLR start "rule__Equation__Group_7__0__Impl"
    // InternalJoveNotes.g:5143:1: rule__Equation__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Equation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5147:1: ( ( ',' ) )
            // InternalJoveNotes.g:5148:1: ( ',' )
            {
            // InternalJoveNotes.g:5148:1: ( ',' )
            // InternalJoveNotes.g:5149:1: ','
            {
             before(grammarAccess.getEquationAccess().getCommaKeyword_7_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEquationAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group_7__0__Impl"


    // $ANTLR start "rule__Equation__Group_7__1"
    // InternalJoveNotes.g:5162:1: rule__Equation__Group_7__1 : rule__Equation__Group_7__1__Impl ;
    public final void rule__Equation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5166:1: ( rule__Equation__Group_7__1__Impl )
            // InternalJoveNotes.g:5167:2: rule__Equation__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equation__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group_7__1"


    // $ANTLR start "rule__Equation__Group_7__1__Impl"
    // InternalJoveNotes.g:5173:1: rule__Equation__Group_7__1__Impl : ( ( rule__Equation__SymbolsAssignment_7_1 ) ) ;
    public final void rule__Equation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5177:1: ( ( ( rule__Equation__SymbolsAssignment_7_1 ) ) )
            // InternalJoveNotes.g:5178:1: ( ( rule__Equation__SymbolsAssignment_7_1 ) )
            {
            // InternalJoveNotes.g:5178:1: ( ( rule__Equation__SymbolsAssignment_7_1 ) )
            // InternalJoveNotes.g:5179:1: ( rule__Equation__SymbolsAssignment_7_1 )
            {
             before(grammarAccess.getEquationAccess().getSymbolsAssignment_7_1()); 
            // InternalJoveNotes.g:5180:1: ( rule__Equation__SymbolsAssignment_7_1 )
            // InternalJoveNotes.g:5180:2: rule__Equation__SymbolsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Equation__SymbolsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getEquationAccess().getSymbolsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group_7__1__Impl"


    // $ANTLR start "rule__EqSymbol__Group__0"
    // InternalJoveNotes.g:5194:1: rule__EqSymbol__Group__0 : rule__EqSymbol__Group__0__Impl rule__EqSymbol__Group__1 ;
    public final void rule__EqSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5198:1: ( rule__EqSymbol__Group__0__Impl rule__EqSymbol__Group__1 )
            // InternalJoveNotes.g:5199:2: rule__EqSymbol__Group__0__Impl rule__EqSymbol__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__EqSymbol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqSymbol__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqSymbol__Group__0"


    // $ANTLR start "rule__EqSymbol__Group__0__Impl"
    // InternalJoveNotes.g:5206:1: rule__EqSymbol__Group__0__Impl : ( ( rule__EqSymbol__SymbolAssignment_0 ) ) ;
    public final void rule__EqSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5210:1: ( ( ( rule__EqSymbol__SymbolAssignment_0 ) ) )
            // InternalJoveNotes.g:5211:1: ( ( rule__EqSymbol__SymbolAssignment_0 ) )
            {
            // InternalJoveNotes.g:5211:1: ( ( rule__EqSymbol__SymbolAssignment_0 ) )
            // InternalJoveNotes.g:5212:1: ( rule__EqSymbol__SymbolAssignment_0 )
            {
             before(grammarAccess.getEqSymbolAccess().getSymbolAssignment_0()); 
            // InternalJoveNotes.g:5213:1: ( rule__EqSymbol__SymbolAssignment_0 )
            // InternalJoveNotes.g:5213:2: rule__EqSymbol__SymbolAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EqSymbol__SymbolAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEqSymbolAccess().getSymbolAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqSymbol__Group__0__Impl"


    // $ANTLR start "rule__EqSymbol__Group__1"
    // InternalJoveNotes.g:5223:1: rule__EqSymbol__Group__1 : rule__EqSymbol__Group__1__Impl rule__EqSymbol__Group__2 ;
    public final void rule__EqSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5227:1: ( rule__EqSymbol__Group__1__Impl rule__EqSymbol__Group__2 )
            // InternalJoveNotes.g:5228:2: rule__EqSymbol__Group__1__Impl rule__EqSymbol__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__EqSymbol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqSymbol__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqSymbol__Group__1"


    // $ANTLR start "rule__EqSymbol__Group__1__Impl"
    // InternalJoveNotes.g:5235:1: rule__EqSymbol__Group__1__Impl : ( '=' ) ;
    public final void rule__EqSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5239:1: ( ( '=' ) )
            // InternalJoveNotes.g:5240:1: ( '=' )
            {
            // InternalJoveNotes.g:5240:1: ( '=' )
            // InternalJoveNotes.g:5241:1: '='
            {
             before(grammarAccess.getEqSymbolAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEqSymbolAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqSymbol__Group__1__Impl"


    // $ANTLR start "rule__EqSymbol__Group__2"
    // InternalJoveNotes.g:5254:1: rule__EqSymbol__Group__2 : rule__EqSymbol__Group__2__Impl ;
    public final void rule__EqSymbol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5258:1: ( rule__EqSymbol__Group__2__Impl )
            // InternalJoveNotes.g:5259:2: rule__EqSymbol__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqSymbol__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqSymbol__Group__2"


    // $ANTLR start "rule__EqSymbol__Group__2__Impl"
    // InternalJoveNotes.g:5265:1: rule__EqSymbol__Group__2__Impl : ( ( rule__EqSymbol__DescriptionAssignment_2 ) ) ;
    public final void rule__EqSymbol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5269:1: ( ( ( rule__EqSymbol__DescriptionAssignment_2 ) ) )
            // InternalJoveNotes.g:5270:1: ( ( rule__EqSymbol__DescriptionAssignment_2 ) )
            {
            // InternalJoveNotes.g:5270:1: ( ( rule__EqSymbol__DescriptionAssignment_2 ) )
            // InternalJoveNotes.g:5271:1: ( rule__EqSymbol__DescriptionAssignment_2 )
            {
             before(grammarAccess.getEqSymbolAccess().getDescriptionAssignment_2()); 
            // InternalJoveNotes.g:5272:1: ( rule__EqSymbol__DescriptionAssignment_2 )
            // InternalJoveNotes.g:5272:2: rule__EqSymbol__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EqSymbol__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEqSymbolAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqSymbol__Group__2__Impl"


    // $ANTLR start "rule__RefToContext__Group__0"
    // InternalJoveNotes.g:5288:1: rule__RefToContext__Group__0 : rule__RefToContext__Group__0__Impl rule__RefToContext__Group__1 ;
    public final void rule__RefToContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5292:1: ( rule__RefToContext__Group__0__Impl rule__RefToContext__Group__1 )
            // InternalJoveNotes.g:5293:2: rule__RefToContext__Group__0__Impl rule__RefToContext__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__RefToContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefToContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__0"


    // $ANTLR start "rule__RefToContext__Group__0__Impl"
    // InternalJoveNotes.g:5300:1: rule__RefToContext__Group__0__Impl : ( '@rtc' ) ;
    public final void rule__RefToContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5304:1: ( ( '@rtc' ) )
            // InternalJoveNotes.g:5305:1: ( '@rtc' )
            {
            // InternalJoveNotes.g:5305:1: ( '@rtc' )
            // InternalJoveNotes.g:5306:1: '@rtc'
            {
             before(grammarAccess.getRefToContextAccess().getRtcKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRefToContextAccess().getRtcKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__0__Impl"


    // $ANTLR start "rule__RefToContext__Group__1"
    // InternalJoveNotes.g:5319:1: rule__RefToContext__Group__1 : rule__RefToContext__Group__1__Impl rule__RefToContext__Group__2 ;
    public final void rule__RefToContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5323:1: ( rule__RefToContext__Group__1__Impl rule__RefToContext__Group__2 )
            // InternalJoveNotes.g:5324:2: rule__RefToContext__Group__1__Impl rule__RefToContext__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__RefToContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefToContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__1"


    // $ANTLR start "rule__RefToContext__Group__1__Impl"
    // InternalJoveNotes.g:5331:1: rule__RefToContext__Group__1__Impl : ( ( rule__RefToContext__HideFromViewAssignment_1 )? ) ;
    public final void rule__RefToContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5335:1: ( ( ( rule__RefToContext__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:5336:1: ( ( rule__RefToContext__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:5336:1: ( ( rule__RefToContext__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:5337:1: ( rule__RefToContext__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getRefToContextAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:5338:1: ( rule__RefToContext__HideFromViewAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==60) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalJoveNotes.g:5338:2: rule__RefToContext__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RefToContext__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRefToContextAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__1__Impl"


    // $ANTLR start "rule__RefToContext__Group__2"
    // InternalJoveNotes.g:5348:1: rule__RefToContext__Group__2 : rule__RefToContext__Group__2__Impl rule__RefToContext__Group__3 ;
    public final void rule__RefToContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5352:1: ( rule__RefToContext__Group__2__Impl rule__RefToContext__Group__3 )
            // InternalJoveNotes.g:5353:2: rule__RefToContext__Group__2__Impl rule__RefToContext__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__RefToContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefToContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__2"


    // $ANTLR start "rule__RefToContext__Group__2__Impl"
    // InternalJoveNotes.g:5360:1: rule__RefToContext__Group__2__Impl : ( '{' ) ;
    public final void rule__RefToContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5364:1: ( ( '{' ) )
            // InternalJoveNotes.g:5365:1: ( '{' )
            {
            // InternalJoveNotes.g:5365:1: ( '{' )
            // InternalJoveNotes.g:5366:1: '{'
            {
             before(grammarAccess.getRefToContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRefToContextAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__2__Impl"


    // $ANTLR start "rule__RefToContext__Group__3"
    // InternalJoveNotes.g:5379:1: rule__RefToContext__Group__3 : rule__RefToContext__Group__3__Impl rule__RefToContext__Group__4 ;
    public final void rule__RefToContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5383:1: ( rule__RefToContext__Group__3__Impl rule__RefToContext__Group__4 )
            // InternalJoveNotes.g:5384:2: rule__RefToContext__Group__3__Impl rule__RefToContext__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__RefToContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefToContext__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__3"


    // $ANTLR start "rule__RefToContext__Group__3__Impl"
    // InternalJoveNotes.g:5391:1: rule__RefToContext__Group__3__Impl : ( 'context' ) ;
    public final void rule__RefToContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5395:1: ( ( 'context' ) )
            // InternalJoveNotes.g:5396:1: ( 'context' )
            {
            // InternalJoveNotes.g:5396:1: ( 'context' )
            // InternalJoveNotes.g:5397:1: 'context'
            {
             before(grammarAccess.getRefToContextAccess().getContextKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getRefToContextAccess().getContextKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__3__Impl"


    // $ANTLR start "rule__RefToContext__Group__4"
    // InternalJoveNotes.g:5410:1: rule__RefToContext__Group__4 : rule__RefToContext__Group__4__Impl rule__RefToContext__Group__5 ;
    public final void rule__RefToContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5414:1: ( rule__RefToContext__Group__4__Impl rule__RefToContext__Group__5 )
            // InternalJoveNotes.g:5415:2: rule__RefToContext__Group__4__Impl rule__RefToContext__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__RefToContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefToContext__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__4"


    // $ANTLR start "rule__RefToContext__Group__4__Impl"
    // InternalJoveNotes.g:5422:1: rule__RefToContext__Group__4__Impl : ( ( rule__RefToContext__ContextAssignment_4 ) ) ;
    public final void rule__RefToContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5426:1: ( ( ( rule__RefToContext__ContextAssignment_4 ) ) )
            // InternalJoveNotes.g:5427:1: ( ( rule__RefToContext__ContextAssignment_4 ) )
            {
            // InternalJoveNotes.g:5427:1: ( ( rule__RefToContext__ContextAssignment_4 ) )
            // InternalJoveNotes.g:5428:1: ( rule__RefToContext__ContextAssignment_4 )
            {
             before(grammarAccess.getRefToContextAccess().getContextAssignment_4()); 
            // InternalJoveNotes.g:5429:1: ( rule__RefToContext__ContextAssignment_4 )
            // InternalJoveNotes.g:5429:2: rule__RefToContext__ContextAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RefToContext__ContextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRefToContextAccess().getContextAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__4__Impl"


    // $ANTLR start "rule__RefToContext__Group__5"
    // InternalJoveNotes.g:5439:1: rule__RefToContext__Group__5 : rule__RefToContext__Group__5__Impl rule__RefToContext__Group__6 ;
    public final void rule__RefToContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5443:1: ( rule__RefToContext__Group__5__Impl rule__RefToContext__Group__6 )
            // InternalJoveNotes.g:5444:2: rule__RefToContext__Group__5__Impl rule__RefToContext__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__RefToContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefToContext__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__5"


    // $ANTLR start "rule__RefToContext__Group__5__Impl"
    // InternalJoveNotes.g:5451:1: rule__RefToContext__Group__5__Impl : ( ( ( rule__RefToContext__RtcElementAssignment_5 ) ) ( ( rule__RefToContext__RtcElementAssignment_5 )* ) ) ;
    public final void rule__RefToContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5455:1: ( ( ( ( rule__RefToContext__RtcElementAssignment_5 ) ) ( ( rule__RefToContext__RtcElementAssignment_5 )* ) ) )
            // InternalJoveNotes.g:5456:1: ( ( ( rule__RefToContext__RtcElementAssignment_5 ) ) ( ( rule__RefToContext__RtcElementAssignment_5 )* ) )
            {
            // InternalJoveNotes.g:5456:1: ( ( ( rule__RefToContext__RtcElementAssignment_5 ) ) ( ( rule__RefToContext__RtcElementAssignment_5 )* ) )
            // InternalJoveNotes.g:5457:1: ( ( rule__RefToContext__RtcElementAssignment_5 ) ) ( ( rule__RefToContext__RtcElementAssignment_5 )* )
            {
            // InternalJoveNotes.g:5457:1: ( ( rule__RefToContext__RtcElementAssignment_5 ) )
            // InternalJoveNotes.g:5458:1: ( rule__RefToContext__RtcElementAssignment_5 )
            {
             before(grammarAccess.getRefToContextAccess().getRtcElementAssignment_5()); 
            // InternalJoveNotes.g:5459:1: ( rule__RefToContext__RtcElementAssignment_5 )
            // InternalJoveNotes.g:5459:2: rule__RefToContext__RtcElementAssignment_5
            {
            pushFollow(FOLLOW_36);
            rule__RefToContext__RtcElementAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRefToContextAccess().getRtcElementAssignment_5()); 

            }

            // InternalJoveNotes.g:5462:1: ( ( rule__RefToContext__RtcElementAssignment_5 )* )
            // InternalJoveNotes.g:5463:1: ( rule__RefToContext__RtcElementAssignment_5 )*
            {
             before(grammarAccess.getRefToContextAccess().getRtcElementAssignment_5()); 
            // InternalJoveNotes.g:5464:1: ( rule__RefToContext__RtcElementAssignment_5 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=16 && LA46_0<=22)||(LA46_0>=31 && LA46_0<=33)||LA46_0==35||LA46_0==37||LA46_0==40||LA46_0==44) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalJoveNotes.g:5464:2: rule__RefToContext__RtcElementAssignment_5
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__RefToContext__RtcElementAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getRefToContextAccess().getRtcElementAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__5__Impl"


    // $ANTLR start "rule__RefToContext__Group__6"
    // InternalJoveNotes.g:5475:1: rule__RefToContext__Group__6 : rule__RefToContext__Group__6__Impl ;
    public final void rule__RefToContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5479:1: ( rule__RefToContext__Group__6__Impl )
            // InternalJoveNotes.g:5480:2: rule__RefToContext__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefToContext__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__6"


    // $ANTLR start "rule__RefToContext__Group__6__Impl"
    // InternalJoveNotes.g:5486:1: rule__RefToContext__Group__6__Impl : ( '}' ) ;
    public final void rule__RefToContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5490:1: ( ( '}' ) )
            // InternalJoveNotes.g:5491:1: ( '}' )
            {
            // InternalJoveNotes.g:5491:1: ( '}' )
            // InternalJoveNotes.g:5492:1: '}'
            {
             before(grammarAccess.getRefToContextAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRefToContextAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__6__Impl"


    // $ANTLR start "rule__MultiChoice__Group__0"
    // InternalJoveNotes.g:5519:1: rule__MultiChoice__Group__0 : rule__MultiChoice__Group__0__Impl rule__MultiChoice__Group__1 ;
    public final void rule__MultiChoice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5523:1: ( rule__MultiChoice__Group__0__Impl rule__MultiChoice__Group__1 )
            // InternalJoveNotes.g:5524:2: rule__MultiChoice__Group__0__Impl rule__MultiChoice__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__MultiChoice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__0"


    // $ANTLR start "rule__MultiChoice__Group__0__Impl"
    // InternalJoveNotes.g:5531:1: rule__MultiChoice__Group__0__Impl : ( '@multi_choice' ) ;
    public final void rule__MultiChoice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5535:1: ( ( '@multi_choice' ) )
            // InternalJoveNotes.g:5536:1: ( '@multi_choice' )
            {
            // InternalJoveNotes.g:5536:1: ( '@multi_choice' )
            // InternalJoveNotes.g:5537:1: '@multi_choice'
            {
             before(grammarAccess.getMultiChoiceAccess().getMulti_choiceKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceAccess().getMulti_choiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__0__Impl"


    // $ANTLR start "rule__MultiChoice__Group__1"
    // InternalJoveNotes.g:5550:1: rule__MultiChoice__Group__1 : rule__MultiChoice__Group__1__Impl rule__MultiChoice__Group__2 ;
    public final void rule__MultiChoice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5554:1: ( rule__MultiChoice__Group__1__Impl rule__MultiChoice__Group__2 )
            // InternalJoveNotes.g:5555:2: rule__MultiChoice__Group__1__Impl rule__MultiChoice__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__MultiChoice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__1"


    // $ANTLR start "rule__MultiChoice__Group__1__Impl"
    // InternalJoveNotes.g:5562:1: rule__MultiChoice__Group__1__Impl : ( ( rule__MultiChoice__HideFromViewAssignment_1 )? ) ;
    public final void rule__MultiChoice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5566:1: ( ( ( rule__MultiChoice__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:5567:1: ( ( rule__MultiChoice__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:5567:1: ( ( rule__MultiChoice__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:5568:1: ( rule__MultiChoice__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getMultiChoiceAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:5569:1: ( rule__MultiChoice__HideFromViewAssignment_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==60) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalJoveNotes.g:5569:2: rule__MultiChoice__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiChoice__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiChoiceAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__1__Impl"


    // $ANTLR start "rule__MultiChoice__Group__2"
    // InternalJoveNotes.g:5579:1: rule__MultiChoice__Group__2 : rule__MultiChoice__Group__2__Impl rule__MultiChoice__Group__3 ;
    public final void rule__MultiChoice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5583:1: ( rule__MultiChoice__Group__2__Impl rule__MultiChoice__Group__3 )
            // InternalJoveNotes.g:5584:2: rule__MultiChoice__Group__2__Impl rule__MultiChoice__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__MultiChoice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__2"


    // $ANTLR start "rule__MultiChoice__Group__2__Impl"
    // InternalJoveNotes.g:5591:1: rule__MultiChoice__Group__2__Impl : ( ( rule__MultiChoice__QuestionAssignment_2 ) ) ;
    public final void rule__MultiChoice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5595:1: ( ( ( rule__MultiChoice__QuestionAssignment_2 ) ) )
            // InternalJoveNotes.g:5596:1: ( ( rule__MultiChoice__QuestionAssignment_2 ) )
            {
            // InternalJoveNotes.g:5596:1: ( ( rule__MultiChoice__QuestionAssignment_2 ) )
            // InternalJoveNotes.g:5597:1: ( rule__MultiChoice__QuestionAssignment_2 )
            {
             before(grammarAccess.getMultiChoiceAccess().getQuestionAssignment_2()); 
            // InternalJoveNotes.g:5598:1: ( rule__MultiChoice__QuestionAssignment_2 )
            // InternalJoveNotes.g:5598:2: rule__MultiChoice__QuestionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoice__QuestionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceAccess().getQuestionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__2__Impl"


    // $ANTLR start "rule__MultiChoice__Group__3"
    // InternalJoveNotes.g:5608:1: rule__MultiChoice__Group__3 : rule__MultiChoice__Group__3__Impl rule__MultiChoice__Group__4 ;
    public final void rule__MultiChoice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5612:1: ( rule__MultiChoice__Group__3__Impl rule__MultiChoice__Group__4 )
            // InternalJoveNotes.g:5613:2: rule__MultiChoice__Group__3__Impl rule__MultiChoice__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__MultiChoice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__3"


    // $ANTLR start "rule__MultiChoice__Group__3__Impl"
    // InternalJoveNotes.g:5620:1: rule__MultiChoice__Group__3__Impl : ( '{' ) ;
    public final void rule__MultiChoice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5624:1: ( ( '{' ) )
            // InternalJoveNotes.g:5625:1: ( '{' )
            {
            // InternalJoveNotes.g:5625:1: ( '{' )
            // InternalJoveNotes.g:5626:1: '{'
            {
             before(grammarAccess.getMultiChoiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__3__Impl"


    // $ANTLR start "rule__MultiChoice__Group__4"
    // InternalJoveNotes.g:5639:1: rule__MultiChoice__Group__4 : rule__MultiChoice__Group__4__Impl rule__MultiChoice__Group__5 ;
    public final void rule__MultiChoice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5643:1: ( rule__MultiChoice__Group__4__Impl rule__MultiChoice__Group__5 )
            // InternalJoveNotes.g:5644:2: rule__MultiChoice__Group__4__Impl rule__MultiChoice__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__MultiChoice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__4"


    // $ANTLR start "rule__MultiChoice__Group__4__Impl"
    // InternalJoveNotes.g:5651:1: rule__MultiChoice__Group__4__Impl : ( '@options' ) ;
    public final void rule__MultiChoice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5655:1: ( ( '@options' ) )
            // InternalJoveNotes.g:5656:1: ( '@options' )
            {
            // InternalJoveNotes.g:5656:1: ( '@options' )
            // InternalJoveNotes.g:5657:1: '@options'
            {
             before(grammarAccess.getMultiChoiceAccess().getOptionsKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceAccess().getOptionsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__4__Impl"


    // $ANTLR start "rule__MultiChoice__Group__5"
    // InternalJoveNotes.g:5670:1: rule__MultiChoice__Group__5 : rule__MultiChoice__Group__5__Impl rule__MultiChoice__Group__6 ;
    public final void rule__MultiChoice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5674:1: ( rule__MultiChoice__Group__5__Impl rule__MultiChoice__Group__6 )
            // InternalJoveNotes.g:5675:2: rule__MultiChoice__Group__5__Impl rule__MultiChoice__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__MultiChoice__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__5"


    // $ANTLR start "rule__MultiChoice__Group__5__Impl"
    // InternalJoveNotes.g:5682:1: rule__MultiChoice__Group__5__Impl : ( '{' ) ;
    public final void rule__MultiChoice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5686:1: ( ( '{' ) )
            // InternalJoveNotes.g:5687:1: ( '{' )
            {
            // InternalJoveNotes.g:5687:1: ( '{' )
            // InternalJoveNotes.g:5688:1: '{'
            {
             before(grammarAccess.getMultiChoiceAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__5__Impl"


    // $ANTLR start "rule__MultiChoice__Group__6"
    // InternalJoveNotes.g:5701:1: rule__MultiChoice__Group__6 : rule__MultiChoice__Group__6__Impl rule__MultiChoice__Group__7 ;
    public final void rule__MultiChoice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5705:1: ( rule__MultiChoice__Group__6__Impl rule__MultiChoice__Group__7 )
            // InternalJoveNotes.g:5706:2: rule__MultiChoice__Group__6__Impl rule__MultiChoice__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__MultiChoice__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__6"


    // $ANTLR start "rule__MultiChoice__Group__6__Impl"
    // InternalJoveNotes.g:5713:1: rule__MultiChoice__Group__6__Impl : ( ( rule__MultiChoice__OptionsAssignment_6 ) ) ;
    public final void rule__MultiChoice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5717:1: ( ( ( rule__MultiChoice__OptionsAssignment_6 ) ) )
            // InternalJoveNotes.g:5718:1: ( ( rule__MultiChoice__OptionsAssignment_6 ) )
            {
            // InternalJoveNotes.g:5718:1: ( ( rule__MultiChoice__OptionsAssignment_6 ) )
            // InternalJoveNotes.g:5719:1: ( rule__MultiChoice__OptionsAssignment_6 )
            {
             before(grammarAccess.getMultiChoiceAccess().getOptionsAssignment_6()); 
            // InternalJoveNotes.g:5720:1: ( rule__MultiChoice__OptionsAssignment_6 )
            // InternalJoveNotes.g:5720:2: rule__MultiChoice__OptionsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoice__OptionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceAccess().getOptionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__6__Impl"


    // $ANTLR start "rule__MultiChoice__Group__7"
    // InternalJoveNotes.g:5730:1: rule__MultiChoice__Group__7 : rule__MultiChoice__Group__7__Impl rule__MultiChoice__Group__8 ;
    public final void rule__MultiChoice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5734:1: ( rule__MultiChoice__Group__7__Impl rule__MultiChoice__Group__8 )
            // InternalJoveNotes.g:5735:2: rule__MultiChoice__Group__7__Impl rule__MultiChoice__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__MultiChoice__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__7"


    // $ANTLR start "rule__MultiChoice__Group__7__Impl"
    // InternalJoveNotes.g:5742:1: rule__MultiChoice__Group__7__Impl : ( ( rule__MultiChoice__Group_7__0 )* ) ;
    public final void rule__MultiChoice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5746:1: ( ( ( rule__MultiChoice__Group_7__0 )* ) )
            // InternalJoveNotes.g:5747:1: ( ( rule__MultiChoice__Group_7__0 )* )
            {
            // InternalJoveNotes.g:5747:1: ( ( rule__MultiChoice__Group_7__0 )* )
            // InternalJoveNotes.g:5748:1: ( rule__MultiChoice__Group_7__0 )*
            {
             before(grammarAccess.getMultiChoiceAccess().getGroup_7()); 
            // InternalJoveNotes.g:5749:1: ( rule__MultiChoice__Group_7__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==39) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalJoveNotes.g:5749:2: rule__MultiChoice__Group_7__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__MultiChoice__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getMultiChoiceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__7__Impl"


    // $ANTLR start "rule__MultiChoice__Group__8"
    // InternalJoveNotes.g:5759:1: rule__MultiChoice__Group__8 : rule__MultiChoice__Group__8__Impl rule__MultiChoice__Group__9 ;
    public final void rule__MultiChoice__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5763:1: ( rule__MultiChoice__Group__8__Impl rule__MultiChoice__Group__9 )
            // InternalJoveNotes.g:5764:2: rule__MultiChoice__Group__8__Impl rule__MultiChoice__Group__9
            {
            pushFollow(FOLLOW_38);
            rule__MultiChoice__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__8"


    // $ANTLR start "rule__MultiChoice__Group__8__Impl"
    // InternalJoveNotes.g:5771:1: rule__MultiChoice__Group__8__Impl : ( '}' ) ;
    public final void rule__MultiChoice__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5775:1: ( ( '}' ) )
            // InternalJoveNotes.g:5776:1: ( '}' )
            {
            // InternalJoveNotes.g:5776:1: ( '}' )
            // InternalJoveNotes.g:5777:1: '}'
            {
             before(grammarAccess.getMultiChoiceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__8__Impl"


    // $ANTLR start "rule__MultiChoice__Group__9"
    // InternalJoveNotes.g:5790:1: rule__MultiChoice__Group__9 : rule__MultiChoice__Group__9__Impl rule__MultiChoice__Group__10 ;
    public final void rule__MultiChoice__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5794:1: ( rule__MultiChoice__Group__9__Impl rule__MultiChoice__Group__10 )
            // InternalJoveNotes.g:5795:2: rule__MultiChoice__Group__9__Impl rule__MultiChoice__Group__10
            {
            pushFollow(FOLLOW_38);
            rule__MultiChoice__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__9"


    // $ANTLR start "rule__MultiChoice__Group__9__Impl"
    // InternalJoveNotes.g:5802:1: rule__MultiChoice__Group__9__Impl : ( ( rule__MultiChoice__Group_9__0 )? ) ;
    public final void rule__MultiChoice__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5806:1: ( ( ( rule__MultiChoice__Group_9__0 )? ) )
            // InternalJoveNotes.g:5807:1: ( ( rule__MultiChoice__Group_9__0 )? )
            {
            // InternalJoveNotes.g:5807:1: ( ( rule__MultiChoice__Group_9__0 )? )
            // InternalJoveNotes.g:5808:1: ( rule__MultiChoice__Group_9__0 )?
            {
             before(grammarAccess.getMultiChoiceAccess().getGroup_9()); 
            // InternalJoveNotes.g:5809:1: ( rule__MultiChoice__Group_9__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==29) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalJoveNotes.g:5809:2: rule__MultiChoice__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiChoice__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiChoiceAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__9__Impl"


    // $ANTLR start "rule__MultiChoice__Group__10"
    // InternalJoveNotes.g:5819:1: rule__MultiChoice__Group__10 : rule__MultiChoice__Group__10__Impl rule__MultiChoice__Group__11 ;
    public final void rule__MultiChoice__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5823:1: ( rule__MultiChoice__Group__10__Impl rule__MultiChoice__Group__11 )
            // InternalJoveNotes.g:5824:2: rule__MultiChoice__Group__10__Impl rule__MultiChoice__Group__11
            {
            pushFollow(FOLLOW_38);
            rule__MultiChoice__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__10"


    // $ANTLR start "rule__MultiChoice__Group__10__Impl"
    // InternalJoveNotes.g:5831:1: rule__MultiChoice__Group__10__Impl : ( ( rule__MultiChoice__Group_10__0 )? ) ;
    public final void rule__MultiChoice__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5835:1: ( ( ( rule__MultiChoice__Group_10__0 )? ) )
            // InternalJoveNotes.g:5836:1: ( ( rule__MultiChoice__Group_10__0 )? )
            {
            // InternalJoveNotes.g:5836:1: ( ( rule__MultiChoice__Group_10__0 )? )
            // InternalJoveNotes.g:5837:1: ( rule__MultiChoice__Group_10__0 )?
            {
             before(grammarAccess.getMultiChoiceAccess().getGroup_10()); 
            // InternalJoveNotes.g:5838:1: ( rule__MultiChoice__Group_10__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==30) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalJoveNotes.g:5838:2: rule__MultiChoice__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiChoice__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiChoiceAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__10__Impl"


    // $ANTLR start "rule__MultiChoice__Group__11"
    // InternalJoveNotes.g:5848:1: rule__MultiChoice__Group__11 : rule__MultiChoice__Group__11__Impl rule__MultiChoice__Group__12 ;
    public final void rule__MultiChoice__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5852:1: ( rule__MultiChoice__Group__11__Impl rule__MultiChoice__Group__12 )
            // InternalJoveNotes.g:5853:2: rule__MultiChoice__Group__11__Impl rule__MultiChoice__Group__12
            {
            pushFollow(FOLLOW_38);
            rule__MultiChoice__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__11"


    // $ANTLR start "rule__MultiChoice__Group__11__Impl"
    // InternalJoveNotes.g:5860:1: rule__MultiChoice__Group__11__Impl : ( ( rule__MultiChoice__Group_11__0 )? ) ;
    public final void rule__MultiChoice__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5864:1: ( ( ( rule__MultiChoice__Group_11__0 )? ) )
            // InternalJoveNotes.g:5865:1: ( ( rule__MultiChoice__Group_11__0 )? )
            {
            // InternalJoveNotes.g:5865:1: ( ( rule__MultiChoice__Group_11__0 )? )
            // InternalJoveNotes.g:5866:1: ( rule__MultiChoice__Group_11__0 )?
            {
             before(grammarAccess.getMultiChoiceAccess().getGroup_11()); 
            // InternalJoveNotes.g:5867:1: ( rule__MultiChoice__Group_11__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==46) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalJoveNotes.g:5867:2: rule__MultiChoice__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiChoice__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiChoiceAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__11__Impl"


    // $ANTLR start "rule__MultiChoice__Group__12"
    // InternalJoveNotes.g:5877:1: rule__MultiChoice__Group__12 : rule__MultiChoice__Group__12__Impl ;
    public final void rule__MultiChoice__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5881:1: ( rule__MultiChoice__Group__12__Impl )
            // InternalJoveNotes.g:5882:2: rule__MultiChoice__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__12"


    // $ANTLR start "rule__MultiChoice__Group__12__Impl"
    // InternalJoveNotes.g:5888:1: rule__MultiChoice__Group__12__Impl : ( '}' ) ;
    public final void rule__MultiChoice__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5892:1: ( ( '}' ) )
            // InternalJoveNotes.g:5893:1: ( '}' )
            {
            // InternalJoveNotes.g:5893:1: ( '}' )
            // InternalJoveNotes.g:5894:1: '}'
            {
             before(grammarAccess.getMultiChoiceAccess().getRightCurlyBracketKeyword_12()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__12__Impl"


    // $ANTLR start "rule__MultiChoice__Group_7__0"
    // InternalJoveNotes.g:5933:1: rule__MultiChoice__Group_7__0 : rule__MultiChoice__Group_7__0__Impl rule__MultiChoice__Group_7__1 ;
    public final void rule__MultiChoice__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5937:1: ( rule__MultiChoice__Group_7__0__Impl rule__MultiChoice__Group_7__1 )
            // InternalJoveNotes.g:5938:2: rule__MultiChoice__Group_7__0__Impl rule__MultiChoice__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__MultiChoice__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_7__0"


    // $ANTLR start "rule__MultiChoice__Group_7__0__Impl"
    // InternalJoveNotes.g:5945:1: rule__MultiChoice__Group_7__0__Impl : ( ',' ) ;
    public final void rule__MultiChoice__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5949:1: ( ( ',' ) )
            // InternalJoveNotes.g:5950:1: ( ',' )
            {
            // InternalJoveNotes.g:5950:1: ( ',' )
            // InternalJoveNotes.g:5951:1: ','
            {
             before(grammarAccess.getMultiChoiceAccess().getCommaKeyword_7_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_7__0__Impl"


    // $ANTLR start "rule__MultiChoice__Group_7__1"
    // InternalJoveNotes.g:5964:1: rule__MultiChoice__Group_7__1 : rule__MultiChoice__Group_7__1__Impl ;
    public final void rule__MultiChoice__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5968:1: ( rule__MultiChoice__Group_7__1__Impl )
            // InternalJoveNotes.g:5969:2: rule__MultiChoice__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_7__1"


    // $ANTLR start "rule__MultiChoice__Group_7__1__Impl"
    // InternalJoveNotes.g:5975:1: rule__MultiChoice__Group_7__1__Impl : ( ( rule__MultiChoice__OptionsAssignment_7_1 ) ) ;
    public final void rule__MultiChoice__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5979:1: ( ( ( rule__MultiChoice__OptionsAssignment_7_1 ) ) )
            // InternalJoveNotes.g:5980:1: ( ( rule__MultiChoice__OptionsAssignment_7_1 ) )
            {
            // InternalJoveNotes.g:5980:1: ( ( rule__MultiChoice__OptionsAssignment_7_1 ) )
            // InternalJoveNotes.g:5981:1: ( rule__MultiChoice__OptionsAssignment_7_1 )
            {
             before(grammarAccess.getMultiChoiceAccess().getOptionsAssignment_7_1()); 
            // InternalJoveNotes.g:5982:1: ( rule__MultiChoice__OptionsAssignment_7_1 )
            // InternalJoveNotes.g:5982:2: rule__MultiChoice__OptionsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoice__OptionsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceAccess().getOptionsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_7__1__Impl"


    // $ANTLR start "rule__MultiChoice__Group_9__0"
    // InternalJoveNotes.g:5996:1: rule__MultiChoice__Group_9__0 : rule__MultiChoice__Group_9__0__Impl rule__MultiChoice__Group_9__1 ;
    public final void rule__MultiChoice__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6000:1: ( rule__MultiChoice__Group_9__0__Impl rule__MultiChoice__Group_9__1 )
            // InternalJoveNotes.g:6001:2: rule__MultiChoice__Group_9__0__Impl rule__MultiChoice__Group_9__1
            {
            pushFollow(FOLLOW_9);
            rule__MultiChoice__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_9__0"


    // $ANTLR start "rule__MultiChoice__Group_9__0__Impl"
    // InternalJoveNotes.g:6008:1: rule__MultiChoice__Group_9__0__Impl : ( '@numOptionsToShow' ) ;
    public final void rule__MultiChoice__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6012:1: ( ( '@numOptionsToShow' ) )
            // InternalJoveNotes.g:6013:1: ( '@numOptionsToShow' )
            {
            // InternalJoveNotes.g:6013:1: ( '@numOptionsToShow' )
            // InternalJoveNotes.g:6014:1: '@numOptionsToShow'
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsToShowKeyword_9_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceAccess().getNumOptionsToShowKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_9__0__Impl"


    // $ANTLR start "rule__MultiChoice__Group_9__1"
    // InternalJoveNotes.g:6027:1: rule__MultiChoice__Group_9__1 : rule__MultiChoice__Group_9__1__Impl ;
    public final void rule__MultiChoice__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6031:1: ( rule__MultiChoice__Group_9__1__Impl )
            // InternalJoveNotes.g:6032:2: rule__MultiChoice__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_9__1"


    // $ANTLR start "rule__MultiChoice__Group_9__1__Impl"
    // InternalJoveNotes.g:6038:1: rule__MultiChoice__Group_9__1__Impl : ( ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 ) ) ;
    public final void rule__MultiChoice__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6042:1: ( ( ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 ) ) )
            // InternalJoveNotes.g:6043:1: ( ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 ) )
            {
            // InternalJoveNotes.g:6043:1: ( ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 ) )
            // InternalJoveNotes.g:6044:1: ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 )
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsToShowAssignment_9_1()); 
            // InternalJoveNotes.g:6045:1: ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 )
            // InternalJoveNotes.g:6045:2: rule__MultiChoice__NumOptionsToShowAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoice__NumOptionsToShowAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceAccess().getNumOptionsToShowAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_9__1__Impl"


    // $ANTLR start "rule__MultiChoice__Group_10__0"
    // InternalJoveNotes.g:6059:1: rule__MultiChoice__Group_10__0 : rule__MultiChoice__Group_10__0__Impl rule__MultiChoice__Group_10__1 ;
    public final void rule__MultiChoice__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6063:1: ( rule__MultiChoice__Group_10__0__Impl rule__MultiChoice__Group_10__1 )
            // InternalJoveNotes.g:6064:2: rule__MultiChoice__Group_10__0__Impl rule__MultiChoice__Group_10__1
            {
            pushFollow(FOLLOW_9);
            rule__MultiChoice__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_10__0"


    // $ANTLR start "rule__MultiChoice__Group_10__0__Impl"
    // InternalJoveNotes.g:6071:1: rule__MultiChoice__Group_10__0__Impl : ( '@numOptionsPerRow' ) ;
    public final void rule__MultiChoice__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6075:1: ( ( '@numOptionsPerRow' ) )
            // InternalJoveNotes.g:6076:1: ( '@numOptionsPerRow' )
            {
            // InternalJoveNotes.g:6076:1: ( '@numOptionsPerRow' )
            // InternalJoveNotes.g:6077:1: '@numOptionsPerRow'
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowKeyword_10_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_10__0__Impl"


    // $ANTLR start "rule__MultiChoice__Group_10__1"
    // InternalJoveNotes.g:6090:1: rule__MultiChoice__Group_10__1 : rule__MultiChoice__Group_10__1__Impl ;
    public final void rule__MultiChoice__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6094:1: ( rule__MultiChoice__Group_10__1__Impl )
            // InternalJoveNotes.g:6095:2: rule__MultiChoice__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_10__1"


    // $ANTLR start "rule__MultiChoice__Group_10__1__Impl"
    // InternalJoveNotes.g:6101:1: rule__MultiChoice__Group_10__1__Impl : ( ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 ) ) ;
    public final void rule__MultiChoice__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6105:1: ( ( ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 ) ) )
            // InternalJoveNotes.g:6106:1: ( ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 ) )
            {
            // InternalJoveNotes.g:6106:1: ( ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 ) )
            // InternalJoveNotes.g:6107:1: ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 )
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowAssignment_10_1()); 
            // InternalJoveNotes.g:6108:1: ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 )
            // InternalJoveNotes.g:6108:2: rule__MultiChoice__NumOptionsPerRowAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoice__NumOptionsPerRowAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_10__1__Impl"


    // $ANTLR start "rule__MultiChoice__Group_11__0"
    // InternalJoveNotes.g:6122:1: rule__MultiChoice__Group_11__0 : rule__MultiChoice__Group_11__0__Impl rule__MultiChoice__Group_11__1 ;
    public final void rule__MultiChoice__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6126:1: ( rule__MultiChoice__Group_11__0__Impl rule__MultiChoice__Group_11__1 )
            // InternalJoveNotes.g:6127:2: rule__MultiChoice__Group_11__0__Impl rule__MultiChoice__Group_11__1
            {
            pushFollow(FOLLOW_7);
            rule__MultiChoice__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_11__0"


    // $ANTLR start "rule__MultiChoice__Group_11__0__Impl"
    // InternalJoveNotes.g:6134:1: rule__MultiChoice__Group_11__0__Impl : ( '@explanation' ) ;
    public final void rule__MultiChoice__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6138:1: ( ( '@explanation' ) )
            // InternalJoveNotes.g:6139:1: ( '@explanation' )
            {
            // InternalJoveNotes.g:6139:1: ( '@explanation' )
            // InternalJoveNotes.g:6140:1: '@explanation'
            {
             before(grammarAccess.getMultiChoiceAccess().getExplanationKeyword_11_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceAccess().getExplanationKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_11__0__Impl"


    // $ANTLR start "rule__MultiChoice__Group_11__1"
    // InternalJoveNotes.g:6153:1: rule__MultiChoice__Group_11__1 : rule__MultiChoice__Group_11__1__Impl ;
    public final void rule__MultiChoice__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6157:1: ( rule__MultiChoice__Group_11__1__Impl )
            // InternalJoveNotes.g:6158:2: rule__MultiChoice__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoice__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_11__1"


    // $ANTLR start "rule__MultiChoice__Group_11__1__Impl"
    // InternalJoveNotes.g:6164:1: rule__MultiChoice__Group_11__1__Impl : ( ( rule__MultiChoice__ExplanationAssignment_11_1 ) ) ;
    public final void rule__MultiChoice__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6168:1: ( ( ( rule__MultiChoice__ExplanationAssignment_11_1 ) ) )
            // InternalJoveNotes.g:6169:1: ( ( rule__MultiChoice__ExplanationAssignment_11_1 ) )
            {
            // InternalJoveNotes.g:6169:1: ( ( rule__MultiChoice__ExplanationAssignment_11_1 ) )
            // InternalJoveNotes.g:6170:1: ( rule__MultiChoice__ExplanationAssignment_11_1 )
            {
             before(grammarAccess.getMultiChoiceAccess().getExplanationAssignment_11_1()); 
            // InternalJoveNotes.g:6171:1: ( rule__MultiChoice__ExplanationAssignment_11_1 )
            // InternalJoveNotes.g:6171:2: rule__MultiChoice__ExplanationAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiChoice__ExplanationAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceAccess().getExplanationAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_11__1__Impl"


    // $ANTLR start "rule__Exercise__Group__0"
    // InternalJoveNotes.g:6185:1: rule__Exercise__Group__0 : rule__Exercise__Group__0__Impl rule__Exercise__Group__1 ;
    public final void rule__Exercise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6189:1: ( rule__Exercise__Group__0__Impl rule__Exercise__Group__1 )
            // InternalJoveNotes.g:6190:2: rule__Exercise__Group__0__Impl rule__Exercise__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Exercise__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__0"


    // $ANTLR start "rule__Exercise__Group__0__Impl"
    // InternalJoveNotes.g:6197:1: rule__Exercise__Group__0__Impl : ( '@exercise' ) ;
    public final void rule__Exercise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6201:1: ( ( '@exercise' ) )
            // InternalJoveNotes.g:6202:1: ( '@exercise' )
            {
            // InternalJoveNotes.g:6202:1: ( '@exercise' )
            // InternalJoveNotes.g:6203:1: '@exercise'
            {
             before(grammarAccess.getExerciseAccess().getExerciseKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getExerciseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__0__Impl"


    // $ANTLR start "rule__Exercise__Group__1"
    // InternalJoveNotes.g:6216:1: rule__Exercise__Group__1 : rule__Exercise__Group__1__Impl rule__Exercise__Group__2 ;
    public final void rule__Exercise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6220:1: ( rule__Exercise__Group__1__Impl rule__Exercise__Group__2 )
            // InternalJoveNotes.g:6221:2: rule__Exercise__Group__1__Impl rule__Exercise__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Exercise__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__1"


    // $ANTLR start "rule__Exercise__Group__1__Impl"
    // InternalJoveNotes.g:6228:1: rule__Exercise__Group__1__Impl : ( ( rule__Exercise__HideFromViewAssignment_1 )? ) ;
    public final void rule__Exercise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6232:1: ( ( ( rule__Exercise__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:6233:1: ( ( rule__Exercise__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:6233:1: ( ( rule__Exercise__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:6234:1: ( rule__Exercise__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getExerciseAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:6235:1: ( rule__Exercise__HideFromViewAssignment_1 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==60) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalJoveNotes.g:6235:2: rule__Exercise__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exercise__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExerciseAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__1__Impl"


    // $ANTLR start "rule__Exercise__Group__2"
    // InternalJoveNotes.g:6245:1: rule__Exercise__Group__2 : rule__Exercise__Group__2__Impl rule__Exercise__Group__3 ;
    public final void rule__Exercise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6249:1: ( rule__Exercise__Group__2__Impl rule__Exercise__Group__3 )
            // InternalJoveNotes.g:6250:2: rule__Exercise__Group__2__Impl rule__Exercise__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Exercise__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__2"


    // $ANTLR start "rule__Exercise__Group__2__Impl"
    // InternalJoveNotes.g:6257:1: rule__Exercise__Group__2__Impl : ( ( rule__Exercise__Group_2__0 ) ) ;
    public final void rule__Exercise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6261:1: ( ( ( rule__Exercise__Group_2__0 ) ) )
            // InternalJoveNotes.g:6262:1: ( ( rule__Exercise__Group_2__0 ) )
            {
            // InternalJoveNotes.g:6262:1: ( ( rule__Exercise__Group_2__0 ) )
            // InternalJoveNotes.g:6263:1: ( rule__Exercise__Group_2__0 )
            {
             before(grammarAccess.getExerciseAccess().getGroup_2()); 
            // InternalJoveNotes.g:6264:1: ( rule__Exercise__Group_2__0 )
            // InternalJoveNotes.g:6264:2: rule__Exercise__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__2__Impl"


    // $ANTLR start "rule__Exercise__Group__3"
    // InternalJoveNotes.g:6274:1: rule__Exercise__Group__3 : rule__Exercise__Group__3__Impl rule__Exercise__Group__4 ;
    public final void rule__Exercise__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6278:1: ( rule__Exercise__Group__3__Impl rule__Exercise__Group__4 )
            // InternalJoveNotes.g:6279:2: rule__Exercise__Group__3__Impl rule__Exercise__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__Exercise__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__3"


    // $ANTLR start "rule__Exercise__Group__3__Impl"
    // InternalJoveNotes.g:6286:1: rule__Exercise__Group__3__Impl : ( ( rule__Exercise__QuestionAssignment_3 ) ) ;
    public final void rule__Exercise__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6290:1: ( ( ( rule__Exercise__QuestionAssignment_3 ) ) )
            // InternalJoveNotes.g:6291:1: ( ( rule__Exercise__QuestionAssignment_3 ) )
            {
            // InternalJoveNotes.g:6291:1: ( ( rule__Exercise__QuestionAssignment_3 ) )
            // InternalJoveNotes.g:6292:1: ( rule__Exercise__QuestionAssignment_3 )
            {
             before(grammarAccess.getExerciseAccess().getQuestionAssignment_3()); 
            // InternalJoveNotes.g:6293:1: ( rule__Exercise__QuestionAssignment_3 )
            // InternalJoveNotes.g:6293:2: rule__Exercise__QuestionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__QuestionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getQuestionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__3__Impl"


    // $ANTLR start "rule__Exercise__Group__4"
    // InternalJoveNotes.g:6303:1: rule__Exercise__Group__4 : rule__Exercise__Group__4__Impl rule__Exercise__Group__5 ;
    public final void rule__Exercise__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6307:1: ( rule__Exercise__Group__4__Impl rule__Exercise__Group__5 )
            // InternalJoveNotes.g:6308:2: rule__Exercise__Group__4__Impl rule__Exercise__Group__5
            {
            pushFollow(FOLLOW_40);
            rule__Exercise__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__4"


    // $ANTLR start "rule__Exercise__Group__4__Impl"
    // InternalJoveNotes.g:6315:1: rule__Exercise__Group__4__Impl : ( ( rule__Exercise__Group_4__0 )? ) ;
    public final void rule__Exercise__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6319:1: ( ( ( rule__Exercise__Group_4__0 )? ) )
            // InternalJoveNotes.g:6320:1: ( ( rule__Exercise__Group_4__0 )? )
            {
            // InternalJoveNotes.g:6320:1: ( ( rule__Exercise__Group_4__0 )? )
            // InternalJoveNotes.g:6321:1: ( rule__Exercise__Group_4__0 )?
            {
             before(grammarAccess.getExerciseAccess().getGroup_4()); 
            // InternalJoveNotes.g:6322:1: ( rule__Exercise__Group_4__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==49) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalJoveNotes.g:6322:2: rule__Exercise__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exercise__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExerciseAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__4__Impl"


    // $ANTLR start "rule__Exercise__Group__5"
    // InternalJoveNotes.g:6332:1: rule__Exercise__Group__5 : rule__Exercise__Group__5__Impl ;
    public final void rule__Exercise__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6336:1: ( rule__Exercise__Group__5__Impl )
            // InternalJoveNotes.g:6337:2: rule__Exercise__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__5"


    // $ANTLR start "rule__Exercise__Group__5__Impl"
    // InternalJoveNotes.g:6343:1: rule__Exercise__Group__5__Impl : ( ( rule__Exercise__Group_5__0 ) ) ;
    public final void rule__Exercise__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6347:1: ( ( ( rule__Exercise__Group_5__0 ) ) )
            // InternalJoveNotes.g:6348:1: ( ( rule__Exercise__Group_5__0 ) )
            {
            // InternalJoveNotes.g:6348:1: ( ( rule__Exercise__Group_5__0 ) )
            // InternalJoveNotes.g:6349:1: ( rule__Exercise__Group_5__0 )
            {
             before(grammarAccess.getExerciseAccess().getGroup_5()); 
            // InternalJoveNotes.g:6350:1: ( rule__Exercise__Group_5__0 )
            // InternalJoveNotes.g:6350:2: rule__Exercise__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__5__Impl"


    // $ANTLR start "rule__Exercise__Group_2__0"
    // InternalJoveNotes.g:6372:1: rule__Exercise__Group_2__0 : rule__Exercise__Group_2__0__Impl rule__Exercise__Group_2__1 ;
    public final void rule__Exercise__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6376:1: ( rule__Exercise__Group_2__0__Impl rule__Exercise__Group_2__1 )
            // InternalJoveNotes.g:6377:2: rule__Exercise__Group_2__0__Impl rule__Exercise__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Exercise__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_2__0"


    // $ANTLR start "rule__Exercise__Group_2__0__Impl"
    // InternalJoveNotes.g:6384:1: rule__Exercise__Group_2__0__Impl : ( 'marks' ) ;
    public final void rule__Exercise__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6388:1: ( ( 'marks' ) )
            // InternalJoveNotes.g:6389:1: ( 'marks' )
            {
            // InternalJoveNotes.g:6389:1: ( 'marks' )
            // InternalJoveNotes.g:6390:1: 'marks'
            {
             before(grammarAccess.getExerciseAccess().getMarksKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getMarksKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_2__0__Impl"


    // $ANTLR start "rule__Exercise__Group_2__1"
    // InternalJoveNotes.g:6403:1: rule__Exercise__Group_2__1 : rule__Exercise__Group_2__1__Impl rule__Exercise__Group_2__2 ;
    public final void rule__Exercise__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6407:1: ( rule__Exercise__Group_2__1__Impl rule__Exercise__Group_2__2 )
            // InternalJoveNotes.g:6408:2: rule__Exercise__Group_2__1__Impl rule__Exercise__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__Exercise__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_2__1"


    // $ANTLR start "rule__Exercise__Group_2__1__Impl"
    // InternalJoveNotes.g:6415:1: rule__Exercise__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Exercise__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6419:1: ( ( '=' ) )
            // InternalJoveNotes.g:6420:1: ( '=' )
            {
            // InternalJoveNotes.g:6420:1: ( '=' )
            // InternalJoveNotes.g:6421:1: '='
            {
             before(grammarAccess.getExerciseAccess().getEqualsSignKeyword_2_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_2__1__Impl"


    // $ANTLR start "rule__Exercise__Group_2__2"
    // InternalJoveNotes.g:6434:1: rule__Exercise__Group_2__2 : rule__Exercise__Group_2__2__Impl ;
    public final void rule__Exercise__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6438:1: ( rule__Exercise__Group_2__2__Impl )
            // InternalJoveNotes.g:6439:2: rule__Exercise__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_2__2"


    // $ANTLR start "rule__Exercise__Group_2__2__Impl"
    // InternalJoveNotes.g:6445:1: rule__Exercise__Group_2__2__Impl : ( ( rule__Exercise__MarksAssignment_2_2 ) ) ;
    public final void rule__Exercise__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6449:1: ( ( ( rule__Exercise__MarksAssignment_2_2 ) ) )
            // InternalJoveNotes.g:6450:1: ( ( rule__Exercise__MarksAssignment_2_2 ) )
            {
            // InternalJoveNotes.g:6450:1: ( ( rule__Exercise__MarksAssignment_2_2 ) )
            // InternalJoveNotes.g:6451:1: ( rule__Exercise__MarksAssignment_2_2 )
            {
             before(grammarAccess.getExerciseAccess().getMarksAssignment_2_2()); 
            // InternalJoveNotes.g:6452:1: ( rule__Exercise__MarksAssignment_2_2 )
            // InternalJoveNotes.g:6452:2: rule__Exercise__MarksAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__MarksAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getMarksAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_2__2__Impl"


    // $ANTLR start "rule__Exercise__Group_4__0"
    // InternalJoveNotes.g:6468:1: rule__Exercise__Group_4__0 : rule__Exercise__Group_4__0__Impl rule__Exercise__Group_4__1 ;
    public final void rule__Exercise__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6472:1: ( rule__Exercise__Group_4__0__Impl rule__Exercise__Group_4__1 )
            // InternalJoveNotes.g:6473:2: rule__Exercise__Group_4__0__Impl rule__Exercise__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__Exercise__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_4__0"


    // $ANTLR start "rule__Exercise__Group_4__0__Impl"
    // InternalJoveNotes.g:6480:1: rule__Exercise__Group_4__0__Impl : ( 'hints' ) ;
    public final void rule__Exercise__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6484:1: ( ( 'hints' ) )
            // InternalJoveNotes.g:6485:1: ( 'hints' )
            {
            // InternalJoveNotes.g:6485:1: ( 'hints' )
            // InternalJoveNotes.g:6486:1: 'hints'
            {
             before(grammarAccess.getExerciseAccess().getHintsKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getHintsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_4__0__Impl"


    // $ANTLR start "rule__Exercise__Group_4__1"
    // InternalJoveNotes.g:6499:1: rule__Exercise__Group_4__1 : rule__Exercise__Group_4__1__Impl rule__Exercise__Group_4__2 ;
    public final void rule__Exercise__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6503:1: ( rule__Exercise__Group_4__1__Impl rule__Exercise__Group_4__2 )
            // InternalJoveNotes.g:6504:2: rule__Exercise__Group_4__1__Impl rule__Exercise__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Exercise__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_4__1"


    // $ANTLR start "rule__Exercise__Group_4__1__Impl"
    // InternalJoveNotes.g:6511:1: rule__Exercise__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Exercise__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6515:1: ( ( '{' ) )
            // InternalJoveNotes.g:6516:1: ( '{' )
            {
            // InternalJoveNotes.g:6516:1: ( '{' )
            // InternalJoveNotes.g:6517:1: '{'
            {
             before(grammarAccess.getExerciseAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_4__1__Impl"


    // $ANTLR start "rule__Exercise__Group_4__2"
    // InternalJoveNotes.g:6530:1: rule__Exercise__Group_4__2 : rule__Exercise__Group_4__2__Impl rule__Exercise__Group_4__3 ;
    public final void rule__Exercise__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6534:1: ( rule__Exercise__Group_4__2__Impl rule__Exercise__Group_4__3 )
            // InternalJoveNotes.g:6535:2: rule__Exercise__Group_4__2__Impl rule__Exercise__Group_4__3
            {
            pushFollow(FOLLOW_27);
            rule__Exercise__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_4__2"


    // $ANTLR start "rule__Exercise__Group_4__2__Impl"
    // InternalJoveNotes.g:6542:1: rule__Exercise__Group_4__2__Impl : ( ( ( rule__Exercise__HintsAssignment_4_2 ) ) ( ( rule__Exercise__HintsAssignment_4_2 )* ) ) ;
    public final void rule__Exercise__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6546:1: ( ( ( ( rule__Exercise__HintsAssignment_4_2 ) ) ( ( rule__Exercise__HintsAssignment_4_2 )* ) ) )
            // InternalJoveNotes.g:6547:1: ( ( ( rule__Exercise__HintsAssignment_4_2 ) ) ( ( rule__Exercise__HintsAssignment_4_2 )* ) )
            {
            // InternalJoveNotes.g:6547:1: ( ( ( rule__Exercise__HintsAssignment_4_2 ) ) ( ( rule__Exercise__HintsAssignment_4_2 )* ) )
            // InternalJoveNotes.g:6548:1: ( ( rule__Exercise__HintsAssignment_4_2 ) ) ( ( rule__Exercise__HintsAssignment_4_2 )* )
            {
            // InternalJoveNotes.g:6548:1: ( ( rule__Exercise__HintsAssignment_4_2 ) )
            // InternalJoveNotes.g:6549:1: ( rule__Exercise__HintsAssignment_4_2 )
            {
             before(grammarAccess.getExerciseAccess().getHintsAssignment_4_2()); 
            // InternalJoveNotes.g:6550:1: ( rule__Exercise__HintsAssignment_4_2 )
            // InternalJoveNotes.g:6550:2: rule__Exercise__HintsAssignment_4_2
            {
            pushFollow(FOLLOW_16);
            rule__Exercise__HintsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getHintsAssignment_4_2()); 

            }

            // InternalJoveNotes.g:6553:1: ( ( rule__Exercise__HintsAssignment_4_2 )* )
            // InternalJoveNotes.g:6554:1: ( rule__Exercise__HintsAssignment_4_2 )*
            {
             before(grammarAccess.getExerciseAccess().getHintsAssignment_4_2()); 
            // InternalJoveNotes.g:6555:1: ( rule__Exercise__HintsAssignment_4_2 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_STRING) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalJoveNotes.g:6555:2: rule__Exercise__HintsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Exercise__HintsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getExerciseAccess().getHintsAssignment_4_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_4__2__Impl"


    // $ANTLR start "rule__Exercise__Group_4__3"
    // InternalJoveNotes.g:6566:1: rule__Exercise__Group_4__3 : rule__Exercise__Group_4__3__Impl ;
    public final void rule__Exercise__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6570:1: ( rule__Exercise__Group_4__3__Impl )
            // InternalJoveNotes.g:6571:2: rule__Exercise__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_4__3"


    // $ANTLR start "rule__Exercise__Group_4__3__Impl"
    // InternalJoveNotes.g:6577:1: rule__Exercise__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Exercise__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6581:1: ( ( '}' ) )
            // InternalJoveNotes.g:6582:1: ( '}' )
            {
            // InternalJoveNotes.g:6582:1: ( '}' )
            // InternalJoveNotes.g:6583:1: '}'
            {
             before(grammarAccess.getExerciseAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_4__3__Impl"


    // $ANTLR start "rule__Exercise__Group_5__0"
    // InternalJoveNotes.g:6604:1: rule__Exercise__Group_5__0 : rule__Exercise__Group_5__0__Impl rule__Exercise__Group_5__1 ;
    public final void rule__Exercise__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6608:1: ( rule__Exercise__Group_5__0__Impl rule__Exercise__Group_5__1 )
            // InternalJoveNotes.g:6609:2: rule__Exercise__Group_5__0__Impl rule__Exercise__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Exercise__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_5__0"


    // $ANTLR start "rule__Exercise__Group_5__0__Impl"
    // InternalJoveNotes.g:6616:1: rule__Exercise__Group_5__0__Impl : ( 'answer' ) ;
    public final void rule__Exercise__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6620:1: ( ( 'answer' ) )
            // InternalJoveNotes.g:6621:1: ( 'answer' )
            {
            // InternalJoveNotes.g:6621:1: ( 'answer' )
            // InternalJoveNotes.g:6622:1: 'answer'
            {
             before(grammarAccess.getExerciseAccess().getAnswerKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getAnswerKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_5__0__Impl"


    // $ANTLR start "rule__Exercise__Group_5__1"
    // InternalJoveNotes.g:6635:1: rule__Exercise__Group_5__1 : rule__Exercise__Group_5__1__Impl ;
    public final void rule__Exercise__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6639:1: ( rule__Exercise__Group_5__1__Impl )
            // InternalJoveNotes.g:6640:2: rule__Exercise__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_5__1"


    // $ANTLR start "rule__Exercise__Group_5__1__Impl"
    // InternalJoveNotes.g:6646:1: rule__Exercise__Group_5__1__Impl : ( ( rule__Exercise__AnswerAssignment_5_1 ) ) ;
    public final void rule__Exercise__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6650:1: ( ( ( rule__Exercise__AnswerAssignment_5_1 ) ) )
            // InternalJoveNotes.g:6651:1: ( ( rule__Exercise__AnswerAssignment_5_1 ) )
            {
            // InternalJoveNotes.g:6651:1: ( ( rule__Exercise__AnswerAssignment_5_1 ) )
            // InternalJoveNotes.g:6652:1: ( rule__Exercise__AnswerAssignment_5_1 )
            {
             before(grammarAccess.getExerciseAccess().getAnswerAssignment_5_1()); 
            // InternalJoveNotes.g:6653:1: ( rule__Exercise__AnswerAssignment_5_1 )
            // InternalJoveNotes.g:6653:2: rule__Exercise__AnswerAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__AnswerAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getAnswerAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_5__1__Impl"


    // $ANTLR start "rule__VoiceToText__Group__0"
    // InternalJoveNotes.g:6667:1: rule__VoiceToText__Group__0 : rule__VoiceToText__Group__0__Impl rule__VoiceToText__Group__1 ;
    public final void rule__VoiceToText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6671:1: ( rule__VoiceToText__Group__0__Impl rule__VoiceToText__Group__1 )
            // InternalJoveNotes.g:6672:2: rule__VoiceToText__Group__0__Impl rule__VoiceToText__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__VoiceToText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoiceToText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__Group__0"


    // $ANTLR start "rule__VoiceToText__Group__0__Impl"
    // InternalJoveNotes.g:6679:1: rule__VoiceToText__Group__0__Impl : ( '@voice2text' ) ;
    public final void rule__VoiceToText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6683:1: ( ( '@voice2text' ) )
            // InternalJoveNotes.g:6684:1: ( '@voice2text' )
            {
            // InternalJoveNotes.g:6684:1: ( '@voice2text' )
            // InternalJoveNotes.g:6685:1: '@voice2text'
            {
             before(grammarAccess.getVoiceToTextAccess().getVoice2textKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getVoiceToTextAccess().getVoice2textKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__Group__0__Impl"


    // $ANTLR start "rule__VoiceToText__Group__1"
    // InternalJoveNotes.g:6698:1: rule__VoiceToText__Group__1 : rule__VoiceToText__Group__1__Impl rule__VoiceToText__Group__2 ;
    public final void rule__VoiceToText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6702:1: ( rule__VoiceToText__Group__1__Impl rule__VoiceToText__Group__2 )
            // InternalJoveNotes.g:6703:2: rule__VoiceToText__Group__1__Impl rule__VoiceToText__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__VoiceToText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoiceToText__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__Group__1"


    // $ANTLR start "rule__VoiceToText__Group__1__Impl"
    // InternalJoveNotes.g:6710:1: rule__VoiceToText__Group__1__Impl : ( ( rule__VoiceToText__HideFromViewAssignment_1 )? ) ;
    public final void rule__VoiceToText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6714:1: ( ( ( rule__VoiceToText__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:6715:1: ( ( rule__VoiceToText__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:6715:1: ( ( rule__VoiceToText__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:6716:1: ( rule__VoiceToText__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getVoiceToTextAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:6717:1: ( rule__VoiceToText__HideFromViewAssignment_1 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==60) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalJoveNotes.g:6717:2: rule__VoiceToText__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VoiceToText__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVoiceToTextAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__Group__1__Impl"


    // $ANTLR start "rule__VoiceToText__Group__2"
    // InternalJoveNotes.g:6727:1: rule__VoiceToText__Group__2 : rule__VoiceToText__Group__2__Impl rule__VoiceToText__Group__3 ;
    public final void rule__VoiceToText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6731:1: ( rule__VoiceToText__Group__2__Impl rule__VoiceToText__Group__3 )
            // InternalJoveNotes.g:6732:2: rule__VoiceToText__Group__2__Impl rule__VoiceToText__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__VoiceToText__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoiceToText__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__Group__2"


    // $ANTLR start "rule__VoiceToText__Group__2__Impl"
    // InternalJoveNotes.g:6739:1: rule__VoiceToText__Group__2__Impl : ( ( rule__VoiceToText__ClipNameAssignment_2 ) ) ;
    public final void rule__VoiceToText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6743:1: ( ( ( rule__VoiceToText__ClipNameAssignment_2 ) ) )
            // InternalJoveNotes.g:6744:1: ( ( rule__VoiceToText__ClipNameAssignment_2 ) )
            {
            // InternalJoveNotes.g:6744:1: ( ( rule__VoiceToText__ClipNameAssignment_2 ) )
            // InternalJoveNotes.g:6745:1: ( rule__VoiceToText__ClipNameAssignment_2 )
            {
             before(grammarAccess.getVoiceToTextAccess().getClipNameAssignment_2()); 
            // InternalJoveNotes.g:6746:1: ( rule__VoiceToText__ClipNameAssignment_2 )
            // InternalJoveNotes.g:6746:2: rule__VoiceToText__ClipNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VoiceToText__ClipNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVoiceToTextAccess().getClipNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__Group__2__Impl"


    // $ANTLR start "rule__VoiceToText__Group__3"
    // InternalJoveNotes.g:6756:1: rule__VoiceToText__Group__3 : rule__VoiceToText__Group__3__Impl ;
    public final void rule__VoiceToText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6760:1: ( rule__VoiceToText__Group__3__Impl )
            // InternalJoveNotes.g:6761:2: rule__VoiceToText__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VoiceToText__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__Group__3"


    // $ANTLR start "rule__VoiceToText__Group__3__Impl"
    // InternalJoveNotes.g:6767:1: rule__VoiceToText__Group__3__Impl : ( ( rule__VoiceToText__TextAssignment_3 ) ) ;
    public final void rule__VoiceToText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6771:1: ( ( ( rule__VoiceToText__TextAssignment_3 ) ) )
            // InternalJoveNotes.g:6772:1: ( ( rule__VoiceToText__TextAssignment_3 ) )
            {
            // InternalJoveNotes.g:6772:1: ( ( rule__VoiceToText__TextAssignment_3 ) )
            // InternalJoveNotes.g:6773:1: ( rule__VoiceToText__TextAssignment_3 )
            {
             before(grammarAccess.getVoiceToTextAccess().getTextAssignment_3()); 
            // InternalJoveNotes.g:6774:1: ( rule__VoiceToText__TextAssignment_3 )
            // InternalJoveNotes.g:6774:2: rule__VoiceToText__TextAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VoiceToText__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVoiceToTextAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__Group__3__Impl"


    // $ANTLR start "rule__CompilerBreak__Group__0"
    // InternalJoveNotes.g:6792:1: rule__CompilerBreak__Group__0 : rule__CompilerBreak__Group__0__Impl rule__CompilerBreak__Group__1 ;
    public final void rule__CompilerBreak__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6796:1: ( rule__CompilerBreak__Group__0__Impl rule__CompilerBreak__Group__1 )
            // InternalJoveNotes.g:6797:2: rule__CompilerBreak__Group__0__Impl rule__CompilerBreak__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__CompilerBreak__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompilerBreak__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilerBreak__Group__0"


    // $ANTLR start "rule__CompilerBreak__Group__0__Impl"
    // InternalJoveNotes.g:6804:1: rule__CompilerBreak__Group__0__Impl : ( () ) ;
    public final void rule__CompilerBreak__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6808:1: ( ( () ) )
            // InternalJoveNotes.g:6809:1: ( () )
            {
            // InternalJoveNotes.g:6809:1: ( () )
            // InternalJoveNotes.g:6810:1: ()
            {
             before(grammarAccess.getCompilerBreakAccess().getCompilerBreakAction_0()); 
            // InternalJoveNotes.g:6811:1: ()
            // InternalJoveNotes.g:6813:1: 
            {
            }

             after(grammarAccess.getCompilerBreakAccess().getCompilerBreakAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilerBreak__Group__0__Impl"


    // $ANTLR start "rule__CompilerBreak__Group__1"
    // InternalJoveNotes.g:6823:1: rule__CompilerBreak__Group__1 : rule__CompilerBreak__Group__1__Impl ;
    public final void rule__CompilerBreak__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6827:1: ( rule__CompilerBreak__Group__1__Impl )
            // InternalJoveNotes.g:6828:2: rule__CompilerBreak__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompilerBreak__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilerBreak__Group__1"


    // $ANTLR start "rule__CompilerBreak__Group__1__Impl"
    // InternalJoveNotes.g:6834:1: rule__CompilerBreak__Group__1__Impl : ( '@compiler_break' ) ;
    public final void rule__CompilerBreak__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6838:1: ( ( '@compiler_break' ) )
            // InternalJoveNotes.g:6839:1: ( '@compiler_break' )
            {
            // InternalJoveNotes.g:6839:1: ( '@compiler_break' )
            // InternalJoveNotes.g:6840:1: '@compiler_break'
            {
             before(grammarAccess.getCompilerBreakAccess().getCompiler_breakKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCompilerBreakAccess().getCompiler_breakKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilerBreak__Group__1__Impl"


    // $ANTLR start "rule__ChapterSection__Group__0"
    // InternalJoveNotes.g:6857:1: rule__ChapterSection__Group__0 : rule__ChapterSection__Group__0__Impl rule__ChapterSection__Group__1 ;
    public final void rule__ChapterSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6861:1: ( rule__ChapterSection__Group__0__Impl rule__ChapterSection__Group__1 )
            // InternalJoveNotes.g:6862:2: rule__ChapterSection__Group__0__Impl rule__ChapterSection__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ChapterSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChapterSection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterSection__Group__0"


    // $ANTLR start "rule__ChapterSection__Group__0__Impl"
    // InternalJoveNotes.g:6869:1: rule__ChapterSection__Group__0__Impl : ( '@section' ) ;
    public final void rule__ChapterSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6873:1: ( ( '@section' ) )
            // InternalJoveNotes.g:6874:1: ( '@section' )
            {
            // InternalJoveNotes.g:6874:1: ( '@section' )
            // InternalJoveNotes.g:6875:1: '@section'
            {
             before(grammarAccess.getChapterSectionAccess().getSectionKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getChapterSectionAccess().getSectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterSection__Group__0__Impl"


    // $ANTLR start "rule__ChapterSection__Group__1"
    // InternalJoveNotes.g:6888:1: rule__ChapterSection__Group__1 : rule__ChapterSection__Group__1__Impl ;
    public final void rule__ChapterSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6892:1: ( rule__ChapterSection__Group__1__Impl )
            // InternalJoveNotes.g:6893:2: rule__ChapterSection__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChapterSection__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterSection__Group__1"


    // $ANTLR start "rule__ChapterSection__Group__1__Impl"
    // InternalJoveNotes.g:6899:1: rule__ChapterSection__Group__1__Impl : ( ( rule__ChapterSection__SectionNameAssignment_1 ) ) ;
    public final void rule__ChapterSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6903:1: ( ( ( rule__ChapterSection__SectionNameAssignment_1 ) ) )
            // InternalJoveNotes.g:6904:1: ( ( rule__ChapterSection__SectionNameAssignment_1 ) )
            {
            // InternalJoveNotes.g:6904:1: ( ( rule__ChapterSection__SectionNameAssignment_1 ) )
            // InternalJoveNotes.g:6905:1: ( rule__ChapterSection__SectionNameAssignment_1 )
            {
             before(grammarAccess.getChapterSectionAccess().getSectionNameAssignment_1()); 
            // InternalJoveNotes.g:6906:1: ( rule__ChapterSection__SectionNameAssignment_1 )
            // InternalJoveNotes.g:6906:2: rule__ChapterSection__SectionNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ChapterSection__SectionNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChapterSectionAccess().getSectionNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterSection__Group__1__Impl"


    // $ANTLR start "rule__Option__Group__0"
    // InternalJoveNotes.g:6920:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6924:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // InternalJoveNotes.g:6925:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Option__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0"


    // $ANTLR start "rule__Option__Group__0__Impl"
    // InternalJoveNotes.g:6932:1: rule__Option__Group__0__Impl : ( ( rule__Option__OptionValueAssignment_0 ) ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6936:1: ( ( ( rule__Option__OptionValueAssignment_0 ) ) )
            // InternalJoveNotes.g:6937:1: ( ( rule__Option__OptionValueAssignment_0 ) )
            {
            // InternalJoveNotes.g:6937:1: ( ( rule__Option__OptionValueAssignment_0 ) )
            // InternalJoveNotes.g:6938:1: ( rule__Option__OptionValueAssignment_0 )
            {
             before(grammarAccess.getOptionAccess().getOptionValueAssignment_0()); 
            // InternalJoveNotes.g:6939:1: ( rule__Option__OptionValueAssignment_0 )
            // InternalJoveNotes.g:6939:2: rule__Option__OptionValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Option__OptionValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getOptionValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0__Impl"


    // $ANTLR start "rule__Option__Group__1"
    // InternalJoveNotes.g:6949:1: rule__Option__Group__1 : rule__Option__Group__1__Impl ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6953:1: ( rule__Option__Group__1__Impl )
            // InternalJoveNotes.g:6954:2: rule__Option__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__1"


    // $ANTLR start "rule__Option__Group__1__Impl"
    // InternalJoveNotes.g:6960:1: rule__Option__Group__1__Impl : ( ( rule__Option__CorrectOptionAssignment_1 )? ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6964:1: ( ( ( rule__Option__CorrectOptionAssignment_1 )? ) )
            // InternalJoveNotes.g:6965:1: ( ( rule__Option__CorrectOptionAssignment_1 )? )
            {
            // InternalJoveNotes.g:6965:1: ( ( rule__Option__CorrectOptionAssignment_1 )? )
            // InternalJoveNotes.g:6966:1: ( rule__Option__CorrectOptionAssignment_1 )?
            {
             before(grammarAccess.getOptionAccess().getCorrectOptionAssignment_1()); 
            // InternalJoveNotes.g:6967:1: ( rule__Option__CorrectOptionAssignment_1 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==62) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalJoveNotes.g:6967:2: rule__Option__CorrectOptionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Option__CorrectOptionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionAccess().getCorrectOptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__1__Impl"


    // $ANTLR start "rule__CMap__Group__0"
    // InternalJoveNotes.g:6981:1: rule__CMap__Group__0 : rule__CMap__Group__0__Impl rule__CMap__Group__1 ;
    public final void rule__CMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6985:1: ( rule__CMap__Group__0__Impl rule__CMap__Group__1 )
            // InternalJoveNotes.g:6986:2: rule__CMap__Group__0__Impl rule__CMap__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__CMap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CMap__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__Group__0"


    // $ANTLR start "rule__CMap__Group__0__Impl"
    // InternalJoveNotes.g:6993:1: rule__CMap__Group__0__Impl : ( 'cmap' ) ;
    public final void rule__CMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6997:1: ( ( 'cmap' ) )
            // InternalJoveNotes.g:6998:1: ( 'cmap' )
            {
            // InternalJoveNotes.g:6998:1: ( 'cmap' )
            // InternalJoveNotes.g:6999:1: 'cmap'
            {
             before(grammarAccess.getCMapAccess().getCmapKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCMapAccess().getCmapKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__Group__0__Impl"


    // $ANTLR start "rule__CMap__Group__1"
    // InternalJoveNotes.g:7012:1: rule__CMap__Group__1 : rule__CMap__Group__1__Impl rule__CMap__Group__2 ;
    public final void rule__CMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7016:1: ( rule__CMap__Group__1__Impl rule__CMap__Group__2 )
            // InternalJoveNotes.g:7017:2: rule__CMap__Group__1__Impl rule__CMap__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__CMap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CMap__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__Group__1"


    // $ANTLR start "rule__CMap__Group__1__Impl"
    // InternalJoveNotes.g:7024:1: rule__CMap__Group__1__Impl : ( '{' ) ;
    public final void rule__CMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7028:1: ( ( '{' ) )
            // InternalJoveNotes.g:7029:1: ( '{' )
            {
            // InternalJoveNotes.g:7029:1: ( '{' )
            // InternalJoveNotes.g:7030:1: '{'
            {
             before(grammarAccess.getCMapAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCMapAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__Group__1__Impl"


    // $ANTLR start "rule__CMap__Group__2"
    // InternalJoveNotes.g:7043:1: rule__CMap__Group__2 : rule__CMap__Group__2__Impl rule__CMap__Group__3 ;
    public final void rule__CMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7047:1: ( rule__CMap__Group__2__Impl rule__CMap__Group__3 )
            // InternalJoveNotes.g:7048:2: rule__CMap__Group__2__Impl rule__CMap__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__CMap__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CMap__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__Group__2"


    // $ANTLR start "rule__CMap__Group__2__Impl"
    // InternalJoveNotes.g:7055:1: rule__CMap__Group__2__Impl : ( ( rule__CMap__ContentAssignment_2 ) ) ;
    public final void rule__CMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7059:1: ( ( ( rule__CMap__ContentAssignment_2 ) ) )
            // InternalJoveNotes.g:7060:1: ( ( rule__CMap__ContentAssignment_2 ) )
            {
            // InternalJoveNotes.g:7060:1: ( ( rule__CMap__ContentAssignment_2 ) )
            // InternalJoveNotes.g:7061:1: ( rule__CMap__ContentAssignment_2 )
            {
             before(grammarAccess.getCMapAccess().getContentAssignment_2()); 
            // InternalJoveNotes.g:7062:1: ( rule__CMap__ContentAssignment_2 )
            // InternalJoveNotes.g:7062:2: rule__CMap__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CMap__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCMapAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__Group__2__Impl"


    // $ANTLR start "rule__CMap__Group__3"
    // InternalJoveNotes.g:7072:1: rule__CMap__Group__3 : rule__CMap__Group__3__Impl ;
    public final void rule__CMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7076:1: ( rule__CMap__Group__3__Impl )
            // InternalJoveNotes.g:7077:2: rule__CMap__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CMap__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__Group__3"


    // $ANTLR start "rule__CMap__Group__3__Impl"
    // InternalJoveNotes.g:7083:1: rule__CMap__Group__3__Impl : ( '}' ) ;
    public final void rule__CMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7087:1: ( ( '}' ) )
            // InternalJoveNotes.g:7088:1: ( '}' )
            {
            // InternalJoveNotes.g:7088:1: ( '}' )
            // InternalJoveNotes.g:7089:1: '}'
            {
             before(grammarAccess.getCMapAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCMapAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__Group__3__Impl"


    // $ANTLR start "rule__Script__Group__0"
    // InternalJoveNotes.g:7110:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7114:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // InternalJoveNotes.g:7115:2: rule__Script__Group__0__Impl rule__Script__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Script__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0"


    // $ANTLR start "rule__Script__Group__0__Impl"
    // InternalJoveNotes.g:7122:1: rule__Script__Group__0__Impl : ( 'script_expressions' ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7126:1: ( ( 'script_expressions' ) )
            // InternalJoveNotes.g:7127:1: ( 'script_expressions' )
            {
            // InternalJoveNotes.g:7127:1: ( 'script_expressions' )
            // InternalJoveNotes.g:7128:1: 'script_expressions'
            {
             before(grammarAccess.getScriptAccess().getScript_expressionsKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getScriptAccess().getScript_expressionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0__Impl"


    // $ANTLR start "rule__Script__Group__1"
    // InternalJoveNotes.g:7141:1: rule__Script__Group__1 : rule__Script__Group__1__Impl rule__Script__Group__2 ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7145:1: ( rule__Script__Group__1__Impl rule__Script__Group__2 )
            // InternalJoveNotes.g:7146:2: rule__Script__Group__1__Impl rule__Script__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Script__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1"


    // $ANTLR start "rule__Script__Group__1__Impl"
    // InternalJoveNotes.g:7153:1: rule__Script__Group__1__Impl : ( '{' ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7157:1: ( ( '{' ) )
            // InternalJoveNotes.g:7158:1: ( '{' )
            {
            // InternalJoveNotes.g:7158:1: ( '{' )
            // InternalJoveNotes.g:7159:1: '{'
            {
             before(grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1__Impl"


    // $ANTLR start "rule__Script__Group__2"
    // InternalJoveNotes.g:7172:1: rule__Script__Group__2 : rule__Script__Group__2__Impl rule__Script__Group__3 ;
    public final void rule__Script__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7176:1: ( rule__Script__Group__2__Impl rule__Script__Group__3 )
            // InternalJoveNotes.g:7177:2: rule__Script__Group__2__Impl rule__Script__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Script__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2"


    // $ANTLR start "rule__Script__Group__2__Impl"
    // InternalJoveNotes.g:7184:1: rule__Script__Group__2__Impl : ( ( rule__Script__EvalVarsAssignment_2 ) ) ;
    public final void rule__Script__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7188:1: ( ( ( rule__Script__EvalVarsAssignment_2 ) ) )
            // InternalJoveNotes.g:7189:1: ( ( rule__Script__EvalVarsAssignment_2 ) )
            {
            // InternalJoveNotes.g:7189:1: ( ( rule__Script__EvalVarsAssignment_2 ) )
            // InternalJoveNotes.g:7190:1: ( rule__Script__EvalVarsAssignment_2 )
            {
             before(grammarAccess.getScriptAccess().getEvalVarsAssignment_2()); 
            // InternalJoveNotes.g:7191:1: ( rule__Script__EvalVarsAssignment_2 )
            // InternalJoveNotes.g:7191:2: rule__Script__EvalVarsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Script__EvalVarsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getEvalVarsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2__Impl"


    // $ANTLR start "rule__Script__Group__3"
    // InternalJoveNotes.g:7201:1: rule__Script__Group__3 : rule__Script__Group__3__Impl rule__Script__Group__4 ;
    public final void rule__Script__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7205:1: ( rule__Script__Group__3__Impl rule__Script__Group__4 )
            // InternalJoveNotes.g:7206:2: rule__Script__Group__3__Impl rule__Script__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Script__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__3"


    // $ANTLR start "rule__Script__Group__3__Impl"
    // InternalJoveNotes.g:7213:1: rule__Script__Group__3__Impl : ( ( rule__Script__Group_3__0 )* ) ;
    public final void rule__Script__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7217:1: ( ( ( rule__Script__Group_3__0 )* ) )
            // InternalJoveNotes.g:7218:1: ( ( rule__Script__Group_3__0 )* )
            {
            // InternalJoveNotes.g:7218:1: ( ( rule__Script__Group_3__0 )* )
            // InternalJoveNotes.g:7219:1: ( rule__Script__Group_3__0 )*
            {
             before(grammarAccess.getScriptAccess().getGroup_3()); 
            // InternalJoveNotes.g:7220:1: ( rule__Script__Group_3__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==39) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalJoveNotes.g:7220:2: rule__Script__Group_3__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Script__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getScriptAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__3__Impl"


    // $ANTLR start "rule__Script__Group__4"
    // InternalJoveNotes.g:7230:1: rule__Script__Group__4 : rule__Script__Group__4__Impl rule__Script__Group__5 ;
    public final void rule__Script__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7234:1: ( rule__Script__Group__4__Impl rule__Script__Group__5 )
            // InternalJoveNotes.g:7235:2: rule__Script__Group__4__Impl rule__Script__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Script__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__4"


    // $ANTLR start "rule__Script__Group__4__Impl"
    // InternalJoveNotes.g:7242:1: rule__Script__Group__4__Impl : ( '}' ) ;
    public final void rule__Script__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7246:1: ( ( '}' ) )
            // InternalJoveNotes.g:7247:1: ( '}' )
            {
            // InternalJoveNotes.g:7247:1: ( '}' )
            // InternalJoveNotes.g:7248:1: '}'
            {
             before(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__4__Impl"


    // $ANTLR start "rule__Script__Group__5"
    // InternalJoveNotes.g:7261:1: rule__Script__Group__5 : rule__Script__Group__5__Impl ;
    public final void rule__Script__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7265:1: ( rule__Script__Group__5__Impl )
            // InternalJoveNotes.g:7266:2: rule__Script__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__5"


    // $ANTLR start "rule__Script__Group__5__Impl"
    // InternalJoveNotes.g:7272:1: rule__Script__Group__5__Impl : ( ( rule__Script__ScriptBodyAssignment_5 )? ) ;
    public final void rule__Script__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7276:1: ( ( ( rule__Script__ScriptBodyAssignment_5 )? ) )
            // InternalJoveNotes.g:7277:1: ( ( rule__Script__ScriptBodyAssignment_5 )? )
            {
            // InternalJoveNotes.g:7277:1: ( ( rule__Script__ScriptBodyAssignment_5 )? )
            // InternalJoveNotes.g:7278:1: ( rule__Script__ScriptBodyAssignment_5 )?
            {
             before(grammarAccess.getScriptAccess().getScriptBodyAssignment_5()); 
            // InternalJoveNotes.g:7279:1: ( rule__Script__ScriptBodyAssignment_5 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==56) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalJoveNotes.g:7279:2: rule__Script__ScriptBodyAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Script__ScriptBodyAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScriptAccess().getScriptBodyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__5__Impl"


    // $ANTLR start "rule__Script__Group_3__0"
    // InternalJoveNotes.g:7301:1: rule__Script__Group_3__0 : rule__Script__Group_3__0__Impl rule__Script__Group_3__1 ;
    public final void rule__Script__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7305:1: ( rule__Script__Group_3__0__Impl rule__Script__Group_3__1 )
            // InternalJoveNotes.g:7306:2: rule__Script__Group_3__0__Impl rule__Script__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Script__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3__0"


    // $ANTLR start "rule__Script__Group_3__0__Impl"
    // InternalJoveNotes.g:7313:1: rule__Script__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Script__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7317:1: ( ( ',' ) )
            // InternalJoveNotes.g:7318:1: ( ',' )
            {
            // InternalJoveNotes.g:7318:1: ( ',' )
            // InternalJoveNotes.g:7319:1: ','
            {
             before(grammarAccess.getScriptAccess().getCommaKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getScriptAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3__0__Impl"


    // $ANTLR start "rule__Script__Group_3__1"
    // InternalJoveNotes.g:7332:1: rule__Script__Group_3__1 : rule__Script__Group_3__1__Impl ;
    public final void rule__Script__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7336:1: ( rule__Script__Group_3__1__Impl )
            // InternalJoveNotes.g:7337:2: rule__Script__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3__1"


    // $ANTLR start "rule__Script__Group_3__1__Impl"
    // InternalJoveNotes.g:7343:1: rule__Script__Group_3__1__Impl : ( ( rule__Script__EvalVarsAssignment_3_1 ) ) ;
    public final void rule__Script__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7347:1: ( ( ( rule__Script__EvalVarsAssignment_3_1 ) ) )
            // InternalJoveNotes.g:7348:1: ( ( rule__Script__EvalVarsAssignment_3_1 ) )
            {
            // InternalJoveNotes.g:7348:1: ( ( rule__Script__EvalVarsAssignment_3_1 ) )
            // InternalJoveNotes.g:7349:1: ( rule__Script__EvalVarsAssignment_3_1 )
            {
             before(grammarAccess.getScriptAccess().getEvalVarsAssignment_3_1()); 
            // InternalJoveNotes.g:7350:1: ( rule__Script__EvalVarsAssignment_3_1 )
            // InternalJoveNotes.g:7350:2: rule__Script__EvalVarsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Script__EvalVarsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getEvalVarsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3__1__Impl"


    // $ANTLR start "rule__EvalVar__Group__0"
    // InternalJoveNotes.g:7364:1: rule__EvalVar__Group__0 : rule__EvalVar__Group__0__Impl rule__EvalVar__Group__1 ;
    public final void rule__EvalVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7368:1: ( rule__EvalVar__Group__0__Impl rule__EvalVar__Group__1 )
            // InternalJoveNotes.g:7369:2: rule__EvalVar__Group__0__Impl rule__EvalVar__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__EvalVar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvalVar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalVar__Group__0"


    // $ANTLR start "rule__EvalVar__Group__0__Impl"
    // InternalJoveNotes.g:7376:1: rule__EvalVar__Group__0__Impl : ( ( rule__EvalVar__VarNameAssignment_0 ) ) ;
    public final void rule__EvalVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7380:1: ( ( ( rule__EvalVar__VarNameAssignment_0 ) ) )
            // InternalJoveNotes.g:7381:1: ( ( rule__EvalVar__VarNameAssignment_0 ) )
            {
            // InternalJoveNotes.g:7381:1: ( ( rule__EvalVar__VarNameAssignment_0 ) )
            // InternalJoveNotes.g:7382:1: ( rule__EvalVar__VarNameAssignment_0 )
            {
             before(grammarAccess.getEvalVarAccess().getVarNameAssignment_0()); 
            // InternalJoveNotes.g:7383:1: ( rule__EvalVar__VarNameAssignment_0 )
            // InternalJoveNotes.g:7383:2: rule__EvalVar__VarNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EvalVar__VarNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEvalVarAccess().getVarNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalVar__Group__0__Impl"


    // $ANTLR start "rule__EvalVar__Group__1"
    // InternalJoveNotes.g:7393:1: rule__EvalVar__Group__1 : rule__EvalVar__Group__1__Impl rule__EvalVar__Group__2 ;
    public final void rule__EvalVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7397:1: ( rule__EvalVar__Group__1__Impl rule__EvalVar__Group__2 )
            // InternalJoveNotes.g:7398:2: rule__EvalVar__Group__1__Impl rule__EvalVar__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__EvalVar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvalVar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalVar__Group__1"


    // $ANTLR start "rule__EvalVar__Group__1__Impl"
    // InternalJoveNotes.g:7405:1: rule__EvalVar__Group__1__Impl : ( '=' ) ;
    public final void rule__EvalVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7409:1: ( ( '=' ) )
            // InternalJoveNotes.g:7410:1: ( '=' )
            {
            // InternalJoveNotes.g:7410:1: ( '=' )
            // InternalJoveNotes.g:7411:1: '='
            {
             before(grammarAccess.getEvalVarAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEvalVarAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalVar__Group__1__Impl"


    // $ANTLR start "rule__EvalVar__Group__2"
    // InternalJoveNotes.g:7424:1: rule__EvalVar__Group__2 : rule__EvalVar__Group__2__Impl ;
    public final void rule__EvalVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7428:1: ( rule__EvalVar__Group__2__Impl )
            // InternalJoveNotes.g:7429:2: rule__EvalVar__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvalVar__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalVar__Group__2"


    // $ANTLR start "rule__EvalVar__Group__2__Impl"
    // InternalJoveNotes.g:7435:1: rule__EvalVar__Group__2__Impl : ( ( rule__EvalVar__VarExpressionAssignment_2 ) ) ;
    public final void rule__EvalVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7439:1: ( ( ( rule__EvalVar__VarExpressionAssignment_2 ) ) )
            // InternalJoveNotes.g:7440:1: ( ( rule__EvalVar__VarExpressionAssignment_2 ) )
            {
            // InternalJoveNotes.g:7440:1: ( ( rule__EvalVar__VarExpressionAssignment_2 ) )
            // InternalJoveNotes.g:7441:1: ( rule__EvalVar__VarExpressionAssignment_2 )
            {
             before(grammarAccess.getEvalVarAccess().getVarExpressionAssignment_2()); 
            // InternalJoveNotes.g:7442:1: ( rule__EvalVar__VarExpressionAssignment_2 )
            // InternalJoveNotes.g:7442:2: rule__EvalVar__VarExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EvalVar__VarExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvalVarAccess().getVarExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalVar__Group__2__Impl"


    // $ANTLR start "rule__ScriptBody__Group__0"
    // InternalJoveNotes.g:7458:1: rule__ScriptBody__Group__0 : rule__ScriptBody__Group__0__Impl rule__ScriptBody__Group__1 ;
    public final void rule__ScriptBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7462:1: ( rule__ScriptBody__Group__0__Impl rule__ScriptBody__Group__1 )
            // InternalJoveNotes.g:7463:2: rule__ScriptBody__Group__0__Impl rule__ScriptBody__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ScriptBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScriptBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__Group__0"


    // $ANTLR start "rule__ScriptBody__Group__0__Impl"
    // InternalJoveNotes.g:7470:1: rule__ScriptBody__Group__0__Impl : ( 'script' ) ;
    public final void rule__ScriptBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7474:1: ( ( 'script' ) )
            // InternalJoveNotes.g:7475:1: ( 'script' )
            {
            // InternalJoveNotes.g:7475:1: ( 'script' )
            // InternalJoveNotes.g:7476:1: 'script'
            {
             before(grammarAccess.getScriptBodyAccess().getScriptKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getScriptBodyAccess().getScriptKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__Group__0__Impl"


    // $ANTLR start "rule__ScriptBody__Group__1"
    // InternalJoveNotes.g:7489:1: rule__ScriptBody__Group__1 : rule__ScriptBody__Group__1__Impl rule__ScriptBody__Group__2 ;
    public final void rule__ScriptBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7493:1: ( rule__ScriptBody__Group__1__Impl rule__ScriptBody__Group__2 )
            // InternalJoveNotes.g:7494:2: rule__ScriptBody__Group__1__Impl rule__ScriptBody__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ScriptBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScriptBody__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__Group__1"


    // $ANTLR start "rule__ScriptBody__Group__1__Impl"
    // InternalJoveNotes.g:7501:1: rule__ScriptBody__Group__1__Impl : ( '{' ) ;
    public final void rule__ScriptBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7505:1: ( ( '{' ) )
            // InternalJoveNotes.g:7506:1: ( '{' )
            {
            // InternalJoveNotes.g:7506:1: ( '{' )
            // InternalJoveNotes.g:7507:1: '{'
            {
             before(grammarAccess.getScriptBodyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getScriptBodyAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__Group__1__Impl"


    // $ANTLR start "rule__ScriptBody__Group__2"
    // InternalJoveNotes.g:7520:1: rule__ScriptBody__Group__2 : rule__ScriptBody__Group__2__Impl rule__ScriptBody__Group__3 ;
    public final void rule__ScriptBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7524:1: ( rule__ScriptBody__Group__2__Impl rule__ScriptBody__Group__3 )
            // InternalJoveNotes.g:7525:2: rule__ScriptBody__Group__2__Impl rule__ScriptBody__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__ScriptBody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScriptBody__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__Group__2"


    // $ANTLR start "rule__ScriptBody__Group__2__Impl"
    // InternalJoveNotes.g:7532:1: rule__ScriptBody__Group__2__Impl : ( ( rule__ScriptBody__ScriptAssignment_2 ) ) ;
    public final void rule__ScriptBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7536:1: ( ( ( rule__ScriptBody__ScriptAssignment_2 ) ) )
            // InternalJoveNotes.g:7537:1: ( ( rule__ScriptBody__ScriptAssignment_2 ) )
            {
            // InternalJoveNotes.g:7537:1: ( ( rule__ScriptBody__ScriptAssignment_2 ) )
            // InternalJoveNotes.g:7538:1: ( rule__ScriptBody__ScriptAssignment_2 )
            {
             before(grammarAccess.getScriptBodyAccess().getScriptAssignment_2()); 
            // InternalJoveNotes.g:7539:1: ( rule__ScriptBody__ScriptAssignment_2 )
            // InternalJoveNotes.g:7539:2: rule__ScriptBody__ScriptAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ScriptBody__ScriptAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScriptBodyAccess().getScriptAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__Group__2__Impl"


    // $ANTLR start "rule__ScriptBody__Group__3"
    // InternalJoveNotes.g:7549:1: rule__ScriptBody__Group__3 : rule__ScriptBody__Group__3__Impl ;
    public final void rule__ScriptBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7553:1: ( rule__ScriptBody__Group__3__Impl )
            // InternalJoveNotes.g:7554:2: rule__ScriptBody__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScriptBody__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__Group__3"


    // $ANTLR start "rule__ScriptBody__Group__3__Impl"
    // InternalJoveNotes.g:7560:1: rule__ScriptBody__Group__3__Impl : ( '}' ) ;
    public final void rule__ScriptBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7564:1: ( ( '}' ) )
            // InternalJoveNotes.g:7565:1: ( '}' )
            {
            // InternalJoveNotes.g:7565:1: ( '}' )
            // InternalJoveNotes.g:7566:1: '}'
            {
             before(grammarAccess.getScriptBodyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getScriptBodyAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__Group__3__Impl"


    // $ANTLR start "rule__JoveNotes__ProcessingHintsAssignment_0"
    // InternalJoveNotes.g:7588:1: rule__JoveNotes__ProcessingHintsAssignment_0 : ( ruleProcessingHints ) ;
    public final void rule__JoveNotes__ProcessingHintsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7592:1: ( ( ruleProcessingHints ) )
            // InternalJoveNotes.g:7593:1: ( ruleProcessingHints )
            {
            // InternalJoveNotes.g:7593:1: ( ruleProcessingHints )
            // InternalJoveNotes.g:7594:1: ruleProcessingHints
            {
             before(grammarAccess.getJoveNotesAccess().getProcessingHintsProcessingHintsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessingHints();

            state._fsp--;

             after(grammarAccess.getJoveNotesAccess().getProcessingHintsProcessingHintsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__ProcessingHintsAssignment_0"


    // $ANTLR start "rule__JoveNotes__ChapterDetailsAssignment_1"
    // InternalJoveNotes.g:7603:1: rule__JoveNotes__ChapterDetailsAssignment_1 : ( ruleChapterDetails ) ;
    public final void rule__JoveNotes__ChapterDetailsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7607:1: ( ( ruleChapterDetails ) )
            // InternalJoveNotes.g:7608:1: ( ruleChapterDetails )
            {
            // InternalJoveNotes.g:7608:1: ( ruleChapterDetails )
            // InternalJoveNotes.g:7609:1: ruleChapterDetails
            {
             before(grammarAccess.getJoveNotesAccess().getChapterDetailsChapterDetailsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChapterDetails();

            state._fsp--;

             after(grammarAccess.getJoveNotesAccess().getChapterDetailsChapterDetailsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__ChapterDetailsAssignment_1"


    // $ANTLR start "rule__JoveNotes__NotesElementsAssignment_2"
    // InternalJoveNotes.g:7618:1: rule__JoveNotes__NotesElementsAssignment_2 : ( ruleNotesElement ) ;
    public final void rule__JoveNotes__NotesElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7622:1: ( ( ruleNotesElement ) )
            // InternalJoveNotes.g:7623:1: ( ruleNotesElement )
            {
            // InternalJoveNotes.g:7623:1: ( ruleNotesElement )
            // InternalJoveNotes.g:7624:1: ruleNotesElement
            {
             before(grammarAccess.getJoveNotesAccess().getNotesElementsNotesElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNotesElement();

            state._fsp--;

             after(grammarAccess.getJoveNotesAccess().getNotesElementsNotesElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__NotesElementsAssignment_2"


    // $ANTLR start "rule__ProcessingHints__SkipGenerationAssignment_1"
    // InternalJoveNotes.g:7633:1: rule__ProcessingHints__SkipGenerationAssignment_1 : ( ( '@skip_generation' ) ) ;
    public final void rule__ProcessingHints__SkipGenerationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7637:1: ( ( ( '@skip_generation' ) ) )
            // InternalJoveNotes.g:7638:1: ( ( '@skip_generation' ) )
            {
            // InternalJoveNotes.g:7638:1: ( ( '@skip_generation' ) )
            // InternalJoveNotes.g:7639:1: ( '@skip_generation' )
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_1_0()); 
            // InternalJoveNotes.g:7640:1: ( '@skip_generation' )
            // InternalJoveNotes.g:7641:1: '@skip_generation'
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_1_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_1_0()); 

            }

             after(grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingHints__SkipGenerationAssignment_1"


    // $ANTLR start "rule__ProcessingHints__SkipGenerationInProductionAssignment_2"
    // InternalJoveNotes.g:7656:1: rule__ProcessingHints__SkipGenerationInProductionAssignment_2 : ( ( '@skip_generation_in_production' ) ) ;
    public final void rule__ProcessingHints__SkipGenerationInProductionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7660:1: ( ( ( '@skip_generation_in_production' ) ) )
            // InternalJoveNotes.g:7661:1: ( ( '@skip_generation_in_production' ) )
            {
            // InternalJoveNotes.g:7661:1: ( ( '@skip_generation_in_production' ) )
            // InternalJoveNotes.g:7662:1: ( '@skip_generation_in_production' )
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionSkip_generation_in_productionKeyword_2_0()); 
            // InternalJoveNotes.g:7663:1: ( '@skip_generation_in_production' )
            // InternalJoveNotes.g:7664:1: '@skip_generation_in_production'
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionSkip_generation_in_productionKeyword_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionSkip_generation_in_productionKeyword_2_0()); 

            }

             after(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionSkip_generation_in_productionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingHints__SkipGenerationInProductionAssignment_2"


    // $ANTLR start "rule__ChapterDetails__ExerciseBankAssignment_0"
    // InternalJoveNotes.g:7679:1: rule__ChapterDetails__ExerciseBankAssignment_0 : ( ( '@exercise_bank' ) ) ;
    public final void rule__ChapterDetails__ExerciseBankAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7683:1: ( ( ( '@exercise_bank' ) ) )
            // InternalJoveNotes.g:7684:1: ( ( '@exercise_bank' ) )
            {
            // InternalJoveNotes.g:7684:1: ( ( '@exercise_bank' ) )
            // InternalJoveNotes.g:7685:1: ( '@exercise_bank' )
            {
             before(grammarAccess.getChapterDetailsAccess().getExerciseBankExercise_bankKeyword_0_0()); 
            // InternalJoveNotes.g:7686:1: ( '@exercise_bank' )
            // InternalJoveNotes.g:7687:1: '@exercise_bank'
            {
             before(grammarAccess.getChapterDetailsAccess().getExerciseBankExercise_bankKeyword_0_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getChapterDetailsAccess().getExerciseBankExercise_bankKeyword_0_0()); 

            }

             after(grammarAccess.getChapterDetailsAccess().getExerciseBankExercise_bankKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__ExerciseBankAssignment_0"


    // $ANTLR start "rule__ChapterDetails__SubjectNameAssignment_2"
    // InternalJoveNotes.g:7702:1: rule__ChapterDetails__SubjectNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ChapterDetails__SubjectNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7706:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7707:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7707:1: ( RULE_STRING )
            // InternalJoveNotes.g:7708:1: RULE_STRING
            {
             before(grammarAccess.getChapterDetailsAccess().getSubjectNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChapterDetailsAccess().getSubjectNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__SubjectNameAssignment_2"


    // $ANTLR start "rule__ChapterDetails__ChapterNumberAssignment_4"
    // InternalJoveNotes.g:7717:1: rule__ChapterDetails__ChapterNumberAssignment_4 : ( RULE_INT ) ;
    public final void rule__ChapterDetails__ChapterNumberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7721:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:7722:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:7722:1: ( RULE_INT )
            // InternalJoveNotes.g:7723:1: RULE_INT
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNumberINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getChapterDetailsAccess().getChapterNumberINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__ChapterNumberAssignment_4"


    // $ANTLR start "rule__ChapterDetails__SubChapterNumberAssignment_6"
    // InternalJoveNotes.g:7732:1: rule__ChapterDetails__SubChapterNumberAssignment_6 : ( RULE_INT ) ;
    public final void rule__ChapterDetails__SubChapterNumberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7736:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:7737:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:7737:1: ( RULE_INT )
            // InternalJoveNotes.g:7738:1: RULE_INT
            {
             before(grammarAccess.getChapterDetailsAccess().getSubChapterNumberINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getChapterDetailsAccess().getSubChapterNumberINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__SubChapterNumberAssignment_6"


    // $ANTLR start "rule__ChapterDetails__ChapterNameAssignment_8"
    // InternalJoveNotes.g:7747:1: rule__ChapterDetails__ChapterNameAssignment_8 : ( RULE_STRING ) ;
    public final void rule__ChapterDetails__ChapterNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7751:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7752:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7752:1: ( RULE_STRING )
            // InternalJoveNotes.g:7753:1: RULE_STRING
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNameSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChapterDetailsAccess().getChapterNameSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__ChapterNameAssignment_8"


    // $ANTLR start "rule__ChapterDetails__ScriptBodyAssignment_9"
    // InternalJoveNotes.g:7762:1: rule__ChapterDetails__ScriptBodyAssignment_9 : ( ruleScriptBody ) ;
    public final void rule__ChapterDetails__ScriptBodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7766:1: ( ( ruleScriptBody ) )
            // InternalJoveNotes.g:7767:1: ( ruleScriptBody )
            {
            // InternalJoveNotes.g:7767:1: ( ruleScriptBody )
            // InternalJoveNotes.g:7768:1: ruleScriptBody
            {
             before(grammarAccess.getChapterDetailsAccess().getScriptBodyScriptBodyParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleScriptBody();

            state._fsp--;

             after(grammarAccess.getChapterDetailsAccess().getScriptBodyScriptBodyParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__ScriptBodyAssignment_9"


    // $ANTLR start "rule__NotesElement__ScriptAssignment_1"
    // InternalJoveNotes.g:7777:1: rule__NotesElement__ScriptAssignment_1 : ( ruleScript ) ;
    public final void rule__NotesElement__ScriptAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7781:1: ( ( ruleScript ) )
            // InternalJoveNotes.g:7782:1: ( ruleScript )
            {
            // InternalJoveNotes.g:7782:1: ( ruleScript )
            // InternalJoveNotes.g:7783:1: ruleScript
            {
             before(grammarAccess.getNotesElementAccess().getScriptScriptParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getNotesElementAccess().getScriptScriptParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotesElement__ScriptAssignment_1"


    // $ANTLR start "rule__WordMeaning__HideFromViewAssignment_1"
    // InternalJoveNotes.g:7792:1: rule__WordMeaning__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__WordMeaning__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7796:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:7797:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:7797:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:7798:1: ( 'hide' )
            {
             before(grammarAccess.getWordMeaningAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:7799:1: ( 'hide' )
            // InternalJoveNotes.g:7800:1: 'hide'
            {
             before(grammarAccess.getWordMeaningAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getWordMeaningAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getWordMeaningAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__HideFromViewAssignment_1"


    // $ANTLR start "rule__WordMeaning__WordAssignment_2"
    // InternalJoveNotes.g:7815:1: rule__WordMeaning__WordAssignment_2 : ( RULE_STRING ) ;
    public final void rule__WordMeaning__WordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7819:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7820:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7820:1: ( RULE_STRING )
            // InternalJoveNotes.g:7821:1: RULE_STRING
            {
             before(grammarAccess.getWordMeaningAccess().getWordSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWordMeaningAccess().getWordSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__WordAssignment_2"


    // $ANTLR start "rule__WordMeaning__MeaningAssignment_3"
    // InternalJoveNotes.g:7830:1: rule__WordMeaning__MeaningAssignment_3 : ( RULE_STRING ) ;
    public final void rule__WordMeaning__MeaningAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7834:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7835:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7835:1: ( RULE_STRING )
            // InternalJoveNotes.g:7836:1: RULE_STRING
            {
             before(grammarAccess.getWordMeaningAccess().getMeaningSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWordMeaningAccess().getMeaningSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__MeaningAssignment_3"


    // $ANTLR start "rule__QuestionAnswer__HideFromViewAssignment_1"
    // InternalJoveNotes.g:7845:1: rule__QuestionAnswer__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__QuestionAnswer__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7849:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:7850:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:7850:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:7851:1: ( 'hide' )
            {
             before(grammarAccess.getQuestionAnswerAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:7852:1: ( 'hide' )
            // InternalJoveNotes.g:7853:1: 'hide'
            {
             before(grammarAccess.getQuestionAnswerAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getQuestionAnswerAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getQuestionAnswerAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__HideFromViewAssignment_1"


    // $ANTLR start "rule__QuestionAnswer__QuestionAssignment_2"
    // InternalJoveNotes.g:7868:1: rule__QuestionAnswer__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuestionAnswer__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7872:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7873:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7873:1: ( RULE_STRING )
            // InternalJoveNotes.g:7874:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAnswerAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQuestionAnswerAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__QuestionAssignment_2"


    // $ANTLR start "rule__QuestionAnswer__AnswerPartsAssignment_3"
    // InternalJoveNotes.g:7883:1: rule__QuestionAnswer__AnswerPartsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__QuestionAnswer__AnswerPartsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7887:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7888:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7888:1: ( RULE_STRING )
            // InternalJoveNotes.g:7889:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAnswerAccess().getAnswerPartsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQuestionAnswerAccess().getAnswerPartsSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__AnswerPartsAssignment_3"


    // $ANTLR start "rule__QuestionAnswer__CmapAssignment_4"
    // InternalJoveNotes.g:7898:1: rule__QuestionAnswer__CmapAssignment_4 : ( ruleCMap ) ;
    public final void rule__QuestionAnswer__CmapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7902:1: ( ( ruleCMap ) )
            // InternalJoveNotes.g:7903:1: ( ruleCMap )
            {
            // InternalJoveNotes.g:7903:1: ( ruleCMap )
            // InternalJoveNotes.g:7904:1: ruleCMap
            {
             before(grammarAccess.getQuestionAnswerAccess().getCmapCMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCMap();

            state._fsp--;

             after(grammarAccess.getQuestionAnswerAccess().getCmapCMapParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__CmapAssignment_4"


    // $ANTLR start "rule__FIB__HideFromViewAssignment_1"
    // InternalJoveNotes.g:7913:1: rule__FIB__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__FIB__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7917:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:7918:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:7918:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:7919:1: ( 'hide' )
            {
             before(grammarAccess.getFIBAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:7920:1: ( 'hide' )
            // InternalJoveNotes.g:7921:1: 'hide'
            {
             before(grammarAccess.getFIBAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getFIBAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getFIBAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__HideFromViewAssignment_1"


    // $ANTLR start "rule__FIB__QuestionAssignment_2"
    // InternalJoveNotes.g:7936:1: rule__FIB__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FIB__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7940:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7941:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7941:1: ( RULE_STRING )
            // InternalJoveNotes.g:7942:1: RULE_STRING
            {
             before(grammarAccess.getFIBAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFIBAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__QuestionAssignment_2"


    // $ANTLR start "rule__FIB__AnswersAssignment_3"
    // InternalJoveNotes.g:7951:1: rule__FIB__AnswersAssignment_3 : ( RULE_STRING ) ;
    public final void rule__FIB__AnswersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7955:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7956:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7956:1: ( RULE_STRING )
            // InternalJoveNotes.g:7957:1: RULE_STRING
            {
             before(grammarAccess.getFIBAccess().getAnswersSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFIBAccess().getAnswersSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__AnswersAssignment_3"


    // $ANTLR start "rule__Definition__HideFromViewAssignment_1"
    // InternalJoveNotes.g:7966:1: rule__Definition__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Definition__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7970:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:7971:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:7971:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:7972:1: ( 'hide' )
            {
             before(grammarAccess.getDefinitionAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:7973:1: ( 'hide' )
            // InternalJoveNotes.g:7974:1: 'hide'
            {
             before(grammarAccess.getDefinitionAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getDefinitionAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__HideFromViewAssignment_1"


    // $ANTLR start "rule__Definition__TermAssignment_2"
    // InternalJoveNotes.g:7989:1: rule__Definition__TermAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Definition__TermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7993:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7994:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7994:1: ( RULE_STRING )
            // InternalJoveNotes.g:7995:1: RULE_STRING
            {
             before(grammarAccess.getDefinitionAccess().getTermSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getTermSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__TermAssignment_2"


    // $ANTLR start "rule__Definition__DefinitionAssignment_3"
    // InternalJoveNotes.g:8004:1: rule__Definition__DefinitionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Definition__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8008:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8009:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8009:1: ( RULE_STRING )
            // InternalJoveNotes.g:8010:1: RULE_STRING
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getDefinitionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__DefinitionAssignment_3"


    // $ANTLR start "rule__Definition__CmapAssignment_4"
    // InternalJoveNotes.g:8019:1: rule__Definition__CmapAssignment_4 : ( ruleCMap ) ;
    public final void rule__Definition__CmapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8023:1: ( ( ruleCMap ) )
            // InternalJoveNotes.g:8024:1: ( ruleCMap )
            {
            // InternalJoveNotes.g:8024:1: ( ruleCMap )
            // InternalJoveNotes.g:8025:1: ruleCMap
            {
             before(grammarAccess.getDefinitionAccess().getCmapCMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCMap();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getCmapCMapParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__CmapAssignment_4"


    // $ANTLR start "rule__Character__HideFromViewAssignment_1"
    // InternalJoveNotes.g:8034:1: rule__Character__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Character__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8038:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8039:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8039:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8040:1: ( 'hide' )
            {
             before(grammarAccess.getCharacterAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8041:1: ( 'hide' )
            // InternalJoveNotes.g:8042:1: 'hide'
            {
             before(grammarAccess.getCharacterAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getCharacterAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__HideFromViewAssignment_1"


    // $ANTLR start "rule__Character__CharacterAssignment_2"
    // InternalJoveNotes.g:8057:1: rule__Character__CharacterAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Character__CharacterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8061:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8062:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8062:1: ( RULE_STRING )
            // InternalJoveNotes.g:8063:1: RULE_STRING
            {
             before(grammarAccess.getCharacterAccess().getCharacterSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getCharacterSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__CharacterAssignment_2"


    // $ANTLR start "rule__Character__EstimateAssignment_3"
    // InternalJoveNotes.g:8072:1: rule__Character__EstimateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Character__EstimateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8076:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8077:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8077:1: ( RULE_STRING )
            // InternalJoveNotes.g:8078:1: RULE_STRING
            {
             before(grammarAccess.getCharacterAccess().getEstimateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getEstimateSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__EstimateAssignment_3"


    // $ANTLR start "rule__Character__CmapAssignment_4"
    // InternalJoveNotes.g:8087:1: rule__Character__CmapAssignment_4 : ( ruleCMap ) ;
    public final void rule__Character__CmapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8091:1: ( ( ruleCMap ) )
            // InternalJoveNotes.g:8092:1: ( ruleCMap )
            {
            // InternalJoveNotes.g:8092:1: ( ruleCMap )
            // InternalJoveNotes.g:8093:1: ruleCMap
            {
             before(grammarAccess.getCharacterAccess().getCmapCMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCMap();

            state._fsp--;

             after(grammarAccess.getCharacterAccess().getCmapCMapParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__CmapAssignment_4"


    // $ANTLR start "rule__TeacherNote__HideFromViewAssignment_1"
    // InternalJoveNotes.g:8102:1: rule__TeacherNote__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__TeacherNote__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8106:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8107:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8107:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8108:1: ( 'hide' )
            {
             before(grammarAccess.getTeacherNoteAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8109:1: ( 'hide' )
            // InternalJoveNotes.g:8110:1: 'hide'
            {
             before(grammarAccess.getTeacherNoteAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getTeacherNoteAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getTeacherNoteAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__HideFromViewAssignment_1"


    // $ANTLR start "rule__TeacherNote__CaptionAssignment_2"
    // InternalJoveNotes.g:8125:1: rule__TeacherNote__CaptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TeacherNote__CaptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8129:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8130:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8130:1: ( RULE_STRING )
            // InternalJoveNotes.g:8131:1: RULE_STRING
            {
             before(grammarAccess.getTeacherNoteAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTeacherNoteAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__CaptionAssignment_2"


    // $ANTLR start "rule__TeacherNote__NoteAssignment_3"
    // InternalJoveNotes.g:8140:1: rule__TeacherNote__NoteAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TeacherNote__NoteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8144:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8145:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8145:1: ( RULE_STRING )
            // InternalJoveNotes.g:8146:1: RULE_STRING
            {
             before(grammarAccess.getTeacherNoteAccess().getNoteSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTeacherNoteAccess().getNoteSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__NoteAssignment_3"


    // $ANTLR start "rule__TeacherNote__CmapAssignment_4"
    // InternalJoveNotes.g:8155:1: rule__TeacherNote__CmapAssignment_4 : ( ruleCMap ) ;
    public final void rule__TeacherNote__CmapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8159:1: ( ( ruleCMap ) )
            // InternalJoveNotes.g:8160:1: ( ruleCMap )
            {
            // InternalJoveNotes.g:8160:1: ( ruleCMap )
            // InternalJoveNotes.g:8161:1: ruleCMap
            {
             before(grammarAccess.getTeacherNoteAccess().getCmapCMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCMap();

            state._fsp--;

             after(grammarAccess.getTeacherNoteAccess().getCmapCMapParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__CmapAssignment_4"


    // $ANTLR start "rule__Matching__HideFromViewAssignment_1"
    // InternalJoveNotes.g:8170:1: rule__Matching__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Matching__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8174:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8175:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8175:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8176:1: ( 'hide' )
            {
             before(grammarAccess.getMatchingAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8177:1: ( 'hide' )
            // InternalJoveNotes.g:8178:1: 'hide'
            {
             before(grammarAccess.getMatchingAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getMatchingAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getMatchingAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__HideFromViewAssignment_1"


    // $ANTLR start "rule__Matching__SkipReverseQuestionAssignment_2"
    // InternalJoveNotes.g:8193:1: rule__Matching__SkipReverseQuestionAssignment_2 : ( ( 'skip_reverse_question' ) ) ;
    public final void rule__Matching__SkipReverseQuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8197:1: ( ( ( 'skip_reverse_question' ) ) )
            // InternalJoveNotes.g:8198:1: ( ( 'skip_reverse_question' ) )
            {
            // InternalJoveNotes.g:8198:1: ( ( 'skip_reverse_question' ) )
            // InternalJoveNotes.g:8199:1: ( 'skip_reverse_question' )
            {
             before(grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_2_0()); 
            // InternalJoveNotes.g:8200:1: ( 'skip_reverse_question' )
            // InternalJoveNotes.g:8201:1: 'skip_reverse_question'
            {
             before(grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_2_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_2_0()); 

            }

             after(grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__SkipReverseQuestionAssignment_2"


    // $ANTLR start "rule__Matching__QuestionAssignment_3"
    // InternalJoveNotes.g:8216:1: rule__Matching__QuestionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Matching__QuestionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8220:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8221:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8221:1: ( RULE_STRING )
            // InternalJoveNotes.g:8222:1: RULE_STRING
            {
             before(grammarAccess.getMatchingAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMatchingAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__QuestionAssignment_3"


    // $ANTLR start "rule__Matching__PairsAssignment_5"
    // InternalJoveNotes.g:8231:1: rule__Matching__PairsAssignment_5 : ( ruleMatchPair ) ;
    public final void rule__Matching__PairsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8235:1: ( ( ruleMatchPair ) )
            // InternalJoveNotes.g:8236:1: ( ruleMatchPair )
            {
            // InternalJoveNotes.g:8236:1: ( ruleMatchPair )
            // InternalJoveNotes.g:8237:1: ruleMatchPair
            {
             before(grammarAccess.getMatchingAccess().getPairsMatchPairParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMatchPair();

            state._fsp--;

             after(grammarAccess.getMatchingAccess().getPairsMatchPairParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__PairsAssignment_5"


    // $ANTLR start "rule__Matching__McqConfigAssignment_6"
    // InternalJoveNotes.g:8246:1: rule__Matching__McqConfigAssignment_6 : ( ruleMatchMCQConfig ) ;
    public final void rule__Matching__McqConfigAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8250:1: ( ( ruleMatchMCQConfig ) )
            // InternalJoveNotes.g:8251:1: ( ruleMatchMCQConfig )
            {
            // InternalJoveNotes.g:8251:1: ( ruleMatchMCQConfig )
            // InternalJoveNotes.g:8252:1: ruleMatchMCQConfig
            {
             before(grammarAccess.getMatchingAccess().getMcqConfigMatchMCQConfigParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMatchMCQConfig();

            state._fsp--;

             after(grammarAccess.getMatchingAccess().getMcqConfigMatchMCQConfigParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__McqConfigAssignment_6"


    // $ANTLR start "rule__MatchPair__MatchQuestionAssignment_0"
    // InternalJoveNotes.g:8261:1: rule__MatchPair__MatchQuestionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MatchPair__MatchQuestionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8265:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8266:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8266:1: ( RULE_STRING )
            // InternalJoveNotes.g:8267:1: RULE_STRING
            {
             before(grammarAccess.getMatchPairAccess().getMatchQuestionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMatchPairAccess().getMatchQuestionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPair__MatchQuestionAssignment_0"


    // $ANTLR start "rule__MatchPair__MatchAnswerAssignment_2"
    // InternalJoveNotes.g:8276:1: rule__MatchPair__MatchAnswerAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MatchPair__MatchAnswerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8280:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8281:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8281:1: ( RULE_STRING )
            // InternalJoveNotes.g:8282:1: RULE_STRING
            {
             before(grammarAccess.getMatchPairAccess().getMatchAnswerSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMatchPairAccess().getMatchAnswerSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPair__MatchAnswerAssignment_2"


    // $ANTLR start "rule__MatchMCQConfig__ForwardCaptionAssignment_3"
    // InternalJoveNotes.g:8291:1: rule__MatchMCQConfig__ForwardCaptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__MatchMCQConfig__ForwardCaptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8295:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8296:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8296:1: ( RULE_STRING )
            // InternalJoveNotes.g:8297:1: RULE_STRING
            {
             before(grammarAccess.getMatchMCQConfigAccess().getForwardCaptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMatchMCQConfigAccess().getForwardCaptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__ForwardCaptionAssignment_3"


    // $ANTLR start "rule__MatchMCQConfig__ReverseCaptionAssignment_4_1"
    // InternalJoveNotes.g:8306:1: rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__MatchMCQConfig__ReverseCaptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8310:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8311:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8311:1: ( RULE_STRING )
            // InternalJoveNotes.g:8312:1: RULE_STRING
            {
             before(grammarAccess.getMatchMCQConfigAccess().getReverseCaptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMatchMCQConfigAccess().getReverseCaptionSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__ReverseCaptionAssignment_4_1"


    // $ANTLR start "rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1"
    // InternalJoveNotes.g:8321:1: rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8325:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:8326:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:8326:1: ( RULE_INT )
            // InternalJoveNotes.g:8327:1: RULE_INT
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1"


    // $ANTLR start "rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1"
    // InternalJoveNotes.g:8336:1: rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8340:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:8341:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:8341:1: ( RULE_INT )
            // InternalJoveNotes.g:8342:1: RULE_INT
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1"


    // $ANTLR start "rule__Event__HideFromViewAssignment_1"
    // InternalJoveNotes.g:8351:1: rule__Event__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Event__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8355:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8356:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8356:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8357:1: ( 'hide' )
            {
             before(grammarAccess.getEventAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8358:1: ( 'hide' )
            // InternalJoveNotes.g:8359:1: 'hide'
            {
             before(grammarAccess.getEventAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getEventAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__HideFromViewAssignment_1"


    // $ANTLR start "rule__Event__EventAssignment_2"
    // InternalJoveNotes.g:8374:1: rule__Event__EventAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Event__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8378:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8379:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8379:1: ( RULE_STRING )
            // InternalJoveNotes.g:8380:1: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getEventSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getEventSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventAssignment_2"


    // $ANTLR start "rule__Event__TimeAssignment_3"
    // InternalJoveNotes.g:8389:1: rule__Event__TimeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Event__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8393:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8394:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8394:1: ( RULE_STRING )
            // InternalJoveNotes.g:8395:1: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getTimeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getTimeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__TimeAssignment_3"


    // $ANTLR start "rule__TrueFalse__HideFromViewAssignment_1"
    // InternalJoveNotes.g:8404:1: rule__TrueFalse__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__TrueFalse__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8408:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8409:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8409:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8410:1: ( 'hide' )
            {
             before(grammarAccess.getTrueFalseAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8411:1: ( 'hide' )
            // InternalJoveNotes.g:8412:1: 'hide'
            {
             before(grammarAccess.getTrueFalseAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getTrueFalseAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getTrueFalseAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__HideFromViewAssignment_1"


    // $ANTLR start "rule__TrueFalse__StatementAssignment_2"
    // InternalJoveNotes.g:8427:1: rule__TrueFalse__StatementAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TrueFalse__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8431:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8432:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8432:1: ( RULE_STRING )
            // InternalJoveNotes.g:8433:1: RULE_STRING
            {
             before(grammarAccess.getTrueFalseAccess().getStatementSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTrueFalseAccess().getStatementSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__StatementAssignment_2"


    // $ANTLR start "rule__TrueFalse__TruthValueAssignment_3"
    // InternalJoveNotes.g:8442:1: rule__TrueFalse__TruthValueAssignment_3 : ( RULE_BOOL ) ;
    public final void rule__TrueFalse__TruthValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8446:1: ( ( RULE_BOOL ) )
            // InternalJoveNotes.g:8447:1: ( RULE_BOOL )
            {
            // InternalJoveNotes.g:8447:1: ( RULE_BOOL )
            // InternalJoveNotes.g:8448:1: RULE_BOOL
            {
             before(grammarAccess.getTrueFalseAccess().getTruthValueBOOLTerminalRuleCall_3_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getTrueFalseAccess().getTruthValueBOOLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__TruthValueAssignment_3"


    // $ANTLR start "rule__TrueFalse__JustificationAssignment_4"
    // InternalJoveNotes.g:8457:1: rule__TrueFalse__JustificationAssignment_4 : ( RULE_STRING ) ;
    public final void rule__TrueFalse__JustificationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8461:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8462:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8462:1: ( RULE_STRING )
            // InternalJoveNotes.g:8463:1: RULE_STRING
            {
             before(grammarAccess.getTrueFalseAccess().getJustificationSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTrueFalseAccess().getJustificationSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__JustificationAssignment_4"


    // $ANTLR start "rule__ChemEquation__HideFromViewAssignment_1"
    // InternalJoveNotes.g:8472:1: rule__ChemEquation__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__ChemEquation__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8476:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8477:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8477:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8478:1: ( 'hide' )
            {
             before(grammarAccess.getChemEquationAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8479:1: ( 'hide' )
            // InternalJoveNotes.g:8480:1: 'hide'
            {
             before(grammarAccess.getChemEquationAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getChemEquationAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getChemEquationAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__HideFromViewAssignment_1"


    // $ANTLR start "rule__ChemEquation__DescriptionAssignment_2"
    // InternalJoveNotes.g:8495:1: rule__ChemEquation__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8499:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8500:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8500:1: ( RULE_STRING )
            // InternalJoveNotes.g:8501:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChemEquationAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__DescriptionAssignment_2"


    // $ANTLR start "rule__ChemEquation__ReactantsAssignment_4"
    // InternalJoveNotes.g:8510:1: rule__ChemEquation__ReactantsAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__ReactantsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8514:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8515:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8515:1: ( RULE_STRING )
            // InternalJoveNotes.g:8516:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getReactantsSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChemEquationAccess().getReactantsSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__ReactantsAssignment_4"


    // $ANTLR start "rule__ChemEquation__ProducesAssignment_6"
    // InternalJoveNotes.g:8525:1: rule__ChemEquation__ProducesAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__ProducesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8529:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8530:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8530:1: ( RULE_STRING )
            // InternalJoveNotes.g:8531:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getProducesSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChemEquationAccess().getProducesSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__ProducesAssignment_6"


    // $ANTLR start "rule__ChemEquation__ProductsAssignment_8"
    // InternalJoveNotes.g:8540:1: rule__ChemEquation__ProductsAssignment_8 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__ProductsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8544:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8545:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8545:1: ( RULE_STRING )
            // InternalJoveNotes.g:8546:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getProductsSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChemEquationAccess().getProductsSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__ProductsAssignment_8"


    // $ANTLR start "rule__ChemCompound__HideFromViewAssignment_1"
    // InternalJoveNotes.g:8555:1: rule__ChemCompound__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__ChemCompound__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8559:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8560:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8560:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8561:1: ( 'hide' )
            {
             before(grammarAccess.getChemCompoundAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8562:1: ( 'hide' )
            // InternalJoveNotes.g:8563:1: 'hide'
            {
             before(grammarAccess.getChemCompoundAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getChemCompoundAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getChemCompoundAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__HideFromViewAssignment_1"


    // $ANTLR start "rule__ChemCompound__SymbolAssignment_2"
    // InternalJoveNotes.g:8578:1: rule__ChemCompound__SymbolAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ChemCompound__SymbolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8582:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8583:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8583:1: ( RULE_STRING )
            // InternalJoveNotes.g:8584:1: RULE_STRING
            {
             before(grammarAccess.getChemCompoundAccess().getSymbolSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChemCompoundAccess().getSymbolSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__SymbolAssignment_2"


    // $ANTLR start "rule__ChemCompound__ChemicalNameAssignment_3"
    // InternalJoveNotes.g:8593:1: rule__ChemCompound__ChemicalNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ChemCompound__ChemicalNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8597:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8598:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8598:1: ( RULE_STRING )
            // InternalJoveNotes.g:8599:1: RULE_STRING
            {
             before(grammarAccess.getChemCompoundAccess().getChemicalNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChemCompoundAccess().getChemicalNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__ChemicalNameAssignment_3"


    // $ANTLR start "rule__ChemCompound__CommonNameAssignment_4"
    // InternalJoveNotes.g:8608:1: rule__ChemCompound__CommonNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ChemCompound__CommonNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8612:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8613:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8613:1: ( RULE_STRING )
            // InternalJoveNotes.g:8614:1: RULE_STRING
            {
             before(grammarAccess.getChemCompoundAccess().getCommonNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChemCompoundAccess().getCommonNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__CommonNameAssignment_4"


    // $ANTLR start "rule__Spellbee__HideFromViewAssignment_1"
    // InternalJoveNotes.g:8623:1: rule__Spellbee__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Spellbee__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8627:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8628:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8628:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8629:1: ( 'hide' )
            {
             before(grammarAccess.getSpellbeeAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8630:1: ( 'hide' )
            // InternalJoveNotes.g:8631:1: 'hide'
            {
             before(grammarAccess.getSpellbeeAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getSpellbeeAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getSpellbeeAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spellbee__HideFromViewAssignment_1"


    // $ANTLR start "rule__Spellbee__WordAssignment_2"
    // InternalJoveNotes.g:8646:1: rule__Spellbee__WordAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Spellbee__WordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8650:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8651:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8651:1: ( RULE_STRING )
            // InternalJoveNotes.g:8652:1: RULE_STRING
            {
             before(grammarAccess.getSpellbeeAccess().getWordSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSpellbeeAccess().getWordSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spellbee__WordAssignment_2"


    // $ANTLR start "rule__ImageLabel__HideFromViewAssignment_1"
    // InternalJoveNotes.g:8661:1: rule__ImageLabel__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__ImageLabel__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8665:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8666:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8666:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8667:1: ( 'hide' )
            {
             before(grammarAccess.getImageLabelAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8668:1: ( 'hide' )
            // InternalJoveNotes.g:8669:1: 'hide'
            {
             before(grammarAccess.getImageLabelAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getImageLabelAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getImageLabelAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__HideFromViewAssignment_1"


    // $ANTLR start "rule__ImageLabel__CaptionAssignment_2"
    // InternalJoveNotes.g:8684:1: rule__ImageLabel__CaptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ImageLabel__CaptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8688:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8689:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8689:1: ( RULE_STRING )
            // InternalJoveNotes.g:8690:1: RULE_STRING
            {
             before(grammarAccess.getImageLabelAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImageLabelAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__CaptionAssignment_2"


    // $ANTLR start "rule__ImageLabel__ImageNameAssignment_5"
    // InternalJoveNotes.g:8699:1: rule__ImageLabel__ImageNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ImageLabel__ImageNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8703:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8704:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8704:1: ( RULE_STRING )
            // InternalJoveNotes.g:8705:1: RULE_STRING
            {
             before(grammarAccess.getImageLabelAccess().getImageNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImageLabelAccess().getImageNameSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__ImageNameAssignment_5"


    // $ANTLR start "rule__ImageLabel__HotspotsAssignment_6"
    // InternalJoveNotes.g:8714:1: rule__ImageLabel__HotspotsAssignment_6 : ( ruleHotSpot ) ;
    public final void rule__ImageLabel__HotspotsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8718:1: ( ( ruleHotSpot ) )
            // InternalJoveNotes.g:8719:1: ( ruleHotSpot )
            {
            // InternalJoveNotes.g:8719:1: ( ruleHotSpot )
            // InternalJoveNotes.g:8720:1: ruleHotSpot
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleHotSpot();

            state._fsp--;

             after(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__HotspotsAssignment_6"


    // $ANTLR start "rule__ImageLabel__HotspotsAssignment_7_1"
    // InternalJoveNotes.g:8729:1: rule__ImageLabel__HotspotsAssignment_7_1 : ( ruleHotSpot ) ;
    public final void rule__ImageLabel__HotspotsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8733:1: ( ( ruleHotSpot ) )
            // InternalJoveNotes.g:8734:1: ( ruleHotSpot )
            {
            // InternalJoveNotes.g:8734:1: ( ruleHotSpot )
            // InternalJoveNotes.g:8735:1: ruleHotSpot
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHotSpot();

            state._fsp--;

             after(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__HotspotsAssignment_7_1"


    // $ANTLR start "rule__HotSpot__XAssignment_0"
    // InternalJoveNotes.g:8744:1: rule__HotSpot__XAssignment_0 : ( RULE_INT ) ;
    public final void rule__HotSpot__XAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8748:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:8749:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:8749:1: ( RULE_INT )
            // InternalJoveNotes.g:8750:1: RULE_INT
            {
             before(grammarAccess.getHotSpotAccess().getXINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHotSpotAccess().getXINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__XAssignment_0"


    // $ANTLR start "rule__HotSpot__YAssignment_2"
    // InternalJoveNotes.g:8759:1: rule__HotSpot__YAssignment_2 : ( RULE_INT ) ;
    public final void rule__HotSpot__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8763:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:8764:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:8764:1: ( RULE_INT )
            // InternalJoveNotes.g:8765:1: RULE_INT
            {
             before(grammarAccess.getHotSpotAccess().getYINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHotSpotAccess().getYINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__YAssignment_2"


    // $ANTLR start "rule__HotSpot__LabelAssignment_4"
    // InternalJoveNotes.g:8774:1: rule__HotSpot__LabelAssignment_4 : ( RULE_STRING ) ;
    public final void rule__HotSpot__LabelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8778:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8779:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8779:1: ( RULE_STRING )
            // InternalJoveNotes.g:8780:1: RULE_STRING
            {
             before(grammarAccess.getHotSpotAccess().getLabelSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHotSpotAccess().getLabelSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__LabelAssignment_4"


    // $ANTLR start "rule__Equation__HideFromViewAssignment_1"
    // InternalJoveNotes.g:8789:1: rule__Equation__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Equation__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8793:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8794:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8794:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8795:1: ( 'hide' )
            {
             before(grammarAccess.getEquationAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8796:1: ( 'hide' )
            // InternalJoveNotes.g:8797:1: 'hide'
            {
             before(grammarAccess.getEquationAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getEquationAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getEquationAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__HideFromViewAssignment_1"


    // $ANTLR start "rule__Equation__EquationAssignment_2"
    // InternalJoveNotes.g:8812:1: rule__Equation__EquationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Equation__EquationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8816:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8817:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8817:1: ( RULE_STRING )
            // InternalJoveNotes.g:8818:1: RULE_STRING
            {
             before(grammarAccess.getEquationAccess().getEquationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEquationAccess().getEquationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__EquationAssignment_2"


    // $ANTLR start "rule__Equation__DescriptionAssignment_4"
    // InternalJoveNotes.g:8827:1: rule__Equation__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Equation__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8831:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8832:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8832:1: ( RULE_STRING )
            // InternalJoveNotes.g:8833:1: RULE_STRING
            {
             before(grammarAccess.getEquationAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEquationAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__DescriptionAssignment_4"


    // $ANTLR start "rule__Equation__SymbolsAssignment_6"
    // InternalJoveNotes.g:8842:1: rule__Equation__SymbolsAssignment_6 : ( ruleEqSymbol ) ;
    public final void rule__Equation__SymbolsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8846:1: ( ( ruleEqSymbol ) )
            // InternalJoveNotes.g:8847:1: ( ruleEqSymbol )
            {
            // InternalJoveNotes.g:8847:1: ( ruleEqSymbol )
            // InternalJoveNotes.g:8848:1: ruleEqSymbol
            {
             before(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEqSymbol();

            state._fsp--;

             after(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__SymbolsAssignment_6"


    // $ANTLR start "rule__Equation__SymbolsAssignment_7_1"
    // InternalJoveNotes.g:8857:1: rule__Equation__SymbolsAssignment_7_1 : ( ruleEqSymbol ) ;
    public final void rule__Equation__SymbolsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8861:1: ( ( ruleEqSymbol ) )
            // InternalJoveNotes.g:8862:1: ( ruleEqSymbol )
            {
            // InternalJoveNotes.g:8862:1: ( ruleEqSymbol )
            // InternalJoveNotes.g:8863:1: ruleEqSymbol
            {
             before(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEqSymbol();

            state._fsp--;

             after(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__SymbolsAssignment_7_1"


    // $ANTLR start "rule__EqSymbol__SymbolAssignment_0"
    // InternalJoveNotes.g:8872:1: rule__EqSymbol__SymbolAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EqSymbol__SymbolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8876:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8877:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8877:1: ( RULE_STRING )
            // InternalJoveNotes.g:8878:1: RULE_STRING
            {
             before(grammarAccess.getEqSymbolAccess().getSymbolSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEqSymbolAccess().getSymbolSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqSymbol__SymbolAssignment_0"


    // $ANTLR start "rule__EqSymbol__DescriptionAssignment_2"
    // InternalJoveNotes.g:8887:1: rule__EqSymbol__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EqSymbol__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8891:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8892:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8892:1: ( RULE_STRING )
            // InternalJoveNotes.g:8893:1: RULE_STRING
            {
             before(grammarAccess.getEqSymbolAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEqSymbolAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqSymbol__DescriptionAssignment_2"


    // $ANTLR start "rule__RefToContext__HideFromViewAssignment_1"
    // InternalJoveNotes.g:8902:1: rule__RefToContext__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__RefToContext__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8906:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8907:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8907:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8908:1: ( 'hide' )
            {
             before(grammarAccess.getRefToContextAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8909:1: ( 'hide' )
            // InternalJoveNotes.g:8910:1: 'hide'
            {
             before(grammarAccess.getRefToContextAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getRefToContextAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getRefToContextAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__HideFromViewAssignment_1"


    // $ANTLR start "rule__RefToContext__ContextAssignment_4"
    // InternalJoveNotes.g:8925:1: rule__RefToContext__ContextAssignment_4 : ( RULE_STRING ) ;
    public final void rule__RefToContext__ContextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8929:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8930:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8930:1: ( RULE_STRING )
            // InternalJoveNotes.g:8931:1: RULE_STRING
            {
             before(grammarAccess.getRefToContextAccess().getContextSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRefToContextAccess().getContextSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__ContextAssignment_4"


    // $ANTLR start "rule__RefToContext__RtcElementAssignment_5"
    // InternalJoveNotes.g:8940:1: rule__RefToContext__RtcElementAssignment_5 : ( ruleRTCElement ) ;
    public final void rule__RefToContext__RtcElementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8944:1: ( ( ruleRTCElement ) )
            // InternalJoveNotes.g:8945:1: ( ruleRTCElement )
            {
            // InternalJoveNotes.g:8945:1: ( ruleRTCElement )
            // InternalJoveNotes.g:8946:1: ruleRTCElement
            {
             before(grammarAccess.getRefToContextAccess().getRtcElementRTCElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRTCElement();

            state._fsp--;

             after(grammarAccess.getRefToContextAccess().getRtcElementRTCElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__RtcElementAssignment_5"


    // $ANTLR start "rule__MultiChoice__HideFromViewAssignment_1"
    // InternalJoveNotes.g:8955:1: rule__MultiChoice__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__MultiChoice__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8959:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8960:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8960:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8961:1: ( 'hide' )
            {
             before(grammarAccess.getMultiChoiceAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8962:1: ( 'hide' )
            // InternalJoveNotes.g:8963:1: 'hide'
            {
             before(grammarAccess.getMultiChoiceAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getMultiChoiceAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__HideFromViewAssignment_1"


    // $ANTLR start "rule__MultiChoice__QuestionAssignment_2"
    // InternalJoveNotes.g:8978:1: rule__MultiChoice__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MultiChoice__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8982:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8983:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8983:1: ( RULE_STRING )
            // InternalJoveNotes.g:8984:1: RULE_STRING
            {
             before(grammarAccess.getMultiChoiceAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__QuestionAssignment_2"


    // $ANTLR start "rule__MultiChoice__OptionsAssignment_6"
    // InternalJoveNotes.g:8993:1: rule__MultiChoice__OptionsAssignment_6 : ( ruleOption ) ;
    public final void rule__MultiChoice__OptionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8997:1: ( ( ruleOption ) )
            // InternalJoveNotes.g:8998:1: ( ruleOption )
            {
            // InternalJoveNotes.g:8998:1: ( ruleOption )
            // InternalJoveNotes.g:8999:1: ruleOption
            {
             before(grammarAccess.getMultiChoiceAccess().getOptionsOptionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getMultiChoiceAccess().getOptionsOptionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__OptionsAssignment_6"


    // $ANTLR start "rule__MultiChoice__OptionsAssignment_7_1"
    // InternalJoveNotes.g:9008:1: rule__MultiChoice__OptionsAssignment_7_1 : ( ruleOption ) ;
    public final void rule__MultiChoice__OptionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9012:1: ( ( ruleOption ) )
            // InternalJoveNotes.g:9013:1: ( ruleOption )
            {
            // InternalJoveNotes.g:9013:1: ( ruleOption )
            // InternalJoveNotes.g:9014:1: ruleOption
            {
             before(grammarAccess.getMultiChoiceAccess().getOptionsOptionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getMultiChoiceAccess().getOptionsOptionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__OptionsAssignment_7_1"


    // $ANTLR start "rule__MultiChoice__NumOptionsToShowAssignment_9_1"
    // InternalJoveNotes.g:9023:1: rule__MultiChoice__NumOptionsToShowAssignment_9_1 : ( RULE_INT ) ;
    public final void rule__MultiChoice__NumOptionsToShowAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9027:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:9028:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:9028:1: ( RULE_INT )
            // InternalJoveNotes.g:9029:1: RULE_INT
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsToShowINTTerminalRuleCall_9_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceAccess().getNumOptionsToShowINTTerminalRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__NumOptionsToShowAssignment_9_1"


    // $ANTLR start "rule__MultiChoice__NumOptionsPerRowAssignment_10_1"
    // InternalJoveNotes.g:9038:1: rule__MultiChoice__NumOptionsPerRowAssignment_10_1 : ( RULE_INT ) ;
    public final void rule__MultiChoice__NumOptionsPerRowAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9042:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:9043:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:9043:1: ( RULE_INT )
            // InternalJoveNotes.g:9044:1: RULE_INT
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowINTTerminalRuleCall_10_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowINTTerminalRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__NumOptionsPerRowAssignment_10_1"


    // $ANTLR start "rule__MultiChoice__ExplanationAssignment_11_1"
    // InternalJoveNotes.g:9053:1: rule__MultiChoice__ExplanationAssignment_11_1 : ( RULE_STRING ) ;
    public final void rule__MultiChoice__ExplanationAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9057:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:9058:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:9058:1: ( RULE_STRING )
            // InternalJoveNotes.g:9059:1: RULE_STRING
            {
             before(grammarAccess.getMultiChoiceAccess().getExplanationSTRINGTerminalRuleCall_11_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMultiChoiceAccess().getExplanationSTRINGTerminalRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__ExplanationAssignment_11_1"


    // $ANTLR start "rule__Exercise__HideFromViewAssignment_1"
    // InternalJoveNotes.g:9068:1: rule__Exercise__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Exercise__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9072:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:9073:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:9073:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:9074:1: ( 'hide' )
            {
             before(grammarAccess.getExerciseAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:9075:1: ( 'hide' )
            // InternalJoveNotes.g:9076:1: 'hide'
            {
             before(grammarAccess.getExerciseAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getExerciseAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__HideFromViewAssignment_1"


    // $ANTLR start "rule__Exercise__MarksAssignment_2_2"
    // InternalJoveNotes.g:9091:1: rule__Exercise__MarksAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__Exercise__MarksAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9095:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:9096:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:9096:1: ( RULE_INT )
            // InternalJoveNotes.g:9097:1: RULE_INT
            {
             before(grammarAccess.getExerciseAccess().getMarksINTTerminalRuleCall_2_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getMarksINTTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__MarksAssignment_2_2"


    // $ANTLR start "rule__Exercise__QuestionAssignment_3"
    // InternalJoveNotes.g:9106:1: rule__Exercise__QuestionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Exercise__QuestionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9110:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:9111:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:9111:1: ( RULE_STRING )
            // InternalJoveNotes.g:9112:1: RULE_STRING
            {
             before(grammarAccess.getExerciseAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__QuestionAssignment_3"


    // $ANTLR start "rule__Exercise__HintsAssignment_4_2"
    // InternalJoveNotes.g:9121:1: rule__Exercise__HintsAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Exercise__HintsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9125:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:9126:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:9126:1: ( RULE_STRING )
            // InternalJoveNotes.g:9127:1: RULE_STRING
            {
             before(grammarAccess.getExerciseAccess().getHintsSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getHintsSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__HintsAssignment_4_2"


    // $ANTLR start "rule__Exercise__AnswerAssignment_5_1"
    // InternalJoveNotes.g:9136:1: rule__Exercise__AnswerAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Exercise__AnswerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9140:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:9141:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:9141:1: ( RULE_STRING )
            // InternalJoveNotes.g:9142:1: RULE_STRING
            {
             before(grammarAccess.getExerciseAccess().getAnswerSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getAnswerSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__AnswerAssignment_5_1"


    // $ANTLR start "rule__VoiceToText__HideFromViewAssignment_1"
    // InternalJoveNotes.g:9151:1: rule__VoiceToText__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__VoiceToText__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9155:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:9156:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:9156:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:9157:1: ( 'hide' )
            {
             before(grammarAccess.getVoiceToTextAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:9158:1: ( 'hide' )
            // InternalJoveNotes.g:9159:1: 'hide'
            {
             before(grammarAccess.getVoiceToTextAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getVoiceToTextAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getVoiceToTextAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__HideFromViewAssignment_1"


    // $ANTLR start "rule__VoiceToText__ClipNameAssignment_2"
    // InternalJoveNotes.g:9174:1: rule__VoiceToText__ClipNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VoiceToText__ClipNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9178:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:9179:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:9179:1: ( RULE_STRING )
            // InternalJoveNotes.g:9180:1: RULE_STRING
            {
             before(grammarAccess.getVoiceToTextAccess().getClipNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVoiceToTextAccess().getClipNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__ClipNameAssignment_2"


    // $ANTLR start "rule__VoiceToText__TextAssignment_3"
    // InternalJoveNotes.g:9189:1: rule__VoiceToText__TextAssignment_3 : ( RULE_STRING ) ;
    public final void rule__VoiceToText__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9193:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:9194:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:9194:1: ( RULE_STRING )
            // InternalJoveNotes.g:9195:1: RULE_STRING
            {
             before(grammarAccess.getVoiceToTextAccess().getTextSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVoiceToTextAccess().getTextSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__TextAssignment_3"


    // $ANTLR start "rule__ChapterSection__SectionNameAssignment_1"
    // InternalJoveNotes.g:9204:1: rule__ChapterSection__SectionNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ChapterSection__SectionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9208:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:9209:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:9209:1: ( RULE_STRING )
            // InternalJoveNotes.g:9210:1: RULE_STRING
            {
             before(grammarAccess.getChapterSectionAccess().getSectionNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChapterSectionAccess().getSectionNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterSection__SectionNameAssignment_1"


    // $ANTLR start "rule__Option__OptionValueAssignment_0"
    // InternalJoveNotes.g:9219:1: rule__Option__OptionValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Option__OptionValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9223:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:9224:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:9224:1: ( RULE_STRING )
            // InternalJoveNotes.g:9225:1: RULE_STRING
            {
             before(grammarAccess.getOptionAccess().getOptionValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getOptionValueSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__OptionValueAssignment_0"


    // $ANTLR start "rule__Option__CorrectOptionAssignment_1"
    // InternalJoveNotes.g:9234:1: rule__Option__CorrectOptionAssignment_1 : ( ( 'correct' ) ) ;
    public final void rule__Option__CorrectOptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9238:1: ( ( ( 'correct' ) ) )
            // InternalJoveNotes.g:9239:1: ( ( 'correct' ) )
            {
            // InternalJoveNotes.g:9239:1: ( ( 'correct' ) )
            // InternalJoveNotes.g:9240:1: ( 'correct' )
            {
             before(grammarAccess.getOptionAccess().getCorrectOptionCorrectKeyword_1_0()); 
            // InternalJoveNotes.g:9241:1: ( 'correct' )
            // InternalJoveNotes.g:9242:1: 'correct'
            {
             before(grammarAccess.getOptionAccess().getCorrectOptionCorrectKeyword_1_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getCorrectOptionCorrectKeyword_1_0()); 

            }

             after(grammarAccess.getOptionAccess().getCorrectOptionCorrectKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__CorrectOptionAssignment_1"


    // $ANTLR start "rule__CMap__ContentAssignment_2"
    // InternalJoveNotes.g:9257:1: rule__CMap__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CMap__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9261:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:9262:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:9262:1: ( RULE_STRING )
            // InternalJoveNotes.g:9263:1: RULE_STRING
            {
             before(grammarAccess.getCMapAccess().getContentSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCMapAccess().getContentSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__ContentAssignment_2"


    // $ANTLR start "rule__Script__EvalVarsAssignment_2"
    // InternalJoveNotes.g:9272:1: rule__Script__EvalVarsAssignment_2 : ( ruleEvalVar ) ;
    public final void rule__Script__EvalVarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9276:1: ( ( ruleEvalVar ) )
            // InternalJoveNotes.g:9277:1: ( ruleEvalVar )
            {
            // InternalJoveNotes.g:9277:1: ( ruleEvalVar )
            // InternalJoveNotes.g:9278:1: ruleEvalVar
            {
             before(grammarAccess.getScriptAccess().getEvalVarsEvalVarParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvalVar();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getEvalVarsEvalVarParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__EvalVarsAssignment_2"


    // $ANTLR start "rule__Script__EvalVarsAssignment_3_1"
    // InternalJoveNotes.g:9287:1: rule__Script__EvalVarsAssignment_3_1 : ( ruleEvalVar ) ;
    public final void rule__Script__EvalVarsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9291:1: ( ( ruleEvalVar ) )
            // InternalJoveNotes.g:9292:1: ( ruleEvalVar )
            {
            // InternalJoveNotes.g:9292:1: ( ruleEvalVar )
            // InternalJoveNotes.g:9293:1: ruleEvalVar
            {
             before(grammarAccess.getScriptAccess().getEvalVarsEvalVarParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvalVar();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getEvalVarsEvalVarParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__EvalVarsAssignment_3_1"


    // $ANTLR start "rule__Script__ScriptBodyAssignment_5"
    // InternalJoveNotes.g:9302:1: rule__Script__ScriptBodyAssignment_5 : ( ruleScriptBody ) ;
    public final void rule__Script__ScriptBodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9306:1: ( ( ruleScriptBody ) )
            // InternalJoveNotes.g:9307:1: ( ruleScriptBody )
            {
            // InternalJoveNotes.g:9307:1: ( ruleScriptBody )
            // InternalJoveNotes.g:9308:1: ruleScriptBody
            {
             before(grammarAccess.getScriptAccess().getScriptBodyScriptBodyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleScriptBody();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getScriptBodyScriptBodyParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__ScriptBodyAssignment_5"


    // $ANTLR start "rule__EvalVar__VarNameAssignment_0"
    // InternalJoveNotes.g:9317:1: rule__EvalVar__VarNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EvalVar__VarNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9321:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:9322:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:9322:1: ( RULE_STRING )
            // InternalJoveNotes.g:9323:1: RULE_STRING
            {
             before(grammarAccess.getEvalVarAccess().getVarNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEvalVarAccess().getVarNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalVar__VarNameAssignment_0"


    // $ANTLR start "rule__EvalVar__VarExpressionAssignment_2"
    // InternalJoveNotes.g:9332:1: rule__EvalVar__VarExpressionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EvalVar__VarExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9336:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:9337:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:9337:1: ( RULE_STRING )
            // InternalJoveNotes.g:9338:1: RULE_STRING
            {
             before(grammarAccess.getEvalVarAccess().getVarExpressionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEvalVarAccess().getVarExpressionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalVar__VarExpressionAssignment_2"


    // $ANTLR start "rule__ScriptBody__ScriptAssignment_2"
    // InternalJoveNotes.g:9347:1: rule__ScriptBody__ScriptAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ScriptBody__ScriptAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9351:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:9352:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:9352:1: ( RULE_STRING )
            // InternalJoveNotes.g:9353:1: RULE_STRING
            {
             before(grammarAccess.getScriptBodyAccess().getScriptSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScriptBodyAccess().getScriptSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__ScriptAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0800000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0038953B807F0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0038953B807F0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x1000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x3000000000800010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000071000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x1000000000800010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008001000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1000000000800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000112B807F0000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000112B807F0002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400061000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x4000000000000000L});

}