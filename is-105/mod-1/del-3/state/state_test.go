package state

import "testing"

func TestInitialState(t *testing.T) {
    wanted := "[HS rev korn kylling---V \\_________/ _____________Ø---]"
    state := ViewState()
	if state != wanted {
		t.Errorf("Feil, fikk %q, ønsket %q.", state, wanted)
	}
}


func TestPutInBoat(t *testing.T) {
    wanted := "[rev korn---V \\____ HS kylling_____/ _____________Ø---]"
    PutInBoat("HS kylling")
    state := ViewState()

	if state != wanted {
		t.Errorf("Feil, fikk %q, ønsket %q.", state, wanted)
	}
}


func TestCrossRiverTo(t *testing.T) {
    wanted := "[rev korn---V \\_________/ _____________Ø--- HS kylling]"
    PutInBoat("HS kylling")
    CrossRiverTo("east")
    state := ViewState()

	if state != wanted {
		t.Errorf("Feil, fikk %q, ønsket %q.", state, wanted)
	}
}
