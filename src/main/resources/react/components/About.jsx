import React from 'react'
import {Link} from 'react-router'

export default class About extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div className="container">
                <div className="well">
                    <h2>Something about EmoLog...</h2>
                </div>
            </div>
        );
    }
}
