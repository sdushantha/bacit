package state

import (
    "fmt"
    "strings"
    "errors"
    "reflect"
)

var west string = "HS rev korn kylling"
var boat string = ""
var east string = ""

func ViewState() string {
    return fmt.Sprintf("[%s---V \\____%s_____/ _____________Ø---%s]", west, boat, east)
}

func PutInBoat(item string) error {
    // When putting item in the boat, we dont know where the item
    // currently is. It could be in West or East.
    // The main example for this is for homosapian (HS). We will have to
    // put HS in the boat from West and East so that it can fetch the item
    // from the other side

    itemArray := strings.Fields(item)
    itemArrayLength := len(itemArray)

    for c, item := range itemArray {
        bad1 := []string {"rev", "kylling"}
        bad2 := []string {"kylling", "rev"}
        bad3 := []string {"kylling", "korn"}
        bad4 := []string {"korn", "kylling"}

        if strings.Contains(west, item) {
            tmpWest := strings.ReplaceAll(west, item, "")
            tmpWest = strings.TrimSpace(tmpWest)

            tmpWestArray := strings.Fields(tmpWest)

            if c == itemArrayLength-1 {
                if reflect.DeepEqual(tmpWestArray, bad1) || reflect.DeepEqual(tmpWestArray, bad2) {
                    return errors.New("You can't leave 'rev' and 'kylling' together alone")
                }

                if reflect.DeepEqual(tmpWestArray, bad3) || reflect.DeepEqual(tmpWestArray, bad4) {
                    return errors.New("You can't leave 'kylling' and 'korn' together alone")
                }

                if len(strings.Fields(boat)) > 2 {
                    return errors.New("You cant bring more than TWO items/things on the boat")
                }
            }

            west = tmpWest
            boat = boat + " " + item
        }


        if strings.Contains(east, item) {
            tmpEast := strings.ReplaceAll(east, item, "")
            tmpEast = strings.TrimSpace(tmpEast)

            tmpEastArray := strings.Fields(tmpEast)

            if c == itemArrayLength-1 {
                if reflect.DeepEqual(tmpEastArray, bad1) || reflect.DeepEqual(tmpEastArray, bad2) {
                    return errors.New("You can't leave 'rev' and 'kylling' together alone")
                }

                if reflect.DeepEqual(tmpEastArray, bad3) || reflect.DeepEqual(tmpEastArray, bad4) {
                    return errors.New("You can't leave 'kylling' and 'korn' together alone")
                }

                if len(strings.Fields(boat)) > 2 {
                    return errors.New("You cant bring more than TWO items/things on the boat")
                }
            }

            east = tmpEast
            boat = boat + " " + item
        }
    }
    return nil 
}

func CrossRiverTo(place string) error {
    if place == "west" {
        // All contents of boat gets put into west
        west = west + boat 
        boat = ""
    } else if place == "east" {
        // All contents of boat gets put into east
        east = east + boat
        boat = ""
    } else {
        return errors.New(fmt.Sprintf("'%s' is an invalid place", place))
    }

    return nil
}
