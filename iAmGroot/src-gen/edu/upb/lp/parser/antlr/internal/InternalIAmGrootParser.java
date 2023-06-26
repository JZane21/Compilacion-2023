package edu.upb.lp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.upb.lp.services.IAmGrootGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIAmGrootParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'WeAreGroot'", "'{'", "'}'", "'Leaf'", "'is'", "'Numboot'", "'Stroot'", "'Boolt'", "'->'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalIAmGrootParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIAmGrootParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIAmGrootParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIAmGroot.g"; }



     	private IAmGrootGrammarAccess grammarAccess;

        public InternalIAmGrootParser(TokenStream input, IAmGrootGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected IAmGrootGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalIAmGroot.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalIAmGroot.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalIAmGroot.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalIAmGroot.g:71:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= 'WeAreGroot' otherlv_2= '{' ( (lv_groots_3_0= ruleGroot ) )* otherlv_4= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_groots_3_0 = null;



        	enterRule();

        try {
            // InternalIAmGroot.g:77:2: ( ( () otherlv_1= 'WeAreGroot' otherlv_2= '{' ( (lv_groots_3_0= ruleGroot ) )* otherlv_4= '}' ) )
            // InternalIAmGroot.g:78:2: ( () otherlv_1= 'WeAreGroot' otherlv_2= '{' ( (lv_groots_3_0= ruleGroot ) )* otherlv_4= '}' )
            {
            // InternalIAmGroot.g:78:2: ( () otherlv_1= 'WeAreGroot' otherlv_2= '{' ( (lv_groots_3_0= ruleGroot ) )* otherlv_4= '}' )
            // InternalIAmGroot.g:79:3: () otherlv_1= 'WeAreGroot' otherlv_2= '{' ( (lv_groots_3_0= ruleGroot ) )* otherlv_4= '}'
            {
            // InternalIAmGroot.g:79:3: ()
            // InternalIAmGroot.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getWeAreGrootKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIAmGroot.g:94:3: ( (lv_groots_3_0= ruleGroot ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIAmGroot.g:95:4: (lv_groots_3_0= ruleGroot )
            	    {
            	    // InternalIAmGroot.g:95:4: (lv_groots_3_0= ruleGroot )
            	    // InternalIAmGroot.g:96:5: lv_groots_3_0= ruleGroot
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getGrootsGrootParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_groots_3_0=ruleGroot();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"groots",
            	    						lv_groots_3_0,
            	    						"edu.upb.lp.IAmGroot.Groot");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleGroot"
    // InternalIAmGroot.g:121:1: entryRuleGroot returns [EObject current=null] : iv_ruleGroot= ruleGroot EOF ;
    public final EObject entryRuleGroot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroot = null;


        try {
            // InternalIAmGroot.g:121:46: (iv_ruleGroot= ruleGroot EOF )
            // InternalIAmGroot.g:122:2: iv_ruleGroot= ruleGroot EOF
            {
             newCompositeNode(grammarAccess.getGrootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroot=ruleGroot();

            state._fsp--;

             current =iv_ruleGroot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroot"


    // $ANTLR start "ruleGroot"
    // InternalIAmGroot.g:128:1: ruleGroot returns [EObject current=null] : (this_Sentence_0= ruleSentence otherlv_1= 'Leaf' ) ;
    public final EObject ruleGroot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Sentence_0 = null;



        	enterRule();

        try {
            // InternalIAmGroot.g:134:2: ( (this_Sentence_0= ruleSentence otherlv_1= 'Leaf' ) )
            // InternalIAmGroot.g:135:2: (this_Sentence_0= ruleSentence otherlv_1= 'Leaf' )
            {
            // InternalIAmGroot.g:135:2: (this_Sentence_0= ruleSentence otherlv_1= 'Leaf' )
            // InternalIAmGroot.g:136:3: this_Sentence_0= ruleSentence otherlv_1= 'Leaf'
            {

            			newCompositeNode(grammarAccess.getGrootAccess().getSentenceParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_Sentence_0=ruleSentence();

            state._fsp--;


            			current = this_Sentence_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGrootAccess().getLeafKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroot"


    // $ANTLR start "entryRuleSentence"
    // InternalIAmGroot.g:152:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // InternalIAmGroot.g:152:49: (iv_ruleSentence= ruleSentence EOF )
            // InternalIAmGroot.g:153:2: iv_ruleSentence= ruleSentence EOF
            {
             newCompositeNode(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalIAmGroot.g:159:1: ruleSentence returns [EObject current=null] : (this_Declaration_0= ruleDeclaration | this_Assignation_1= ruleAssignation ) ;
    public final EObject ruleSentence() throws RecognitionException {
        EObject current = null;

        EObject this_Declaration_0 = null;

        EObject this_Assignation_1 = null;



        	enterRule();

        try {
            // InternalIAmGroot.g:165:2: ( (this_Declaration_0= ruleDeclaration | this_Assignation_1= ruleAssignation ) )
            // InternalIAmGroot.g:166:2: (this_Declaration_0= ruleDeclaration | this_Assignation_1= ruleAssignation )
            {
            // InternalIAmGroot.g:166:2: (this_Declaration_0= ruleDeclaration | this_Assignation_1= ruleAssignation )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==20) ) {
                    alt2=2;
                }
                else if ( (LA2_1==16) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalIAmGroot.g:167:3: this_Declaration_0= ruleDeclaration
                    {

                    			newCompositeNode(grammarAccess.getSentenceAccess().getDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Declaration_0=ruleDeclaration();

                    state._fsp--;


                    			current = this_Declaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIAmGroot.g:176:3: this_Assignation_1= ruleAssignation
                    {

                    			newCompositeNode(grammarAccess.getSentenceAccess().getAssignationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assignation_1=ruleAssignation();

                    state._fsp--;


                    			current = this_Assignation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleDeclaration"
    // InternalIAmGroot.g:188:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalIAmGroot.g:188:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalIAmGroot.g:189:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalIAmGroot.g:195:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_type_2_0= ruleGrootTypes ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalIAmGroot.g:201:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_type_2_0= ruleGrootTypes ) ) ) )
            // InternalIAmGroot.g:202:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_type_2_0= ruleGrootTypes ) ) )
            {
            // InternalIAmGroot.g:202:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_type_2_0= ruleGrootTypes ) ) )
            // InternalIAmGroot.g:203:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_type_2_0= ruleGrootTypes ) )
            {
            // InternalIAmGroot.g:203:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIAmGroot.g:204:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIAmGroot.g:204:4: (lv_name_0_0= RULE_ID )
            // InternalIAmGroot.g:205:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclarationAccess().getIsKeyword_1());
            		
            // InternalIAmGroot.g:225:3: ( (lv_type_2_0= ruleGrootTypes ) )
            // InternalIAmGroot.g:226:4: (lv_type_2_0= ruleGrootTypes )
            {
            // InternalIAmGroot.g:226:4: (lv_type_2_0= ruleGrootTypes )
            // InternalIAmGroot.g:227:5: lv_type_2_0= ruleGrootTypes
            {

            					newCompositeNode(grammarAccess.getDeclarationAccess().getTypeGrootTypesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleGrootTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"edu.upb.lp.IAmGroot.GrootTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleGrootTypes"
    // InternalIAmGroot.g:248:1: entryRuleGrootTypes returns [EObject current=null] : iv_ruleGrootTypes= ruleGrootTypes EOF ;
    public final EObject entryRuleGrootTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrootTypes = null;


        try {
            // InternalIAmGroot.g:248:51: (iv_ruleGrootTypes= ruleGrootTypes EOF )
            // InternalIAmGroot.g:249:2: iv_ruleGrootTypes= ruleGrootTypes EOF
            {
             newCompositeNode(grammarAccess.getGrootTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrootTypes=ruleGrootTypes();

            state._fsp--;

             current =iv_ruleGrootTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrootTypes"


    // $ANTLR start "ruleGrootTypes"
    // InternalIAmGroot.g:255:1: ruleGrootTypes returns [EObject current=null] : ( ( () otherlv_1= 'Numboot' ( (lv_value_2_0= ruleInitializationNum ) )? ) | ( () otherlv_4= 'Stroot' ( (lv_value_5_0= ruleInitializationStr ) )? ) | ( () otherlv_7= 'Boolt' ( (lv_value_8_0= ruleInitializationBool ) )? ) ) ;
    public final EObject ruleGrootTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalIAmGroot.g:261:2: ( ( ( () otherlv_1= 'Numboot' ( (lv_value_2_0= ruleInitializationNum ) )? ) | ( () otherlv_4= 'Stroot' ( (lv_value_5_0= ruleInitializationStr ) )? ) | ( () otherlv_7= 'Boolt' ( (lv_value_8_0= ruleInitializationBool ) )? ) ) )
            // InternalIAmGroot.g:262:2: ( ( () otherlv_1= 'Numboot' ( (lv_value_2_0= ruleInitializationNum ) )? ) | ( () otherlv_4= 'Stroot' ( (lv_value_5_0= ruleInitializationStr ) )? ) | ( () otherlv_7= 'Boolt' ( (lv_value_8_0= ruleInitializationBool ) )? ) )
            {
            // InternalIAmGroot.g:262:2: ( ( () otherlv_1= 'Numboot' ( (lv_value_2_0= ruleInitializationNum ) )? ) | ( () otherlv_4= 'Stroot' ( (lv_value_5_0= ruleInitializationStr ) )? ) | ( () otherlv_7= 'Boolt' ( (lv_value_8_0= ruleInitializationBool ) )? ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalIAmGroot.g:263:3: ( () otherlv_1= 'Numboot' ( (lv_value_2_0= ruleInitializationNum ) )? )
                    {
                    // InternalIAmGroot.g:263:3: ( () otherlv_1= 'Numboot' ( (lv_value_2_0= ruleInitializationNum ) )? )
                    // InternalIAmGroot.g:264:4: () otherlv_1= 'Numboot' ( (lv_value_2_0= ruleInitializationNum ) )?
                    {
                    // InternalIAmGroot.g:264:4: ()
                    // InternalIAmGroot.g:265:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getGrootTypesAccess().getGrootTypesAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getGrootTypesAccess().getNumbootKeyword_0_1());
                    			
                    // InternalIAmGroot.g:275:4: ( (lv_value_2_0= ruleInitializationNum ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==20) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalIAmGroot.g:276:5: (lv_value_2_0= ruleInitializationNum )
                            {
                            // InternalIAmGroot.g:276:5: (lv_value_2_0= ruleInitializationNum )
                            // InternalIAmGroot.g:277:6: lv_value_2_0= ruleInitializationNum
                            {

                            						newCompositeNode(grammarAccess.getGrootTypesAccess().getValueInitializationNumParserRuleCall_0_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_value_2_0=ruleInitializationNum();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getGrootTypesRule());
                            						}
                            						set(
                            							current,
                            							"value",
                            							lv_value_2_0,
                            							"edu.upb.lp.IAmGroot.InitializationNum");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIAmGroot.g:296:3: ( () otherlv_4= 'Stroot' ( (lv_value_5_0= ruleInitializationStr ) )? )
                    {
                    // InternalIAmGroot.g:296:3: ( () otherlv_4= 'Stroot' ( (lv_value_5_0= ruleInitializationStr ) )? )
                    // InternalIAmGroot.g:297:4: () otherlv_4= 'Stroot' ( (lv_value_5_0= ruleInitializationStr ) )?
                    {
                    // InternalIAmGroot.g:297:4: ()
                    // InternalIAmGroot.g:298:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getGrootTypesAccess().getGrootTypesAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getGrootTypesAccess().getStrootKeyword_1_1());
                    			
                    // InternalIAmGroot.g:308:4: ( (lv_value_5_0= ruleInitializationStr ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==20) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalIAmGroot.g:309:5: (lv_value_5_0= ruleInitializationStr )
                            {
                            // InternalIAmGroot.g:309:5: (lv_value_5_0= ruleInitializationStr )
                            // InternalIAmGroot.g:310:6: lv_value_5_0= ruleInitializationStr
                            {

                            						newCompositeNode(grammarAccess.getGrootTypesAccess().getValueInitializationStrParserRuleCall_1_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_value_5_0=ruleInitializationStr();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getGrootTypesRule());
                            						}
                            						set(
                            							current,
                            							"value",
                            							lv_value_5_0,
                            							"edu.upb.lp.IAmGroot.InitializationStr");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIAmGroot.g:329:3: ( () otherlv_7= 'Boolt' ( (lv_value_8_0= ruleInitializationBool ) )? )
                    {
                    // InternalIAmGroot.g:329:3: ( () otherlv_7= 'Boolt' ( (lv_value_8_0= ruleInitializationBool ) )? )
                    // InternalIAmGroot.g:330:4: () otherlv_7= 'Boolt' ( (lv_value_8_0= ruleInitializationBool ) )?
                    {
                    // InternalIAmGroot.g:330:4: ()
                    // InternalIAmGroot.g:331:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getGrootTypesAccess().getGrootTypesAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getGrootTypesAccess().getBooltKeyword_2_1());
                    			
                    // InternalIAmGroot.g:341:4: ( (lv_value_8_0= ruleInitializationBool ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==20) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalIAmGroot.g:342:5: (lv_value_8_0= ruleInitializationBool )
                            {
                            // InternalIAmGroot.g:342:5: (lv_value_8_0= ruleInitializationBool )
                            // InternalIAmGroot.g:343:6: lv_value_8_0= ruleInitializationBool
                            {

                            						newCompositeNode(grammarAccess.getGrootTypesAccess().getValueInitializationBoolParserRuleCall_2_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_value_8_0=ruleInitializationBool();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getGrootTypesRule());
                            						}
                            						set(
                            							current,
                            							"value",
                            							lv_value_8_0,
                            							"edu.upb.lp.IAmGroot.InitializationBool");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrootTypes"


    // $ANTLR start "entryRuleInitializationNum"
    // InternalIAmGroot.g:365:1: entryRuleInitializationNum returns [EObject current=null] : iv_ruleInitializationNum= ruleInitializationNum EOF ;
    public final EObject entryRuleInitializationNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitializationNum = null;


        try {
            // InternalIAmGroot.g:365:58: (iv_ruleInitializationNum= ruleInitializationNum EOF )
            // InternalIAmGroot.g:366:2: iv_ruleInitializationNum= ruleInitializationNum EOF
            {
             newCompositeNode(grammarAccess.getInitializationNumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitializationNum=ruleInitializationNum();

            state._fsp--;

             current =iv_ruleInitializationNum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitializationNum"


    // $ANTLR start "ruleInitializationNum"
    // InternalIAmGroot.g:372:1: ruleInitializationNum returns [EObject current=null] : this_AssignationNum_0= ruleAssignationNum ;
    public final EObject ruleInitializationNum() throws RecognitionException {
        EObject current = null;

        EObject this_AssignationNum_0 = null;



        	enterRule();

        try {
            // InternalIAmGroot.g:378:2: (this_AssignationNum_0= ruleAssignationNum )
            // InternalIAmGroot.g:379:2: this_AssignationNum_0= ruleAssignationNum
            {

            		newCompositeNode(grammarAccess.getInitializationNumAccess().getAssignationNumParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AssignationNum_0=ruleAssignationNum();

            state._fsp--;


            		current = this_AssignationNum_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitializationNum"


    // $ANTLR start "entryRuleInitializationStr"
    // InternalIAmGroot.g:390:1: entryRuleInitializationStr returns [EObject current=null] : iv_ruleInitializationStr= ruleInitializationStr EOF ;
    public final EObject entryRuleInitializationStr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitializationStr = null;


        try {
            // InternalIAmGroot.g:390:58: (iv_ruleInitializationStr= ruleInitializationStr EOF )
            // InternalIAmGroot.g:391:2: iv_ruleInitializationStr= ruleInitializationStr EOF
            {
             newCompositeNode(grammarAccess.getInitializationStrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitializationStr=ruleInitializationStr();

            state._fsp--;

             current =iv_ruleInitializationStr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitializationStr"


    // $ANTLR start "ruleInitializationStr"
    // InternalIAmGroot.g:397:1: ruleInitializationStr returns [EObject current=null] : this_AssignationStr_0= ruleAssignationStr ;
    public final EObject ruleInitializationStr() throws RecognitionException {
        EObject current = null;

        EObject this_AssignationStr_0 = null;



        	enterRule();

        try {
            // InternalIAmGroot.g:403:2: (this_AssignationStr_0= ruleAssignationStr )
            // InternalIAmGroot.g:404:2: this_AssignationStr_0= ruleAssignationStr
            {

            		newCompositeNode(grammarAccess.getInitializationStrAccess().getAssignationStrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AssignationStr_0=ruleAssignationStr();

            state._fsp--;


            		current = this_AssignationStr_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitializationStr"


    // $ANTLR start "entryRuleInitializationBool"
    // InternalIAmGroot.g:415:1: entryRuleInitializationBool returns [EObject current=null] : iv_ruleInitializationBool= ruleInitializationBool EOF ;
    public final EObject entryRuleInitializationBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitializationBool = null;


        try {
            // InternalIAmGroot.g:415:59: (iv_ruleInitializationBool= ruleInitializationBool EOF )
            // InternalIAmGroot.g:416:2: iv_ruleInitializationBool= ruleInitializationBool EOF
            {
             newCompositeNode(grammarAccess.getInitializationBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitializationBool=ruleInitializationBool();

            state._fsp--;

             current =iv_ruleInitializationBool; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitializationBool"


    // $ANTLR start "ruleInitializationBool"
    // InternalIAmGroot.g:422:1: ruleInitializationBool returns [EObject current=null] : this_AssignationBool_0= ruleAssignationBool ;
    public final EObject ruleInitializationBool() throws RecognitionException {
        EObject current = null;

        EObject this_AssignationBool_0 = null;



        	enterRule();

        try {
            // InternalIAmGroot.g:428:2: (this_AssignationBool_0= ruleAssignationBool )
            // InternalIAmGroot.g:429:2: this_AssignationBool_0= ruleAssignationBool
            {

            		newCompositeNode(grammarAccess.getInitializationBoolAccess().getAssignationBoolParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AssignationBool_0=ruleAssignationBool();

            state._fsp--;


            		current = this_AssignationBool_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitializationBool"


    // $ANTLR start "entryRuleAssignation"
    // InternalIAmGroot.g:440:1: entryRuleAssignation returns [EObject current=null] : iv_ruleAssignation= ruleAssignation EOF ;
    public final EObject entryRuleAssignation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignation = null;


        try {
            // InternalIAmGroot.g:440:52: (iv_ruleAssignation= ruleAssignation EOF )
            // InternalIAmGroot.g:441:2: iv_ruleAssignation= ruleAssignation EOF
            {
             newCompositeNode(grammarAccess.getAssignationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignation=ruleAssignation();

            state._fsp--;

             current =iv_ruleAssignation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignation"


    // $ANTLR start "ruleAssignation"
    // InternalIAmGroot.g:447:1: ruleAssignation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleAssignationValue ) ) ) ;
    public final EObject ruleAssignation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalIAmGroot.g:453:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleAssignationValue ) ) ) )
            // InternalIAmGroot.g:454:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleAssignationValue ) ) )
            {
            // InternalIAmGroot.g:454:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleAssignationValue ) ) )
            // InternalIAmGroot.g:455:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleAssignationValue ) )
            {
            // InternalIAmGroot.g:455:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIAmGroot.g:456:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIAmGroot.g:456:4: (lv_name_0_0= RULE_ID )
            // InternalIAmGroot.g:457:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAssignationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIAmGroot.g:473:3: ( (lv_value_1_0= ruleAssignationValue ) )
            // InternalIAmGroot.g:474:4: (lv_value_1_0= ruleAssignationValue )
            {
            // InternalIAmGroot.g:474:4: (lv_value_1_0= ruleAssignationValue )
            // InternalIAmGroot.g:475:5: lv_value_1_0= ruleAssignationValue
            {

            					newCompositeNode(grammarAccess.getAssignationAccess().getValueAssignationValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleAssignationValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"edu.upb.lp.IAmGroot.AssignationValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignation"


    // $ANTLR start "entryRuleAssignationValue"
    // InternalIAmGroot.g:496:1: entryRuleAssignationValue returns [EObject current=null] : iv_ruleAssignationValue= ruleAssignationValue EOF ;
    public final EObject entryRuleAssignationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignationValue = null;


        try {
            // InternalIAmGroot.g:496:57: (iv_ruleAssignationValue= ruleAssignationValue EOF )
            // InternalIAmGroot.g:497:2: iv_ruleAssignationValue= ruleAssignationValue EOF
            {
             newCompositeNode(grammarAccess.getAssignationValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignationValue=ruleAssignationValue();

            state._fsp--;

             current =iv_ruleAssignationValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignationValue"


    // $ANTLR start "ruleAssignationValue"
    // InternalIAmGroot.g:503:1: ruleAssignationValue returns [EObject current=null] : (this_AssignationNum_0= ruleAssignationNum | this_AssignationStr_1= ruleAssignationStr | this_AssignationBool_2= ruleAssignationBool ) ;
    public final EObject ruleAssignationValue() throws RecognitionException {
        EObject current = null;

        EObject this_AssignationNum_0 = null;

        EObject this_AssignationStr_1 = null;

        EObject this_AssignationBool_2 = null;



        	enterRule();

        try {
            // InternalIAmGroot.g:509:2: ( (this_AssignationNum_0= ruleAssignationNum | this_AssignationStr_1= ruleAssignationStr | this_AssignationBool_2= ruleAssignationBool ) )
            // InternalIAmGroot.g:510:2: (this_AssignationNum_0= ruleAssignationNum | this_AssignationStr_1= ruleAssignationStr | this_AssignationBool_2= ruleAssignationBool )
            {
            // InternalIAmGroot.g:510:2: (this_AssignationNum_0= ruleAssignationNum | this_AssignationStr_1= ruleAssignationStr | this_AssignationBool_2= ruleAssignationBool )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                switch ( input.LA(2) ) {
                case RULE_INT:
                    {
                    alt7=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt7=2;
                    }
                    break;
                case RULE_BOOLEAN:
                    {
                    alt7=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalIAmGroot.g:511:3: this_AssignationNum_0= ruleAssignationNum
                    {

                    			newCompositeNode(grammarAccess.getAssignationValueAccess().getAssignationNumParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssignationNum_0=ruleAssignationNum();

                    state._fsp--;


                    			current = this_AssignationNum_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIAmGroot.g:520:3: this_AssignationStr_1= ruleAssignationStr
                    {

                    			newCompositeNode(grammarAccess.getAssignationValueAccess().getAssignationStrParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssignationStr_1=ruleAssignationStr();

                    state._fsp--;


                    			current = this_AssignationStr_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIAmGroot.g:529:3: this_AssignationBool_2= ruleAssignationBool
                    {

                    			newCompositeNode(grammarAccess.getAssignationValueAccess().getAssignationBoolParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssignationBool_2=ruleAssignationBool();

                    state._fsp--;


                    			current = this_AssignationBool_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignationValue"


    // $ANTLR start "entryRuleAssignationNum"
    // InternalIAmGroot.g:541:1: entryRuleAssignationNum returns [EObject current=null] : iv_ruleAssignationNum= ruleAssignationNum EOF ;
    public final EObject entryRuleAssignationNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignationNum = null;


        try {
            // InternalIAmGroot.g:541:55: (iv_ruleAssignationNum= ruleAssignationNum EOF )
            // InternalIAmGroot.g:542:2: iv_ruleAssignationNum= ruleAssignationNum EOF
            {
             newCompositeNode(grammarAccess.getAssignationNumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignationNum=ruleAssignationNum();

            state._fsp--;

             current =iv_ruleAssignationNum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignationNum"


    // $ANTLR start "ruleAssignationNum"
    // InternalIAmGroot.g:548:1: ruleAssignationNum returns [EObject current=null] : (otherlv_0= '->' ( (lv_number_1_0= RULE_INT ) ) ) ;
    public final EObject ruleAssignationNum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;


        	enterRule();

        try {
            // InternalIAmGroot.g:554:2: ( (otherlv_0= '->' ( (lv_number_1_0= RULE_INT ) ) ) )
            // InternalIAmGroot.g:555:2: (otherlv_0= '->' ( (lv_number_1_0= RULE_INT ) ) )
            {
            // InternalIAmGroot.g:555:2: (otherlv_0= '->' ( (lv_number_1_0= RULE_INT ) ) )
            // InternalIAmGroot.g:556:3: otherlv_0= '->' ( (lv_number_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAssignationNumAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalIAmGroot.g:560:3: ( (lv_number_1_0= RULE_INT ) )
            // InternalIAmGroot.g:561:4: (lv_number_1_0= RULE_INT )
            {
            // InternalIAmGroot.g:561:4: (lv_number_1_0= RULE_INT )
            // InternalIAmGroot.g:562:5: lv_number_1_0= RULE_INT
            {
            lv_number_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_number_1_0, grammarAccess.getAssignationNumAccess().getNumberINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignationNumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignationNum"


    // $ANTLR start "entryRuleAssignationStr"
    // InternalIAmGroot.g:582:1: entryRuleAssignationStr returns [EObject current=null] : iv_ruleAssignationStr= ruleAssignationStr EOF ;
    public final EObject entryRuleAssignationStr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignationStr = null;


        try {
            // InternalIAmGroot.g:582:55: (iv_ruleAssignationStr= ruleAssignationStr EOF )
            // InternalIAmGroot.g:583:2: iv_ruleAssignationStr= ruleAssignationStr EOF
            {
             newCompositeNode(grammarAccess.getAssignationStrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignationStr=ruleAssignationStr();

            state._fsp--;

             current =iv_ruleAssignationStr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignationStr"


    // $ANTLR start "ruleAssignationStr"
    // InternalIAmGroot.g:589:1: ruleAssignationStr returns [EObject current=null] : (otherlv_0= '->' ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAssignationStr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_string_1_0=null;


        	enterRule();

        try {
            // InternalIAmGroot.g:595:2: ( (otherlv_0= '->' ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalIAmGroot.g:596:2: (otherlv_0= '->' ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalIAmGroot.g:596:2: (otherlv_0= '->' ( (lv_string_1_0= RULE_STRING ) ) )
            // InternalIAmGroot.g:597:3: otherlv_0= '->' ( (lv_string_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAssignationStrAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalIAmGroot.g:601:3: ( (lv_string_1_0= RULE_STRING ) )
            // InternalIAmGroot.g:602:4: (lv_string_1_0= RULE_STRING )
            {
            // InternalIAmGroot.g:602:4: (lv_string_1_0= RULE_STRING )
            // InternalIAmGroot.g:603:5: lv_string_1_0= RULE_STRING
            {
            lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_string_1_0, grammarAccess.getAssignationStrAccess().getStringSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignationStrRule());
            					}
            					setWithLastConsumed(
            						current,
            						"string",
            						lv_string_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignationStr"


    // $ANTLR start "entryRuleAssignationBool"
    // InternalIAmGroot.g:623:1: entryRuleAssignationBool returns [EObject current=null] : iv_ruleAssignationBool= ruleAssignationBool EOF ;
    public final EObject entryRuleAssignationBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignationBool = null;


        try {
            // InternalIAmGroot.g:623:56: (iv_ruleAssignationBool= ruleAssignationBool EOF )
            // InternalIAmGroot.g:624:2: iv_ruleAssignationBool= ruleAssignationBool EOF
            {
             newCompositeNode(grammarAccess.getAssignationBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignationBool=ruleAssignationBool();

            state._fsp--;

             current =iv_ruleAssignationBool; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignationBool"


    // $ANTLR start "ruleAssignationBool"
    // InternalIAmGroot.g:630:1: ruleAssignationBool returns [EObject current=null] : (otherlv_0= '->' ( (lv_boolean_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleAssignationBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_boolean_1_0=null;


        	enterRule();

        try {
            // InternalIAmGroot.g:636:2: ( (otherlv_0= '->' ( (lv_boolean_1_0= RULE_BOOLEAN ) ) ) )
            // InternalIAmGroot.g:637:2: (otherlv_0= '->' ( (lv_boolean_1_0= RULE_BOOLEAN ) ) )
            {
            // InternalIAmGroot.g:637:2: (otherlv_0= '->' ( (lv_boolean_1_0= RULE_BOOLEAN ) ) )
            // InternalIAmGroot.g:638:3: otherlv_0= '->' ( (lv_boolean_1_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAssignationBoolAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalIAmGroot.g:642:3: ( (lv_boolean_1_0= RULE_BOOLEAN ) )
            // InternalIAmGroot.g:643:4: (lv_boolean_1_0= RULE_BOOLEAN )
            {
            // InternalIAmGroot.g:643:4: (lv_boolean_1_0= RULE_BOOLEAN )
            // InternalIAmGroot.g:644:5: lv_boolean_1_0= RULE_BOOLEAN
            {
            lv_boolean_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            					newLeafNode(lv_boolean_1_0, grammarAccess.getAssignationBoolAccess().getBooleanBOOLEANTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignationBoolRule());
            					}
            					setWithLastConsumed(
            						current,
            						"boolean",
            						lv_boolean_1_0,
            						"edu.upb.lp.IAmGroot.BOOLEAN");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignationBool"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});

}